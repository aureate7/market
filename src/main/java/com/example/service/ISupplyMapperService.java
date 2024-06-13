package com.example.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.entity.Supply;

/**
 * @Author aureate7
 * @Date 2024年6月4日上午10:16:56
 * @Des 
 */
public interface ISupplyMapperService {

    int delete(String supid);

    int insert(Supply record);

    List<Supply> getall();

    Supply getbyid(String supid);

    boolean update(Supply record);
    List<Supply> getbyparams(String supid, String suppname);
}
