package xyz.ceanie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7002_Spring {

    public static void main(String[] args){
        SpringApplication.run(EurekaServer7002_Spring.class,args);
    }
}
