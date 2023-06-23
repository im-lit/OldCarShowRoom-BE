package com.example.oldcarshowroom.mail.controller;


import com.example.oldcarshowroom.mail.service.EMailService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class MailController {

    @Autowired
    private EMailService emailService;


    @PostMapping("/sendmailtobuyer")
    public String sendMailToBuyer(@RequestParam int buyCarRequestID) {
        String status = emailService.sendMailToBuyer(buyCarRequestID);
        return status;
    }

    @PostMapping("/sendmailtosaler")
    public String sendMailToSaler(@RequestParam int saleCarRequestID) {
        String status = emailService.sendMailToSaler(saleCarRequestID);
        return status;
    }

    @PostMapping("/sendmailtosalertotransfer")
    public String sendMailToSalerToTransfer(@RequestParam int buyCarRequestID) {
        String status = emailService.sendMailToSalerToTransfer(buyCarRequestID);
        return status;
    }


}
