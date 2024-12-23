package com.jbk;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.hibernate.pojo.Mobile;

public class Client {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Mobile.class);
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session Session=factory.openSession();
		//Session.load(Mobile.class,1);
		Criteria criteria=Session.createCriteria(Mobile.class);
		Projection projection1=Projections.property("price");
		Projection projection2=Projections.property("brandname");
		
		ProjectionList p1=Projections.projectionList();
		p1.add(projection1);
		p1.add(projection2);
		criteria.setProjection(p1);  
		
		criteria.add(Restrictions.eq("price", "7000"));
		criteria.add(Restrictions.gt("price", "7000"));
		List<Mobile>l=criteria.list();
		
		for (Mobile mobile : l) {
			System.out.println(mobile);
			
		}
		
		
		
		
		
		

	}

}

