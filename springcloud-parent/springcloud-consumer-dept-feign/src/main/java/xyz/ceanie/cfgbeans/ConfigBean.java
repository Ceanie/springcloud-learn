package xyz.ceanie.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//替代之前Spring的application.xml文件  这里使用的注解版本
@Configuration
public class ConfigBean {

    /**
     * 这里的bean相当于之前配置Spring中的<bean id="" class=""></bean>
     * @return
     */
    @Bean
    @LoadBalanced  //表示客户在访问的时候带上负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myIRule(){
        // return new RoundRobinRule();//默认轮询
        return new RandomRule();// 随机
    }
}
