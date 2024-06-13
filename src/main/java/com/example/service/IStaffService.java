package com.example.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.entity.Staff;

/**
 * @Author aureate7
 * @Date 2024年6月4日下午1:58:01
 * @Des 
 */
public interface IStaffService {
//	验证登录信息
	Staff getStaff(String staffid,String pwd);
	
//	修改个人信息
	boolean update(Staff staff);
	
//	查看个人信息
	Staff getbyid(String staffid);
	
//	删除员工信息
	int delete(String staffid);
	
//添加员工
	int insert(Staff staff);
	
//	获取所有员工信息
	List<Staff> getall();
	
	 List<Staff> getbyparams(String staffid,String staffname);
}
