package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConCatTest {

	@Test
	public void Addtest() 
	{
		//Creating a object of class
		MyJUnitClass junit=new MyJUnitClass();
		
		String result = junit.ConCat("shivani","shejawl");
		assertEquals("shivanishejawl",result);
		
	}

}
