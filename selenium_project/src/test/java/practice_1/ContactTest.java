package practice_1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest() {
		String URL=System.getProperty("Url");
		String BROWSER=System.getProperty("Browser", "chrome");
		String USERNAME=System.getProperty("Username");
		String PASSWORD=System.getProperty("Password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		System.out.println("execute createContactTest");
	}
	@Test
	public void modifyContactTest() {
		System.out.println("execute modifyContactTest");
	}

}
