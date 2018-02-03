package com.alipay.glassy.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;



@RestController
public class IndexController {

    @RequestMapping("/index")
    public  Map<String,Object>  index(Map<String,Object> map){
        map.put("ss","ssss");
        return map;
    }

}
