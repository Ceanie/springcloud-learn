package xyz.ceanie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient  //表示本服务启动后会自动的注入到Eureka服务列表汇中
@EnableFeignClients(basePackages = {"xyz.ceanie"})  //开启使用Feign接口的调用的方式
public class DeptComsumer_Feign_Spring {

    public static void main(String[] args){
        SpringApplication.run(DeptComsumer_Feign_Spring.class,args);
    }
}
