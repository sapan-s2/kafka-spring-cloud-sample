package com.sjlabs.kafka.example.kafkaspringcloudsample.producer;

import com.sjlabs.kafka.example.kafkaspringcloudsample.SampleMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SampleProducer {

    @Autowired
    StreamBridge streamBridge;

//    If you want a producer to produce at regualar interval use below "supplier" function.By default it publishes every second to kafka topic
//    @Bean("my-producer")
//    public Supplier<String> myProducer() {
//
//        return () -> {
//            String message = "This is a Sample Message";
//            Message<String> message1 = MessageBuilder.withPayload(message).build();
//            log.info("Message Produced, {}",message1.getPayload());
//            return message;
//        };
//    }


    //    To Manually send messages to a Kafka Topic
    public void delegateToSupplier(SampleMessage message) {
//        Message<String> message1 = MessageBuilder.withPayload(message.toString()).build();
        log.info("producing {} ", message.toString());
        streamBridge.send("my-producer-out-0", message);
    }

}
