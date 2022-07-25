package ObjectModel;

import java.util.List;

import org.checkerframework.common.reflection.qual.GetMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectClassModel {

	WebDriver driver;
	
	By resurrl = By.xpath("//div[@id='sciOutPut']");
	
	public ObjectClassModel(WebDriver driver)
	{
		this.driver = driver;
	}	
	public void calculation(int usernumber1, int usernumber2, char symbollv)
	{	
		genNumPasser(usernumber1);
		symboll(symbollv);
		genNumPasser(usernumber2);
		
		WebElement ffff = driver.findElement(resurrl);
		
		System.out.println(usernumber1+" "+symbollv +" "+usernumber2+" = "+ ffff.getText());
	}	
	
	public void genNumPasser(int usernumber1)
	{
		String s = String.valueOf(usernumber1);
		
		int[] num1 = new int[s.length()];
		
		for(int p = 0; p< s.length();p++ )
		{	
			genMethod(s.charAt(p));
		}
	}
	
	public void symboll(char symbol)
	{	
		List<WebElement> list = driver.findElements(By.xpath("//div[@style=\"padding-top:3px;\"]//span"));
    	for(WebElement i : list)
    	{	
    		String ci = i.getText();
    		char c = ci.charAt(0);
			if(symbol == c)
			{
				i.click();
			}    				
    	}
	}
	
	public void genMethod(char add)
	{	
		List<WebElement> list = driver.findElements(By.xpath("//div[@style=\"padding-top:3px;\"]//span"));
		
		int numGet = Character.getNumericValue(add);
		
    	for(WebElement i : list)
    	{	
    		String ci = i.getText();
    	
    		for(int p = 0; p< ci.length();p++ )
    		{	
    			if(add == '-')
    			{
    				driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
    			}
    			else
    			{
	    			if(Character.isDigit(ci.charAt(p)))
	    			{	
						int a = Integer.parseInt(ci);
	    				if(numGet == a)
	    				{
	    					i.click();
	    				}
	    			}
    			}
    		}    		
    	}
	}
}
