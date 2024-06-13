package com.example.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.entity.Ckin;

/**
 * @Author aureate7
 * @Date 2024年6月4日下午3:10:49
 * @Des 进货信息
 */
public interface ICkinService {

    int delete(String inid);

    int insert(Ckin record);


    List<Ckin> getall();

    Ckin getbyid(String inid);

    boolean update(Ckin record);
    
    List<Ckin> getbyparams(String proid,String inid,String pname,String indate );

}
