package xyz.ceanie.service;

import xyz.ceanie.dao.DeptDao;
import xyz.ceanie.entity.Depts;

import java.util.List;

public interface DeptService {

    //添加
    boolean addDept(Depts dept) throws Exception;

    //查询
    Depts findById(Integer id) throws Exception;

    //查询所有
    List<Depts> findAll() throws Exception;

}
