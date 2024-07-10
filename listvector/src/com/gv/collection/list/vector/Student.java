

package com.gv.collection.list.vector;

public class Student implements Comparable<Student> {
	public int Id;
	public int Fees;
	public String Name;
	public Student(int id, int fees, String name) {
		super();
		Id = id;
		Fees = fees;
		Name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getFees() {
		return Fees;
	}
	public void setFees(int fees) {
		Fees = fees;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Fees=" + Fees + ", Name=" + Name + ", getId()=" + getId() + ", getFees()="
				+ getFees() + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.Id, o.Id );
	}
	
	

}
