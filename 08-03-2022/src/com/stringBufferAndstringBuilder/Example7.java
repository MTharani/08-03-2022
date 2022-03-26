package com.stringBufferAndstringBuilder;

public class Example7 {

	public static void main(String[] args) 
	{
		//replace()
		System.out.println("STRING BUFFER");
		StringBuffer name=new StringBuffer("welcome  karaikal");
		System.out.println(name.replace(8, 17, "Pune"));
		
		System.out.println("********************");
        System.out.println("STRING BUILDER");
		StringBuilder name1=new StringBuilder("welcome  puducherry");
		System.out.println(name1.replace(7, 9, " to "));
	

	}

}
