package com.two;
import java.util.Scanner;

public class Student {


	 String name;
		 int [] marks;
	 int rollNo;
	 public Student()
		{
			
		}
	
	Scanner s =new Scanner (System.in);
	
			
		public Student(String name1, int length, int rollNo1)
		{
		 name=name1;
			for(int i=0;i<length;i++)
			{
				System.out.println("Enter marks");
				marks[i]=s.nextInt();
			}
			
			rollNo=rollNo1;
			
		}
public void display()
{
	System.out.println("The name of the student "+name);
	System.out.println("Roll number "+rollNo);	
	for (int j=0;j<marks.length;j++)
		System.out.println("Marks"+marks[j]);
}

}
