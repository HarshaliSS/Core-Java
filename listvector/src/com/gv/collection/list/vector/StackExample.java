package com.gv.collection.list.vector;

import java.util.List;
import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Student> studentList=new Stack<>();
		
		studentList.push(new Student(1,200,"harshali"));
		studentList.push(new Student(1,200,"harshali"));
		studentList.push(new Student(1,200,"harshali"));
		studentList.push(new Student(1,200,"harshali"));
		
		
//		
//		Student poppedElement=studentList.pop();
//		System.out.println(poppedElement);
//		
	for(int i=0;i<studentList.size();i++) {
		studentList.peek();
		if(!studentList.isEmpty())
			System.out.println(studentList.pop());}
			
		
	}

}
