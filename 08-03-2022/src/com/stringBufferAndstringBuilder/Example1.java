package com.stringBufferAndstringBuilder;

public class Example1 {

	public static void main(String[] args)
	{
		//append()
		// String Buffer
		System.out.println("STRING BUFFER");
		StringBuffer name= new StringBuffer("Duruga");
		System.out.println(name.append(" Devi"));
		
		//String Builder
		System.out.println("***********************");
		System.out.println("STRING BUILDER");
		StringBuilder name1= new StringBuilder("Vishnu");
		System.out.println(name1.append(" priya"));

	}

}
