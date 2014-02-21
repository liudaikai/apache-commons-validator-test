package test;

//import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateExampleTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		ValidateExample ve = new ValidateExample();
		try {
			ve.main(null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
