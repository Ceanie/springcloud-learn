package xyz.ceanie.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import xyz.ceanie.entity.Depts;

import java.util.List;

//@FeignClient(value = "MICROSESPRINGCLOUD-DEPT")
@FeignClient(value = "MICROSESPRINGCLOUD-DEPT",fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {

    @GetMapping(value = "/consumer/depts/discovery")
    Object discovery();

    //添加
    @PostMapping(value = "/depts/add")
    boolean addDept(Depts dept) throws Exception;

    //查询
    @GetMapping(value = "/depts/get/{id}")
    Depts findById(@PathVariable("id") Integer id) throws Exception;

    //查询所有
    @GetMapping(value = "/depts/list")
    List<Depts> findAll() throws Exception;
}
