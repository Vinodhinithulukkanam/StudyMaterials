package com.kafka.mq.sample.Kafka_Beginner_Course;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.kafka.clients.producer.Callback;

/**
 * Hello world!
 *
 */
public class ProducerDemoWithKey  implements Callback
{
	Logger logs=LoggerFactory.getLogger(ProducerDemoWithKey.class);
	
    public static void main( String[] args ) throws InterruptedException, ExecutionException
    {
        //STEP 1: Create producer properties.we can find them in kafka documentation https://kafka.apache.org/24/documentation.html#producerconfigs
    	Properties configs=new Properties();
    	configs.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
    	//Kafka read data in serialized form i.e byte code if we want to write data in string we should add srtingserializer
    	configs.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
    	configs.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
    	// create producer
    	
    	KafkaProducer<String, String> producer=new KafkaProducer<String, String>(configs);
    	
    	//Create producer record
    	for(int i=0;i<10;i++){
    		String topic="vinodhini-topic";
    		String value="Hello world "+Integer.toString(i);
    		String key="ID_KEY"+Integer.toString(i);
    	ProducerRecord<String, String> rec=new ProducerRecord<String, String>(topic, key, value);
    	
    	//Callback we can add to get info about our producer
    	Callback prodLog=new ProducerDemoWithKey();
    	//send data in producer asynchronously
    	producer.send(rec,prodLog);
    	
    	}
    	//Flush to send data to kafka
    	producer.flush();
    	producer.close();
    }

	@Override
	public void onCompletion(RecordMetadata recdata, Exception e) {
		
		if(e!=null){
			logs.error("Error while producing ",e);
			
		}else{
			
			logs.info("\n Topic : "+recdata.topic()+"\n"+ "Partition : "+recdata.partition()+"\n"+"Offset : "+recdata.offset());
			
		}
		
	}


}
