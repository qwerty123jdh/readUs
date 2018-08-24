
public class Employee {
private int empId;
private double salary;
private String empName;
private String companyName;

public Employee()
{
	empId=10;
	empName="city";
	salary=1000;
	companyName="city LTD";
}
public Employee (int empId, String empName, double salary)
{
	this();
	this.empId=empId;
	this.empName=empName;
	this.salary=salary;
	this.companyName="city LTD";
	}
public void display()
{
System.out.println(empName+"\t"+empId+"\t"+companyName);	
}
public static void main(String[]args)
{
Employee emp=new Employee(1200,"empname1",12000d);
emp.display();
}

}
