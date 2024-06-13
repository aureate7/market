package com.example.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CkinMapper;
import com.example.entity.Ckin;
import com.example.service.ICkinService;

/**
 * @Author aureate7
 * @Date 2024年6月4日下午3:25:06
 * @Des 
 */
@Service
public class CkinServiceImp implements ICkinService{
	@Autowired
	CkinMapper ckinMapper;
	public int delete(String inid) {
		// TODO Auto-generated method stub
		return ckinMapper.deleteByPrimaryKey(inid);
	}

	public int insert(Ckin record) {
		// TODO Auto-generated method stub
		return ckinMapper.insert(record);
	}

	public List<Ckin> getall() {
		// TODO Auto-generated method stub
		return ckinMapper.selectByExample(null);
	}

	public Ckin getbyid(String inid) {
		// TODO Auto-generated method stub
		return ckinMapper.selectByPrimaryKey(inid);
	}

	public boolean update(Ckin record) {
		// TODO Auto-generated method stub
		return ckinMapper.updateByPrimaryKey(record);
	}

	public List<Ckin> getbyparams(String proid, String inid, String pname, String indate) {
		// TODO Auto-generated method stub
		return ckinMapper.getbyparams(proid, inid, pname, indate);
	}


}
