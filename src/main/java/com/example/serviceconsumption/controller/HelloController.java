package com.example.serviceconsumption.controller;

import com.example.serviceconsumption.mapper.BumenMapper;
import com.example.serviceconsumption.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @Autowired
    BumenMapper bumenMapper;

    @RequestMapping("chello")
    public String hello(String name){
        return  "这里是调用服务返回的："+helloRemote.gethello(name);
    }

    @RequestMapping("bumen/getlistAll")
   // @Transactional
    public String getlist(String name){
       try{
           //TxcContext.bind(name, null);
           System.out.println("xid:"+name);
           bumenMapper.updateMoney();
           // System.out.println(1/0);
       }finally {
           //TxcContext.unbind();
       }

        return "成功";
    }

}
