package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	private Employee e = new Employee();
	
	public void add(int empNo, String name, char gender, String phone ) {
		 e =  new Employee(empNo,name,gender,phone);
	}

	public void add(int empNo, String name, char gender, String phone, String dept,int salary, double bonus) {
		e = new Employee(empNo,name,gender,phone,dept,salary,bonus);
	}
	public void modify (String phone) {
		e.setPhone(phone);
	}
	
	public void modify(int salary) {
		e.setSalary(salary);
	}
	public void modify (double bonus) {
		e.setBonus(bonus);
	}
	public Employee remove() {//백업을 해야한다,,? 그래야지 결과값을 쓸수 있다??
		Employee del=e;
		e= null;
		return del;
	}
	public String inform() {
	
		if(e==null) {
			return null;
		}
		return e.printEmployee();
	}
}
