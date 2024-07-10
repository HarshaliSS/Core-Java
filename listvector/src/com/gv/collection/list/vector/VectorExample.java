package com.gv.collection.list.vector;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Student> studentList=new Vector<>();
		
		List<Student> studentList1=Arrays.asList(
				new Student(2,200,"Rahul"),
				new Student(2,200,"sagar"),
				new Student(2,200,"Anushka")
				);
				
		
		studentList.add(new Student(1,200,"harshali"));
		
//		Student std1=studentList.get(0);
//		System.out.println(std1);
//		
//		studentList1.addAll(studentList);
//		
//		studentList.removeIf(e->e.getName().equals("harshali"));
//		studentList.forEach(System.out::println);
//		
		studentList.retainAll(studentList1);
		System.out.println(studentList);
	}

}
