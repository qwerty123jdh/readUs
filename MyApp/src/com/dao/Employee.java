package com.dao;

public class Employee {
 private double empSalary;
 private int empId;
 private String name;
 public Employee() {
	// TODO Auto-generated constructor stub
	 super();
	 empId=0;
	 empSalary=1000;
	 name = "XXX";
	 
	 
}
 public Employee(int empId, double empSalary, String name)
 {
	
	 this.empId=empId;
	 this.empSalary=empSalary;
	 this.name =name;
 }
 public void display(int x)
 {
	// super.display();
	 System.out.println(empId+"\t"+empSalary);
 }
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void show()
{

System.out.println(empId + "\t" + empSalary);
}

 //@Override
 public String toString()
 {
	 return super.toString()+  empId + " " + empSalary;
 }
 
}
