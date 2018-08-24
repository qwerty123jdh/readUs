package com.demo;

public class DemLambda {
public static void main(String [] args)
{
MyInterface m = ()-> {System.out.println("welcome to lambda");};
m.showData();
}
}
