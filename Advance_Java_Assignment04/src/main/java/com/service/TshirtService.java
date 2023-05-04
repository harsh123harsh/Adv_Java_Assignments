package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TshirtDao;
import com.entitites.*;

@Service
public class TshirtService {
    
	@Autowired
	TshirtDao td;
	
	public List<tshirtBrand> searchTshirt(String color,String gender,String size,String output){
		List<tshirtBrand> t = td.search(color, gender, size, output);
		return t;
	}
}
