package com.example.serviceconsumption.remote;

import com.example.serviceconsumption.remote.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * name:远程服务名，及spring.application.name配置的名称
 * 此类中的方法和远程服务中contoller中的方法名和参数需保持一致
 */

//@FeignClient("spring-cloub-producer")
//添加指定fallback类，在服务熔断的时候返回fallback类中的内容。
@FeignClient(name="spring-cloub-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "api-p/hello")
    public String gethello(@RequestParam(value = "name") String name);
}
