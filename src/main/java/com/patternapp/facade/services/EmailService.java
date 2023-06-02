package com.patternapp.facade.services;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public String sendMail(String mailTo) {
        return ("Sending an email to " + mailTo);
    }
}
