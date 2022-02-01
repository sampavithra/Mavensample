package org.base;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public static WebDriver driver;//instance variable to static variable
	
	public static WebDriver browserlaunch() {
		//to configure driver
				WebDriverManager.chromedriver().setup(); 
				//object for webdriverI-upcasting
						driver=new ChromeDriver();
						return driver;
		
	}
	//launch url
	public static void launchurl(String url) {
		
	driver.get(url);


	}
	public static void maxbrowser() {
		driver.manage().window().maximize();
	

	}
	
	//get title
	public static void pagetitle() {
		String title =driver.getTitle();
		System.out.println(title);
	}
	
public static void geturl() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);

}

//to send vaule in username,password,firstname,lastname


public static void fill(WebElement element,String text ) {
	element.sendKeys(text);
	

}
//click
public static void btnclick(WebElement element) {
	element.click();
	
	
}

public static void performDragdrop(WebElement from,WebElement to) {
	Actions a=new Actions(driver);
	
	a.dragAndDrop(from,to).perform();


}
/*public static void copytext() throws AWTException {
	Robot r=new Robot();
	r.keyPress(keycode);*/
	
	
}
	


	
	/*private static final String WebDriverWait = null;
	private static final int WebDriver = 0;
	private static final int FluentWait = 0;

	public static void pageLoadTimeout(int sec, String url) {
	driver.manage().timeouts().pageLoadTimeout(sec, TimeUnit.SECONDS);
	driver.get(url);
}

	public static void waitImplicit(int sec, String url) {
	driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	driver.get(url);
}

public static String waitExplicit(int seconds) {
	WebDriverWait w= new WebDriverWait(driver, seconds);
	return WebDriverWait;
}
public static int waitFluent(int seconds, int sec) {
	FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.
			ofSeconds(seconds)).pollingEvery(Duration.ofSeconds(sec)).ignoring(Exception.class);
	
	return FluentWait;
	
}





	private static final String WebDriver = null;
	private static final String String = null;
	public static WebDriver driver;
	static Alert a=driver.switchTo().alert();

	
	
	public static void alertAccept() {
	a.accept();
	}
	
	public static void alertDismiss() {
		
		a.dismiss();
	}
	public static void alertSendKeys(String text) {
		
		a.sendKeys(text);
	}
	public static String alertPrintTxt() {
		 a.getText();
		 return String;
		}
	
	public static String frameUsingId(String stringIdName) {			
		driver.switchTo().frame(stringIdName);
		return WebDriver;
	}
	
	public static String frameUsingIndex(Integer index) {
		driver.switchTo().frame(index);
		return WebDriver;
	}
	public static void frameJumpParent() {
		driver.switchTo().parentFrame();
	}
	public static void frameJumpDefault() {
		driver.switchTo().defaultContent();
	}
			
	
	public static void switchWindowId(String id) {
		String parentId = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for (String jump : all) {
			if (!parentId.equals(jump)) {
				driver.switchTo().window(jump);

			}}}
	
	

	


public static final WebElement element = null;

static Select s= new Select(element);

public static boolean check;
public static void navigateFrwd() {
driver.navigate().forward();
}
public static void navigateBack() {
driver.navigate().back();
}
public static void refreshing() {
driver.navigate().refresh();
}
public static void navigateToO(String url) {
driver.navigate().to(url);
}
public static boolean checkDispalyed(WebElement element) {
		 return check = element.isDisplayed();
		
}
public static boolean checkEnabled(WebElement element) {
	 return check = element.isEnabled();
}
public static boolean checkSelected(WebElement element) {
	return check = element.isSelected();
}
public static void selectInDropdown(WebElement element, String visibletext) {
	Select s= new Select(element);
System.out.println(s.isMultiple());
s.selectByVisibleText(visibletext);
}

public static void selectInDropdownByValue(WebElement element, String value) {
Select s= new Select(element);
s.selectByValue(value);

}
public static void selectInDropdownByIndex(WebElement element,int index) {
	Select s= new Select(element);
	s.selectByIndex(index);
}
public static void deselectInDropdown(WebElement element, String visibletext) {
	Select s= new Select(element);
	s.deselectByVisibleText(visibletext);
}
public static void deselectDropdownByValue(WebElement element, String value) {
	Select s= new Select(element);
	s.deselectByValue(value);
	}
public static void deselectDropdownByIndex(WebElement element, int index) {
	Select s= new Select(element);		
	s.deselectByIndex(index);
}
public static void isDropdownMulti() {
	boolean multiple = s.isMultiple();
	System.out.println(multiple);
		}
public static void getAllDropdownOPtions() {
	List<WebElement> options = s.getOptions();
	for (WebElement opt : options) {
		String optionName = opt.getText();
		System.out.println(optionName);
	}}
public static void getSelectedOptionsDD() {
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
}}
public static void getFirstDDSelectedOption() {
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
					}
	
	
	
	

	
public static WebDriver driver;


public static WebDriver launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	return driver;
	}

public static void loadUrl(String url) {
	driver.get(url);

}

public static void maxBrowser() {
driver.manage().window().maximize();
}
public static void sendingKeys(WebElement element,String text ) {
	element.sendKeys(text);
}
public static void btnClick(WebElement element) {
	element.click();
}
	
public static void closePage() {
	driver.close();
}

public static void closeBrowser() {
	driver.quit();
}

public static void printInputText(WebElement element,String attributeName) {
	element.getAttribute(attributeName);
}
public static void printWebText(WebElement element) {
	element.getText();
}



public static void fixedSleep(int millisec) throws InterruptedException {
Thread.sleep(millisec);
}

public static void pageUrl() {
System.out.println(driver.getCurrentUrl());
}

public static void pageTitle() {
	System.out.println(driver.getTitle());
}

public static void dragDrop(WebElement ss, WebElement dest) {
Actions a=new Actions(driver);
a.dragAndDrop(ss, dest).perform();
	}	

public static void mouseOvr(WebElement element) {
	
	Actions a=new Actions(driver);
	a.moveToElement(element).perform();
}
public static void clickTwice(WebElement element) {
	Actions a=new Actions(driver);
	a.doubleClick(element).perform();
}

public static void rightClick(WebElement element) {
	Actions a=new Actions(driver);
	a.contextClick(element).perform();

}
public static void downKey() throws AWTException {
	Robot o=new Robot();
		o.keyPress(KeyEvent.VK_DOWN);
		o.keyRelease(KeyEvent.VK_DOWN);

}
public static void upKey() throws AWTException {
	Robot o=new Robot();
	o.keyPress(KeyEvent.VK_UP);
	o.keyRelease(KeyEvent.VK_UP);
}
public static void escKey() throws AWTException {
Robot o=new Robot();
o.keyPress(KeyEvent.VK_ESCAPE);
o.keyRelease(KeyEvent.VK_ESCAPE);

}
public static void tabKey() throws AWTException {
	Robot o=new Robot();
	o.keyPress(KeyEvent.VK_TAB);
	o.keyRelease(KeyEvent.VK_TAB);

}
public static void enterKey() throws AWTException {
	Robot o=new Robot();
	o.keyPress(KeyEvent.VK_ENTER);
	o.keyRelease(KeyEvent.VK_ENTER);
}
public static void copyKey() throws AWTException {
	Robot o=new Robot();
	o.keyPress(KeyEvent.VK_CONTROL);
	o.keyPress(KeyEvent.VK_C);
	o.keyRelease(KeyEvent.VK_C);
	o.keyRelease(KeyEvent.VK_CONTROL);
}
public static void pasteKey() throws AWTException {
	Robot o=new Robot();
	o.keyPress(KeyEvent.VK_CONTROL);
	o.keyPress(KeyEvent.VK_V);
	o.keyRelease(KeyEvent.VK_V);
	o.keyRelease(KeyEvent.VK_CONTROL);
}
public static void cutKey() throws AWTException {
	Robot o=new Robot();
	o.keyPress(KeyEvent.VK_CONTROL);
	o.keyPress(KeyEvent.VK_X);
	o.keyRelease(KeyEvent.VK_X);
	o.keyRelease(KeyEvent.VK_CONTROL);
}
public static String snapScreen(String folderPath) throws IOException{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\Karthik\\eclipse-workspace2\\MavenPrac\\"+ folderPath);
	FileUtils.copyFile(source, dest);
	return folderPath;

}
public static void jseGetAttribute(WebElement getEntered) {
	JavascriptExecutor js= (JavascriptExecutor)driver;
	System.out.println(js.executeScript("return arguments[0].getAttribute('value')", getEntered));
}
public static void jseClick(WebElement element) {
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("return arguments[0].click()",element);
}

public static void jseScrolldwn(WebElement element) {
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",element);

}
public static void jseScrollUp(WebElement element) {
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)",element);
}







}*/
