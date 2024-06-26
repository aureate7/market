package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.entity.Custom;
import com.example.entity.CustomExample;

public interface CustomMapper {
    int deleteByPrimaryKey(String cusid);

    int insert(Custom record);

    List<Custom> selectByExample(CustomExample example);

    Custom selectByPrimaryKey(String cusid);

    boolean updateByPrimaryKey(Custom record);
    List<Custom> getbyparams(@Param("cusid") String cusid,@Param("cusname") String cusname);
}