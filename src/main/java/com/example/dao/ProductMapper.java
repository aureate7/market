package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.entity.Product;
import com.example.entity.ProductExample;

public interface ProductMapper {
    int deleteByPrimaryKey(String proid);

    int insert(Product record);


    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(String proid);

    boolean updateByPrimaryKey(Product record);
//    多条件查询
    List<Product> getbyparams(@Param("proid") String proid,@Param("supname")String supname,@Param("pname")String pname,@Param("protype")String protype );
}