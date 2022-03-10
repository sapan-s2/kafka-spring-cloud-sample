package com.sjlabs.kafka.example.kafkaspringcloudsample.consumer;

import com.sjlabs.kafka.example.kafkaspringcloudsample.SampleMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Slf4j
@Component
public class SampleConsumer {

//    @Bean
//    public Consumer<Message> consumer() {
//        return message -> log.info("received {}" , message.getPayload().toString());
//    }

    @Bean
    public Consumer<Message<SampleMessage>> customerBinding() {
        return msg -> {
            log.info("received {}", msg.getPayload() );
        };
    }


}
