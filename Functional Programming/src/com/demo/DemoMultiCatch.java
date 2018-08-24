package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DemoMultiCatch {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
			FileInputStream fi = new FileInputStream("abc.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			oi.readObject();
						
		
			
		

	}

}
