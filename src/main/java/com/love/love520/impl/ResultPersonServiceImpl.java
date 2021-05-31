package com.love.love520.impl;

import com.love.love520.bean.ResultPerson;
import com.love.love520.service.ResultPersonService;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
public class ResultPersonServiceImpl implements ResultPersonService {
    InetAddress ia=null;



    @Override
    public ResultPerson getResultPersonByName(String name) {
        try {
            ia = ia.getLocalHost();
        } catch (UnknownHostException unknownHostException) {
            unknownHostException.printStackTrace();
        }
        String localIp=ia.getHostAddress();
        String baseUrl = "http://" + localIp + ":8080/api/";
        ResultPerson resultPerson = new ResultPerson(baseUrl + "gg.jpg");
        if("杨才钰".equals(name)){

            resultPerson.setimg(baseUrl + "ch.jpg");
        }
        return resultPerson;
    }
}
