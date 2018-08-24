package com.pojo;
 import java.io.FileNotFoundException;
 import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class DemoSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(12, 300, "ABCD");
		Student student1 = new Student(12,600,"ACD");
		
		try {
			FileOutputStream fi=new FileOutputStream("student.txt");
			ObjectOutputStream oi = new ObjectOutputStream(fi);
			oi.writeObject(student);
			oi.writeObject(student1);
			oi.close();
			fi.close();
			
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
