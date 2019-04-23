package com.example.serviceconsumption.remote.hystrix;

import com.example.serviceconsumption.remote.HelloRemote;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String gethello(String name) {
        return "hello "+name+"消息发送失败，进入熔断器";
    }
}
