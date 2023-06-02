package com.patternapp.facade.services;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
    public String getAccount(String email) {
        return String.format("Getting the account of %s", email);
    }
}
