package com.stringBufferAndstringBuilder;

public class Example5 {

	public static void main(String[] args) 
	{
		// insert()
		System.out.println("STRING BUFFER");
		StringBuffer name=new StringBuffer("welcome  karaikal");
		System.out.println(name.insert(8, "to"));
		StringBuffer name2 = new StringBuffer("Java language");
		System.out.println(name2.insert(5, "programming ", 0, 12));
		
		System.out.println("********************");
        System.out.println("STRING BUILDER");
		StringBuilder name1=new StringBuilder("welcome to puducherry");
		System.out.println(name1.insert(21, ", welocme to karaikal"));
	
        

	}

}
