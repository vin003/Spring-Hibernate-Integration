package com.durgasoft.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.durgasoft.entity.Employee;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = factory.createEntityManager() ; 
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
	//	entityTransaction.begin();
		
		/*Employee emp = new Employee();
		emp.setEno(111);
		emp.setEname("CCC");
		emp.setEsal(5000);
		emp.setEaddr("HYd");
		entityManager.persist(emp);
		System.out.println("Employee record inserted successfully ");
		
		*/
		
	/*	System.out.println("Searching operation                 >>>>>>>>");
		Employee emp = entityManager.find(Employee.class, 111);
		if ( emp == null)
		{
			System.out.println("Employee Do not exist");
		}
		else
		{
			System.out.println("Employee Details");
			System.out.println("---------------------------");
			System.out.println("Employe No                  : "+emp.getEno());
			System.out.println("Employe Name                : "+emp.getEname());
			System.out.println("Employe Salary              : "+emp.getEsal());
			System.out.println("Employe Address             : "+emp.getEaddr());
			System.out.println();
		}
		
		System.out.println("Searchin operation                  complete >>>>>>>>>>");
		//entityTransaction.commit(); 
		
	*/	
	
		
		/*System.out.println("Update Operation . >>>>>>>>>>>>>>>>");
		entityTransaction.begin();
		Employee emp  = (Employee) entityManager.find(Employee.class, 111);
		if (emp != null)
		{
			emp.setEname("BBB");
			emp.setEsal(6000);
			emp.setEaddr("Pune");
			System.out.println("Updation Operation completed.................");
		}

		
		entityTransaction.commit();
		entityManager.close();
	
*/
		
		System.out.println("Remove Operation .............");
		entityTransaction.begin();
		Employee emp = entityManager.find(Employee.class, 111);
		if ( emp!=null)
		entityManager.remove(emp);
		
		
		entityTransaction.commit();
		entityManager.close();
		
		
		System.out.println("Remove Operation completed >>>>>>>>>>>>>>>>>>>>>");
		
	}

}
