package com.juvenxu.mvnbook.helloworld;

import org.apache.log4j.Logger;

public class HelloWorld {

	public String sayHello()
	{
		return "Hello Maven";
	}
	
	public static void main(String[] args)
	{
		System.out.print( new HelloWorld().sayHello() );
        Logger logger = Logger.getLogger(HelloWorld.class);
        logger.info("¿ªÊ¼");
	}
}
