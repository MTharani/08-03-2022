package com.stringBufferAndstringBuilder;

public class Example9 {

	public static void main(String[] args)
	{
		// substring()
		System.out.println("STRING BUFFER");
		StringBuffer name=new StringBuffer("Hi, how are you? I am fine");
		System.out.println(name.substring(4));
		
		System.out.println("********************");
        System.out.println("STRING BUILDER");
		StringBuilder name1=new StringBuilder("Hi, How are you? I am very well");
		System.out.println(name1.substring(17));

	}

}
