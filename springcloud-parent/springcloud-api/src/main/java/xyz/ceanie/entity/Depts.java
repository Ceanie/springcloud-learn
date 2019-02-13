package xyz.ceanie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@AllArgsConstructor//全参数构造函数
@NoArgsConstructor //空参数的构造函数
@Data//自动生成get set
@Accessors(chain=true)//链表的访问
public class Depts implements Serializable {

    //主键
    private Integer did;
    //名称
    private String dname;
    //数据库   因为微服务架构可以有自己独立的数据库,也就是说不同的微服务存入的数据库是不一致的
    private String db_source;

}
