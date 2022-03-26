package com.stringBufferAndstringBuilder;

public class Example8 {

	public static void main(String[] args)
	{
		// reverse()
		System.out.println("STRING BUFFER");
		StringBuffer name=new StringBuffer("THARANI");
		System.out.println(name.reverse());
		
		System.out.println("********************");
        System.out.println("STRING BUILDER");
		StringBuilder name1=new StringBuilder("DHIVYA");
		System.out.println(name1.reverse());

	}

}
