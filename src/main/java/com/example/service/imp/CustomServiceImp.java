package com.example.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomMapper;
import com.example.entity.Custom;
import com.example.entity.CustomExample;
import com.example.service.ICustomService;

@Service
public class CustomServiceImp implements ICustomService{
	
	@Autowired
	CustomMapper customMapper;
	public int delete(String cusid) {
		// TODO Auto-generated method stub
		return customMapper.deleteByPrimaryKey(cusid);
	}

	public int insert(Custom record) {
		// TODO Auto-generated method stub
		return customMapper.insert(record);
	}

	public List<Custom> selectByExample(CustomExample example) {
		// TODO Auto-generated method stub
		return customMapper.selectByExample(example);
	}

	public Custom getByid(String cusid) {
		// TODO Auto-generated method stub
		return customMapper.selectByPrimaryKey(cusid);
	}

	public boolean update(Custom record) {
		// TODO Auto-generated method stub
		return customMapper.updateByPrimaryKey(record);
	}

	public List<Custom> getlist() {
		// TODO Auto-generated method stub
		return customMapper.selectByExample(null);
	}

	public List<Custom> getbyparams(String cusid, String cusname) {
		// TODO Auto-generated method stub
		return customMapper.getbyparams(cusid, cusname);
	}

}
