package com.helix.visa.springboot.controller;

import com.helix.visa.springboot.vo.HelixVisaSpringBootUserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelixVisaSpringBootUserController {

    @GetMapping("/user/{userName}")
    public HelixVisaSpringBootUserVO getUserByUserName(@PathVariable String userName){
        HelixVisaSpringBootUserVO helixVisaSpringBootUserVO = new HelixVisaSpringBootUserVO();
        helixVisaSpringBootUserVO.setUserName(userName);

        return helixVisaSpringBootUserVO;
    }
}
