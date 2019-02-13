package xyz.ceanie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //表示本服务启动后会自动的注入到Eureka服务列表汇中
public class DeptComsumer80_Spring {

    public static void main(String[] args){
        SpringApplication.run(DeptComsumer80_Spring.class,args);
    }
}
