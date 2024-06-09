package com.example.service;
/**
 * @Author Binvor
 * @Date 2019年3月18日下午2:18:57
 * @Des 商品接口类
 */

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.entity.Product;
import com.example.entity.ProductExample;

public interface IProductService {
    int deleteByPrimaryKey(String proid);
    int insert(Product record);
    List<Product> selectByExample(ProductExample example);
    public List<Product> getlist();
    Product selectByPrimaryKey(String proid);
    List<Product> getbyparams( String proid,String supname,String pname,String protype );
    boolean updateByPrimaryKey(Product record);
    }
