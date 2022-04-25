package com.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.Entity.Students;
import com.Entity.Subjects;
import com.Entity.Teachers;



public class HibernateUtil {
static SessionFactory session;
	
	public static SessionFactory buildSessionFactory() {
		
		if(session==null) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Students.class);
			
			cfg.addAnnotatedClass(Teachers.class);
			cfg.addAnnotatedClass(Subjects.class);
			
			session = cfg.buildSessionFactory();
		}
		
		return session;

}
}
