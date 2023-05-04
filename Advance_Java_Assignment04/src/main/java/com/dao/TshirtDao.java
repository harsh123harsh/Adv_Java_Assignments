package com.dao;

import java.util.*;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entitites.tshirtBrand;

@Repository
public class TshirtDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
//	@Transactional
//	public String saveTshirt(tshirtBrand tshirt) {
//		String str = (String) this.hibernateTemplate.save(tshirt);
//		return str;
//	}
	
	@Transactional
	public List<tshirtBrand> search(String color,String gender,String size,String output){
		String query = "";
		Session s = hibernateTemplate.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		if(output.equalsIgnoreCase("price")) {
			query = "from tshirtBrand where COLOUR = :x AND "
			   		+ "GENDER_RECOMMENDATION = :y AND SIZE = :z AND "
			   		+ "AVAILABILITY = 'Y' ORDER BY PRICE";
		}else if(output.equalsIgnoreCase("rating")) {
			query = "from tshirtBrand where COLOUR = :x AND "
			   		+ "GENDER_RECOMMENDATION = :y AND SIZE = :z AND "
			   		+ "AVAILABILITY = 'Y' ORDER BY RATING DESC";
		}else {
			query = "from tshirtBrand where COLOUR = :x AND "
			   		+ "GENDER_RECOMMENDATION = :y AND SIZE = :z AND "
			   		+ "AVAILABILITY = 'Y' ORDER BY RATING DESC,PRICE ASC";
		}
		
		Query q = s.createQuery(query);
		 q.setParameter("x",color);
		   q.setParameter("y",gender);
		   q.setParameter("z",size);
		   ArrayList<tshirtBrand> list = (ArrayList<tshirtBrand>) q.list();
		   
		   return list;
		
	}
	
}
