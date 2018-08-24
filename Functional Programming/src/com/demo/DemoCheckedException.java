package com.demo;
import java.io.FileWriter;
import java.io.IOException;

public class DemoCheckedException {
public static void main(String[]args)

{
	FileWriter write = null;
	try {
		write = new FileWriter("hello.txt");
		write.write("bc");
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("ALL WELL");
	}
}
