package com.sjlabs.kafka.example.kafkaspringcloudsample.endpoint;


import com.sjlabs.kafka.example.kafkaspringcloudsample.SampleMessage;
import com.sjlabs.kafka.example.kafkaspringcloudsample.producer.SampleProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SampleController {
    @Autowired
    SampleProducer sampleProducer;

    @PostMapping("/produce-sample")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delegateToSupplier(@RequestBody SampleMessage body) {
        log.info("Sending {}" , body);
        sampleProducer.delegateToSupplier(body);

    }
}
