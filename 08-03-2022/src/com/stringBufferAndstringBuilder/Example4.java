package com.stringBufferAndstringBuilder;

public class Example4 {

	public static void main(String[] args) 
	{
		// indexof()
		System.out.println("STRING BUFFER");
		StringBuffer name=new StringBuffer("welcome to karaikal");
		System.out.println(name.indexOf("to"));
		
		System.out.println("********************");
        System.out.println("STRING BUilder");
		StringBuilder name1=new StringBuilder("welcome to puducherry , welcome to karaikal");
		System.out.println(name1.indexOf("to", 11));
		
        

	}

}
