package com.example.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CkretireMapper;
import com.example.entity.Ckretire;
import com.example.service.ICkretireService;

/**
 * @Author aureate7
 * @Date 2024年6月4日上午9:38:16
 * @Des 
 */
@Service
public class CkretireServiceImp implements ICkretireService {
	
	@Autowired
	CkretireMapper ckretireMapper;
	public int delete(String inid) {
		// TODO Auto-generated method stub
		return ckretireMapper.deleteByPrimaryKey(inid);
	}

	public int insert(Ckretire record) {
		// TODO Auto-generated method stub
		return ckretireMapper.insert(record);
	}

	public List<Ckretire> getall() {
		// TODO Auto-generated method stub
		return ckretireMapper.selectByExample(null);
	}

	public Ckretire getbyid(String inid) {
		// TODO Auto-generated method stub
		return ckretireMapper.selectByPrimaryKey(inid);
	}

	public Boolean update(Ckretire record) {
		// TODO Auto-generated method stub
		return ckretireMapper.updateByPrimaryKey(record);
	}

	public List<Ckretire> getbyparams(String proid, String inid, String pname, String retdate) {
		// TODO Auto-generated method stub
		return ckretireMapper.getbyparams(proid, inid, pname, retdate);
	}

}
