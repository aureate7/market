package com.example.dao;

import org.apache.ibatis.annotations.Param;

import com.example.entity.Manager;


public interface ManagerMapper {
	
   Manager getbyid(@Param("managerid") String managerid);
   
   boolean update(Manager manager);
   
   Manager getmanager(String managerid);
	
}