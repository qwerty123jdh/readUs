package com.connections;

public class Employee extends Person {
 private double empSalary;
 private int empId;
 public Employee() {
	// TODO Auto-generated constructor stub
	 super();
	 empId=0;
	 empSalary=1000;
	 
}
 public Employee(int empId, double empSalary,int age, String name)
 {
	 super(age,name);
	 this.empId=empId;
	 this.empSalary=empSalary;
 }
 public void display(int x)
 {
	 super.display();
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

public void show()
{
	display();
System.out.println(empId + "\t" + empSalary);
}

 //@Override
 public String toString()
 {
	 return super.toString()+  empId + " " + empSalary;
 }
 
}
