package com.example.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.TypeMapper;
import com.example.entity.Type;
import com.example.service.ITypeService;

/**
 * @Author aureate7
 * @Date 2024年6月9日下午2:26:32
 * @Des 类别管理实现
 */
@Service
public class TypeServiceImp  implements ITypeService{
	@Autowired
	TypeMapper typeMapper;
	public int delete(String protypeid) {
		// TODO Auto-generated method stub
		return typeMapper.deleteByPrimaryKey(protypeid);
	}

	public int insert(Type record) {
		// TODO Auto-generated method stub
		return typeMapper.insert(record);
	}

	public List<Type> getall() {
		// TODO Auto-generated method stub
		return typeMapper.selectByExample(null);
	}

	public Type selectByid(String protypeid) {
		// TODO Auto-generated method stub
		return typeMapper.selectByPrimaryKey(protypeid);
	}

	public boolean update(Type record) {
		// TODO Auto-generated method stub
		return typeMapper.updateByPrimaryKey(record);
	}

	public List<Type> getbyparams(String protypeid, String typename) {
		// TODO Auto-generated method stub
		return typeMapper.getbyparams(protypeid, typename);
	}
	
}
