package com.stringBufferAndstringBuilder;

public class Example3 {

	public static void main(String[] args) 
	{
		// charAt()
		System.out.println("STRING BUFFER");
		StringBuffer name=new StringBuffer("welcome to karaikal");
		System.out.println(name.charAt(5));
		
		System.out.println("********************");
        System.out.println("STRING BUilder");
		StringBuilder name1=new StringBuilder("welcome to puducherry");
		System.out.println(name1.charAt(11));
        
	}

}
