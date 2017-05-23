package core.Jenkins05;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for MainPage.
 */
public class MainPageTest {
	
	public int operand1 = 20;
	public int operand2 = 10;
	
	MainPage mainPage = new MainPage();

	@Test(enabled = true, groups={"MainPage", "DryRun", "Regression"})
	public void mainPageTest01() {
        Assert.assertTrue( true );
    }
    
	@Test(enabled = true, groups={"MainPage", "DryRun", "Regression"})
	public void mainPageTest02() {
        Assert.assertTrue( true );
    }
	
	@Test(enabled = false, groups={"MainPage", "DryRun", "Regression"})
	public void mainPageTest03() {
        Assert.assertTrue( true );
    }
	
	@Test(enabled = true, groups={"MainPage", "Arythmetic", "Regression"})
    public void sumTest() {
    	int operand1 = 20;
    	int operand2 = 10;
    	int expectedResult = 30;
    	Assert.assertEquals(mainPage.sum2numbers(operand1, operand2), expectedResult);
    }
	
	@Test(enabled = true, groups={"MainPage", "Arythmetic", "Regression"})
    public void subtractTest() {
    	operand1 = 20;
    	operand2 = 10;
    	int expectedResult = 10;
    	//Assert.assertEquals(mainPage.subtract2numbers(operand1, operand2), expectedResult);
    }
	
	@Test(enabled = true, groups={"MainPage", "Arythmetic", "Regression"})
    public void multiplicationTest() {
    	operand1 = 20;
    	operand2 = 10;
    	int expectedResult = 200;
    	Assert.assertEquals(mainPage.multiplication2numbers(operand1, operand2), expectedResult);
    }
	
	@Test(enabled = true, groups={"MainPage", "Arythmetic", "Regression"})
    public void divisionTest() {
    	int operand1 = 20;
    	int operand2 = 10;
    	int expectedResult = 2;
    	Assert.assertEquals(mainPage.division2numbers(operand1, operand2), expectedResult);
    }
	
	
}
