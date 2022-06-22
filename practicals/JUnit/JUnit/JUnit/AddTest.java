package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void Addtest() 
	{
		//Creating a object of class
		MyJUnitClass junit=new MyJUnitClass();
		int result = junit.add(10, 26);
		assertEquals(36,result);
		
	}

}
