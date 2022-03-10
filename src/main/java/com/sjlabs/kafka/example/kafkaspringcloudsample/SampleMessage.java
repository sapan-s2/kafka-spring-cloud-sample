package com.sjlabs.kafka.example.kafkaspringcloudsample;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SampleMessage {

    private String id;
    private String name;
    private String city;
}
