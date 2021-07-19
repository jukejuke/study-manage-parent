package com.juke.studymanageapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Map<String,Object> test(){
        Map<String,Object> retMap = new HashMap<String, Object>();
        retMap.put("code",-1);
        retMap.put("msg","SUCCESS");

        return  retMap;
    }
}
