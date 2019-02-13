package xyz.ceanie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.ceanie.entity.Depts;
import xyz.ceanie.service.DeptClientService;

import java.util.List;

@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/depts/discovery")
    public Object discovery(){
        return this.deptClientService.discovery();
    }

    //添加
    @RequestMapping(value = "/consumer/depts/add")
    public boolean addDept(Depts dept) throws Exception{
        return this.deptClientService.addDept(dept);
    };

    //查询
    @RequestMapping(value = "/consumer/depts/get/{id}")
    public Depts findById(@PathVariable("id") Integer id) throws Exception{
        return this.deptClientService.findById(id);
    };

    //查询所有
    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/depts/list")
    public List<Depts> findAll() throws Exception{
        return this.deptClientService.findAll();
    };

}
