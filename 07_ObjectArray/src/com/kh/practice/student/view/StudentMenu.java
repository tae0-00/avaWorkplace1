package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController smm =new StudentController();
	
	public void studentMenu() {
		System.out.println("====학생 정보 출력=====");
		
	    //Student [] arr =smm.printStudent(); 
		for(int i=0; i<smm.printStudent().length; i++) {
			System.out.println(smm.printStudent());
		}
		System.out.println("====학생 성적 출력=====");
		double [] dArr = smm.avgScore();
		
			
		System.out.println("학생점수 합계 : "+(int)dArr[0]);
			
		System.out.println("학생 점수 평균 :"+dArr[1]);
		
		smm.avgScore();
		System.out.println("====성적 결과 출력=====");
	for(Student s :arr) {
		System.out.println(s.getName()+"은"+(
				s.getScore()<StudentController.CUT_LINE);
	}
	
		
		
	}
}
