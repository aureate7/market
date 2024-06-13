package com.example.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.entity.Kcxx;

/**
 * @Author aureate7
 * @Date 2024年6月4日上午10:51:40
 * @Des 库存信息
 */
public interface IKcxxService {
	int delete(String proid);

    int insert(Kcxx record);

    List<Kcxx> getall();

    Kcxx getbyid(String proid);

    Boolean update(Kcxx record);
    
    Kcxx kcxxWithPro(String proid);
    
    List<Kcxx> kcxxWithPronum();
    
    List<Kcxx> kcxxWithProdata();
    
    List<Kcxx> getbyparams(String proid,String pname);

}
