package xyz.ceanie.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import xyz.ceanie.entity.Depts;
import xyz.ceanie.service.DeptService;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @GetMapping(value="/depts/discovery")
    public Object discovery(){
        //进行盘点Eureka有多少个微服务，后续工作有很多个订单，如订单
        List<String> services=client.getServices();
        System.out.println("------"+services+"------");
        //就在这个盘点Eureka的微服务中寻找MICROSESPRINGCLOUD-DEPT
        List<ServiceInstance> instances=client.getInstances("MICROSESPRINGCLOUD-DEPT");
        for (ServiceInstance serviceInstance:instances){
            System.out.println("微服务的ID"+serviceInstance.getServiceId());
            System.out.println("主机名称"+serviceInstance.getHost());
            System.out.println("端口"+serviceInstance.getPort());
            System.out.println("微服务的地址"+serviceInstance.getUri());
        }
        return this.client;
    }

    //添加
    @PostMapping(value = "/depts/add")
    public boolean addDept(@RequestBody Depts dept) throws Exception{
        return deptService.addDept(dept);
    };

    //查询
    @GetMapping(value = "/depts/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrix_Get")
    public Depts findById(@PathVariable("id") Integer id) throws Exception{
        Depts depts=deptService.findById(id);
        if(null==depts){
            throw new RuntimeException("当前id："+id+"没有对应的信息");
        }
        return depts;
    };

    public Depts hystrix_Get(@PathVariable Integer id){
        return new Depts().setDid(id).setDname("当前id："+id+"没有对应的信息，null-@hystrixCommand").setDb_source("No this is dbSource in mysql1");

    }

    //查询所有
    @GetMapping(value = "/depts/list")
    public List<Depts> findAll() throws Exception{
        return deptService.findAll();
    };

}
