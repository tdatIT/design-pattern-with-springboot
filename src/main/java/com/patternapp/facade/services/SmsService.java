package com.patternapp.facade.services;

import org.springframework.stereotype.Service;

@Service
public class SmsService {
    public String sendSMS(String mobilePhone) {
        return ("Sending an mesage to " + mobilePhone);
    }
}
