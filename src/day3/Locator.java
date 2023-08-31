package day3;

import org.openqa.selenium.By;

public class Locator {
	public static By getLocator(String locatorType, String locatorValue) {
		By result=null;
		switch(locatorType) {
		case "id":{
			result =By.id(locatorValue);
			break;
		}
		case "name":{
			result =By.name(locatorValue);
			break;
		}
		case "linkText":{
			result =By.linkText(locatorValue);
			break;
		}
		case "cssSelector":{
			result =By.cssSelector(locatorValue);
			break;
		}
		case "partialLinkText":{
			result =By.partialLinkText(locatorValue);
			break;
		}
		case "tagName":{
			result =By.tagName(locatorValue);
			break;
		}
		case "xpath":{
			result =By.xpath(locatorValue);
			break;
		}
		default : {System.out.println("Nhap lai? ");}
		
		}
		
	return result;	
	} 

}
