package com.helix.visa.springboot.vo;

import java.io.Serializable;

public class HelixVisaSpringBootUserVO implements Serializable {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
