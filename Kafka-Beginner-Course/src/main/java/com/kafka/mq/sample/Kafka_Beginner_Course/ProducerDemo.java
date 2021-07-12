package com.kafka.mq.sample.Kafka_Beginner_Course;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

/**
 * Hello world!
 *
 */
public class ProducerDemo 
{
    public static void main( String[] args )
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
    	ProducerRecord<String, String> rec=new ProducerRecord<String, String>("java-topic", "Hello world");
    	
    	//send data in producer
    	producer.send(rec);
    	
    	//Flush to send data to kafka
    	producer.flush();
    	producer.close();
    }
}
