package com.kh.chap04_assist.part02_object.model.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;
import com.kh.chap04_assist.part02_object.model.dao.ObjectsDao;

public class Run {
	public static void main(String[] args) {
		ObjectDao d = new ObjectDao();
		d.fileSave();
		d.fileRead();
		
		ObjectsDao d2 = new ObjectsDao();
		d2.fileSave();
		d2.fileRead();
	}
}
