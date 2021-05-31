package com.love.love520.bean;

import org.springframework.stereotype.Component;

public class ResultPerson {
    private String img;

    public String getimg() {
        return img;
    }

    public void setimg(String img) {
        this.img = img;
    }

    public ResultPerson(String img) {
        this.img = img;
    }
}
