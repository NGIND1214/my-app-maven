package com.mycompany.app;
import org.junit.Assert;
//import static org.junit.Assert;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void addTest() {
		App myCalc1 = new App();
		Assert.assertEquals(10, myCalc1.addNumbers(5, 5));
    }
	
    @Test
    public void subttractTest() {
		App myCalc2 = new App();
		Assert.assertEquals(5, myCalc2.subtractNumbers(10, 5));
    }
}
