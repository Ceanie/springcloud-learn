package xyz.ceanie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer_client_7001_Spring {

    public static void main(String[] args){
        SpringApplication.run(EurekaServer_client_7001_Spring.class,args);
    }
}
