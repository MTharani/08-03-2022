package com.stringBufferAndstringBuilder;

public class Example2 {

	public static void main(String[] args) 
	{
		// capacity() and length()
		//StringBuffer
		System.out.println("STRING BUFFER");
		StringBuffer name= new StringBuffer("Welocme to java class");
	    StringBuffer name1= new StringBuffer();
		System.out.println(name.length());
		System.out.println(name.capacity());	//each capacity have 16
		System.out.println("=====================");
        System.out.println(name1.length());
        System.out.println(name1.capacity());
        System.out.println("***********************");
        System.out.println("STRING BUILDER");
		StringBuilder myName= new StringBuilder("Welocme to java class");
	    StringBuilder myName1= new StringBuilder();
		System.out.println(myName.length());
		System.out.println(myName.capacity());	//each capacity have 16
		System.out.println("=====================");
        System.out.println(myName1.length());
        System.out.println(myName1.capacity());
	}

}
