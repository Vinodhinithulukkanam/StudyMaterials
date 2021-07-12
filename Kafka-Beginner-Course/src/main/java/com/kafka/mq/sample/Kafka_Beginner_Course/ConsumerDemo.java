package com.kafka.mq.sample.Kafka_Beginner_Course;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ConsumerDemo {

	public static void main(String[] args) {
		
		Logger logs=LoggerFactory.getLogger(ProducerDemoWithKey.class);
		//Set properties
		Properties config=new Properties();
		config.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		config.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		config.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		config.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "my-java-group");
		config.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		//create consumer
		
		KafkaConsumer< String, String> consumer=new KafkaConsumer<>(config);
				
		//subscribe consumer
		consumer.subscribe(Arrays.asList("java-new-topic","java-topic"));
		
		//read from consumer
		while(true){
			ConsumerRecords<String, String> rec=consumer.poll(Duration.ofMillis(100));
			
			for (ConsumerRecord<String, String> consumerRecord : rec) {
				logs.info("/nTopic :"+consumerRecord.topic()+"partition :"+consumerRecord.partition()+"Key : "+consumerRecord.key()+"Value :"+consumerRecord.value());
				
			}	
		}
		
		
	}

}
