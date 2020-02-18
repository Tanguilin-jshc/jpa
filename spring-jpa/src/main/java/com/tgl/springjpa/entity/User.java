package com.tgl.springjpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

//使用jpa注解配置映射关系
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
@Entity //告诉jpa这是一个实体类（和数据表映射的类，不是一个普通的javabean)
@Table(name = "table_user")//用@Table来指定和哪个数据表进行对应，如果省略默认是user
public class User {

    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;

    @Column(name= "name",length = 50) //这是和数据表对应的一个列,省略默认列名就是属性名
    private String  name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
