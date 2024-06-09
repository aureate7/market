package com.example.service;

import java.util.List;

import com.example.entity.Custom;
import com.example.entity.CustomExample;

public interface ICustomService {
	 int delete(String cusid);

	    int insert(Custom record);

	    List<Custom> selectByExample(CustomExample example);

	    Custom getByid(String cusid);

	    boolean update(Custom record);
	    
	    List<Custom> getlist();
	    
	    List<Custom> getbyparams(String cusid,String cusname);
}
