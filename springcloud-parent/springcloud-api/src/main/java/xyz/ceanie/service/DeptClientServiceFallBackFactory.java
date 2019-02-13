package xyz.ceanie.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import xyz.ceanie.entity.Depts;

import java.util.List;

@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Object discovery() {
                return null;
            }

            @Override
            public boolean addDept(Depts dept) throws Exception {
                return false;
            }

            @Override
            public Depts findById(Integer id) throws Exception {
                return new Depts().setDid(id).setDname("当前id："+id+"没有对应的信息，null-@hystrixCommand").setDb_source("No this is dbSource in mysql");
            }

            @Override
            public List<Depts> findAll() throws Exception {
                return null;
            }
        };
    }

}
