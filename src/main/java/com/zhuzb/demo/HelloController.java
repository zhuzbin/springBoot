package com.zhuzb.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Girl girl;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String Hello(){
        return girl.getCupSize()+"-----------"+girl.getAge();
    }
}
