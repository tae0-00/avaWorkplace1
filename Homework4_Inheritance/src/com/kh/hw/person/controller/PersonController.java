package com.kh.hw.person.controller;


import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	private Student[] s= new Student[3];
	private Employee[] e = new Employee[10];
	
	public int []  personCount() {
		//새로운 배열을 먼저 만드는 방법을 활용하면 리턴하기가 편함
		int [] arr= new int [2];
		int scount=0;
		int ecount=0;
		for(int i=0; i<s.length; i++) {
			if(s[i]!=null) {
				scount++;
			}
		}
		for(int i=0; i<e.length; i++) {
			if(e[i]!=null) {
				ecount++;
			}
		}
		return new int [] {scount,ecount};
	}
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i=0; i<s.length; i++) {//여기서는 향상된 반복문 쓰면 안돼
			if(s[i]==null) {//빈곳 발견
				s[i]=new Student(name, age, height, weight, grade, major);//입력값 집어넣어
				//Student std [] =new =new Student(name, age, height, weight, grade, major);
				//하고 그냥 std로 해도ㅗ담
				break;
			}
		}
	}
	public Student [] printStudent() {
			return s;
	}
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i=0; i<e.length; i++) {
			if(e[i]==null) {
				e[i]=new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
	}
	public Employee[] printEmployee() {
		return e;
	}
			
}

