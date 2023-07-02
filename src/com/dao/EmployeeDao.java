package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
import com.bean.Employee;

public class EmployeeDao {
	
	private HibernateTemplate ht;


	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	
	//Insertion
	public int insertEmp(Employee e)
	{
		
		return (int )ht.save(e);
	}
	//updation
	public int updateEmp(String n,float s)
	{
		return ht.bulkUpdate("update Employee Set salary="+s+" where name='"+n+"'");
	}
	//deletion
	public int deleteEmp(String n)
	{
		return ht.bulkUpdate("delete from Emplyee where name='"+n+"'");
	}
	//fetch=100
	public List<Employee> fetchEmp()
	{
		return ht.loadAll(Employee.class);
		
	}
	
	
	

}
