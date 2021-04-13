package com.durgasoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.omg.CORBA.portable.ApplicationException;

import com.durgasoft.entities.Employee;

public class Test {

	public static void main(String[] args) {
		Configuration cfg=null ; 
		Session s=null;
		SessionFactory sf = null ;
		Transaction tx=null ;
	
 try {
	
 
		 cfg = new Configuration();
		 cfg.configure("/com/durgasoft/resources/Hibernate-cfg.xml") ;
		sf = cfg.buildSessionFactory() ; 
		 s = sf.openSession() ;
		// tx = s.beginTransaction();
		
		Employee emp = new Employee() ;		
		emp.setEno(111);
		emp.setEname("AAA");
		emp.setEsal(5000);
		emp.setEaddr("Hyd");
		s.update(emp);
		//s.saveOrUpdate(emp);
		//s.delete(emp) ;
		//s.save(emp); 
		
		
	//	tx.commit();
		System.out.println("Employee Recored Added sucessfully.");
		

	}catch (Exception e) {
		//tx.rollback();
			System.out.println("Databse operation Fialed");
		}
 finally{
	 
	 s.close();
		sf.close();
	 
 }
 

	}

}
