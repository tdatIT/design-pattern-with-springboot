package com.patternapp.facade.facade;


import com.patternapp.facade.services.*;
import org.springframework.stereotype.Service;

@Service
public class ShopFacade {
    private final AccountService accountService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;
    private final EmailService emailService;
    private final SmsService smsService;

    public ShopFacade(AccountService accountService, PaymentService paymentService, ShippingService shippingService,
                      EmailService emailService, SmsService smsService) {
        this.accountService = accountService;
        this.paymentService = paymentService;
        this.shippingService = shippingService;
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public String buyProductByCashWithFreeShipping(String email) {
        return String.format("%s\n%s\n%s\n%s", accountService.getAccount(email),
                paymentService.paymentBy("cash"), shippingService.getShipping("free"), emailService.sendMail(email));
    }

    public String buyProductByPaypalWithStandardShipping(String email, String mobilePhone) {

        return String.format("%s\n%s\n%s\n%s\n%s",
                accountService.getAccount(email),
                paymentService.paymentBy("paypal"),
                shippingService.getShipping("standard"),
                emailService.sendMail(email),
                smsService.sendSMS(mobilePhone));
    }
}
