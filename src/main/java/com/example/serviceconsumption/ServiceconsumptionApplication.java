package com.example.serviceconsumption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient //启用服务注册与发现 推荐的注册中心是 eureka
@SpringBootApplication
@EnableDiscoveryClient //启用服务注册与发现 注册中心可以是其他的，比如 zookeeper
@EnableFeignClients //启用feign进行远程调用
public class ServiceconsumptionApplication {

	public static void main(String[] args) {
        System.out.println("程序启动 start");
		SpringApplication.run(ServiceconsumptionApplication.class, args);
        System.out.println("程序启动 end");
	}

	/*Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。使用Feign，
	只需要创建一个接口并注解。它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。
	Feign支持可插拔的编码器和解码器。
	Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
	简而言之：
	Feign 采用的是基于接口的注解
	Feign 整合了ribbon，具有负载均衡的能力
	整合了Hystrix，具有熔断的能力*/

}
