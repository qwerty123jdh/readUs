package com.pojo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class DemoDeSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fi;
		try
		{
			fi =new FileInputStream("student.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Object obj = oi.readObject();
			Student stu = (Student)obj;
			System.out.println(stu.getName()+" "+stu.getTotal());
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{e.printStackTrace();}

	}

}
