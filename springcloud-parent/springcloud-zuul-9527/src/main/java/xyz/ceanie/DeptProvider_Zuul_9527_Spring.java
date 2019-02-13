package xyz.ceanie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy  //启动zull相关的代理作用
@EnableEurekaClient  //表示本服务启动后会自动的注入到Eureka服务列表汇中
@EnableFeignClients(basePackages = {"xyz.ceanie"})  //开启使用Feign接口的调用的方式
public class DeptProvider_Zuul_9527_Spring {

    public static void main(String[] args){
        SpringApplication.run(DeptProvider_Zuul_9527_Spring.class,args);
    }
}
