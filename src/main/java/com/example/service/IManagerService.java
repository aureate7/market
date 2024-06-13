package com.example.service;

import org.apache.ibatis.annotations.Param;

import com.example.entity.Manager;

/**
 * @Author aureate7
 * @Date 2024年6月4日下午1:31:39
 * @Des 
 */
public interface IManagerService {
	   Manager getbyid( String managerid,String pwd);
	   
	   boolean update(Manager manager);
	   
	   Manager getmanager(String managerid);
}
