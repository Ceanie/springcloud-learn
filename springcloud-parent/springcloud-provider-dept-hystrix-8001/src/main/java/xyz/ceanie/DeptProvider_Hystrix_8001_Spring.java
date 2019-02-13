package xyz.ceanie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //表示本服务启动后会自动的注入到Eureka服务列表汇中
@EnableDiscoveryClient //注册服务发现
@EnableCircuitBreaker //对熔断器的支持
public class DeptProvider_Hystrix_8001_Spring {

    public static void main(String[] args){
        SpringApplication.run(DeptProvider_Hystrix_8001_Spring.class,args);
    }
}
