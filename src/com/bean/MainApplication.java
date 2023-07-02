package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDao;


public class MainApplication {

	public static void main(String[] args) {
		
           ApplicationContext a = new ClassPathXmlApplicationContext("SpringH.xml");
          
           EmployeeDao dao = (EmployeeDao) a.getBean("edao");
           System.out.println("Done");
           Employee e1 = new Employee();
           e1.setName("Nikhil");
           e1.setDesignation("Traineee");
           e1.setSalary(50000);
           
           dao.insertEmp(e1);
           
           
           
           
           
	}

}
