package com.example.service;

import java.util.List;
import java.util.Map;

import com.example.entity.Sale;

public interface ISaleService {
	
	int delete(String saleid);

    int insert(Sale record);


    List<Sale> getall();

    Sale getbyid(String saleid);

    boolean update(Sale record);
    
    List<Sale> getbyparams( String proid,String cusid,String pname,String cusname );
    public List<Map<String,Object>> pieData();

}
