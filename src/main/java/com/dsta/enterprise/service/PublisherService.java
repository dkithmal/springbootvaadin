package com.dsta.enterprise.service;

import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class PublisherService implements Serializable {

    public String publishMessage(String message) {
        //MainQueuePublisher.publishMessage(message);
        return "Submitted";
    }

}
