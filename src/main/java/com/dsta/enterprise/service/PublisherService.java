package com.dsta.enterprise.service;

import com.dsta.enterprise.util.Util;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class PublisherService implements Serializable {

    public String publishMessage(String message) {
        String messageString = Util.getWrappedMessageString(message);
        MainQueuePublisher.publishMessage(messageString);
        return "Submitted";
    }

}
