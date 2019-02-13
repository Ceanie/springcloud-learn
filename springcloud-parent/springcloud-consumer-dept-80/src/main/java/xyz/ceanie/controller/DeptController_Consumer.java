package xyz.ceanie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xyz.ceanie.entity.Depts;

import java.util.List;

@RestController
public class DeptController_Consumer {

    @Value("${REST_URL_PREFIX}")
    private String REST_URL_PREFIX;

    //private static final String REST_URL_PREFIX="http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/depts/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/depts/discovery",Object.class);
    }

    //添加
    @RequestMapping(value = "/consumer/depts/add")
    public boolean addDept(Depts dept) throws Exception{
        return restTemplate.postForObject(REST_URL_PREFIX+"/depts/add",dept,Boolean.class);
    };

    //查询
    @RequestMapping(value = "/consumer/depts/get/{id}")
    public Depts findById(@PathVariable("id") Integer id) throws Exception{
        return restTemplate.getForObject(REST_URL_PREFIX+"/depts/get/"+id,Depts.class);
    };

    //查询所有
    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/depts/list")
    public List<Depts> findAll() throws Exception{
        return restTemplate.getForObject(REST_URL_PREFIX+"/depts/list",List.class);
    };
}
