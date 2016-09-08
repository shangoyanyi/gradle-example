package example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTester {
	@Test
	public void testSayHello() {
		try{
			assertEquals(new HelloWorld().sayHello(), "hello");
			
		}catch(Exception e){
			fail(e.toString());
		}
	}
} 