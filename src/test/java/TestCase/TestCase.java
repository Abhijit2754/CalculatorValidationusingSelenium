package TestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Config.init;
import ObjectModel.ObjectClassModel;

public class TestCase extends init {
	
	@BeforeMethod
	public void init()
	{
		initilization();
	}	
	
    @Test(priority = 1)
    public void multiplication() throws InterruptedException 
	{
    	ObjectClassModel obj = new ObjectClassModel(driver);
    	
    	obj.calculation(423,526,'�'); // Multiplication
    	Thread.sleep(3000);
	}
    
    @Test(priority = 2)
    public void division() throws InterruptedException 
	{	
    	ObjectClassModel obj = new ObjectClassModel(driver);
    	
    	obj.calculation(4000,200,'/'); // Division
    	Thread.sleep(3000);
	}
    
    @Test(priority = 3)
    public void addition() throws InterruptedException 
	{	
    	ObjectClassModel obj = new ObjectClassModel(driver);
    	
    	obj.calculation(-234234,345345,'+'); // Addition
    	
    	Thread.sleep(3000);

	}
    
    @Test(priority = 4)
    public void substraction() throws InterruptedException 
	{	
    	ObjectClassModel obj = new ObjectClassModel(driver);
    	
    	obj.calculation(234823,-23094823,'�'); // Substraction
    	
    	Thread.sleep(3000);
	}
    
    @AfterMethod
    public void tearDown()
    {
    	driver.close();
    }

	// cdcdcccccccccccccccc
}
