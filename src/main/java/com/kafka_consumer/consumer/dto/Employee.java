package com.kafka_consumer.consumer.dto;

import lombok.Data;

@Data
public class Employee {

    // to receive msg from publisher
    private String id ;
    private  String name ;
    private  String email ;
    private  String contactNo ;
    private  String designation;
}
