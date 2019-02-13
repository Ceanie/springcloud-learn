package xyz.ceanie.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.ceanie.dao.DeptDao;
import xyz.ceanie.entity.Depts;
import xyz.ceanie.service.DeptService;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Depts dept) throws Exception {
        return deptDao.addDept(dept);
    }

    @Override
    public Depts findById(Integer id) throws Exception {
        return deptDao.findById(id);
    }

    @Override
    public List<Depts> findAll() throws Exception {
        return deptDao.findAll();
    }
}
