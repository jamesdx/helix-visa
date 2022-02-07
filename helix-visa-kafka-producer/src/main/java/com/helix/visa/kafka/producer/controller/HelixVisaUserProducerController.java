package com.helix.visa.kafka.producer.controller;

import com.helix.visa.kafka.producer.service.HelixVisaUserService;
import com.helix.visa.kafka.producer.vo.HelixVisaUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelixVisaUserProducerController {
    @Autowired
    private HelixVisaUserService helixVisaUserService;

    @PostMapping("/user/")
    public void userSignUp(@RequestBody  HelixVisaUserVO helixVisaUserVO){
        helixVisaUserService.createUserAndSendMessageToKafka(helixVisaUserVO);
    }
}
