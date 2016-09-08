package example;

import org.apache.log4j.Logger;

public class HelloWorld {
	private static Logger logger = Logger.getLogger(HelloWorld.class);
	
	public String sayHello(){
		logger.info("say hello");
		return "hello";
	}
}