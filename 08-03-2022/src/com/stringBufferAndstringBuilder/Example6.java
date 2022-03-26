package com.stringBufferAndstringBuilder;

public class Example6 {

	public static void main(String[] args) 
	{
		// delect()
		System.out.println("STRING BUFFER");
		StringBuffer name=new StringBuffer("welcome to our new world");
		System.out.println(name.delete(10, 14));
		System.out.println(name.delete(15, 20));
		
		System.out.println("********************");
        System.out.println("STRING BUILDER");
		StringBuilder name1=new StringBuilder("welcome to our new world");
		System.out.println(name1.delete(14, 18));
		System.out.println(name1.delete(0, 7));

	}

}
