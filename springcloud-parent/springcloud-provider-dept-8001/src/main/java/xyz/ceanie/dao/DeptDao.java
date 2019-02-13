package xyz.ceanie.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xyz.ceanie.entity.Depts;

import java.util.List;

@Mapper
//@Repository
public interface DeptDao {

    //添加
    boolean addDept(Depts dept) throws Exception;

    //查询
    Depts findById(Integer id) throws Exception;

    //查询所有
    List<Depts> findAll() throws Exception;

}
