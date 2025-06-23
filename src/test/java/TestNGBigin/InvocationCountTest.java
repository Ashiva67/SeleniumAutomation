package TestNGBigin;

import org.testng.annotations.Test;

public class InvocationCountTest {
	@Test(invocationCount=10)
	public void test() {
		int a=2;
		int b=3;
		int c=a+b;
		System.out.println("sum : "+c);
				
	}

}
