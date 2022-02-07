package com.helix.visa.kafka.producer.service;

import com.helix.visa.kafka.producer.vo.HelixVisaUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
public class HelixVisaUserService {
    public final static String KAFKA_TOPIC_USER = "KAFKA_TOPIC_USER";

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public HelixVisaUserVO createUserAndSendMessageToKafka(HelixVisaUserVO helixVisaUserVO){
        kafkaTemplate.send(KAFKA_TOPIC_USER,helixVisaUserVO.toString());
        return helixVisaUserVO;
    }
}
