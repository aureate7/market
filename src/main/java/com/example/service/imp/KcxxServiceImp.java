package com.example.service.imp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CkinMapper;
import com.example.dao.KcxxMapper;
import com.example.entity.Ckin;
import com.example.entity.Kcxx;
import com.example.service.IKcxxService;

/**
 * @Author aureate7
 * @Date 2024年6月4日上午11:07:14
 * @Des 
 */
@Service
public class KcxxServiceImp implements IKcxxService {
	@Autowired
	KcxxMapper kcxxMapper;
	
	@Autowired
	CkinMapper ckinMapper;
	public int delete(String proid) {
		// TODO Auto-generated method stub
		return kcxxMapper.deleteByPrimaryKey(proid);
	}

	public int insert(Kcxx record) {
		// TODO Auto-generated method stub
		return kcxxMapper.insert(record);
	}

	public List<Kcxx> getall() {
		// TODO Auto-generated method stub
		return kcxxMapper.selectByExample(null);
	}

	public Kcxx getbyid(String proid) {
		// TODO Auto-generated method stub
		return kcxxMapper.selectByPrimaryKey(proid);
	}

	public Boolean update(Kcxx record) {
		Ckin ckin = new Ckin();
		ckin.setProid(record.getProid());
		ckin.setIndate(new Date());
		ckin.setNum(record.getNum());
		ckin.setPname(record.getPname());
		ckinMapper.insert(ckin);
		return kcxxMapper.updateByPrimaryKey(record);
	}

	public Kcxx kcxxWithPro(String proid) {
		// TODO Auto-generated method stub
		return kcxxMapper.kcxxWithPro(proid);
	}
	public List<Kcxx> kcxxWithPronum() {
		// TODO Auto-generated method stub
		return kcxxMapper.kcxxWithPronum();
	}

	public List<Kcxx> kcxxWithProdata() {
		// TODO Auto-generated method stub
		return kcxxMapper.kcxxWithProdata();
	}

	public List<Kcxx> getbyparams(String proid, String pname) {
		// TODO Auto-generated method stub
		return kcxxMapper.getbyparams(proid, pname);
	}

	


}
