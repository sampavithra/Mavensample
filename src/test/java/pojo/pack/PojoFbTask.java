package pojo.pack;

import org.base.baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoFbTask extends baseclass {   // method & class name ------> constructor
public PojoFbTask() {
	org.openqa.selenium.WebDriver driver = null;
	PageFactory.initElements(driver, this);
}
@CacheLookup
	@FindBys({						//and operaTOR
		@FindBy(id="email"),
		@FindBy(className="inputtext _55r1 _6luy"),
		@FindBy(xpath="//input[@type='text']")
		
	})private WebElement txtUser;
	@CacheLookup
	@FindAll({
								
			@FindBy(id="pass"),
			@FindBy(xpath="//input[@type='password']")
					})private WebElement txtPass;
	
	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getLogin() {
		return login;
	}
	@FindBy(name="login")
	private WebElement login;
	
	
	
	
	
	
	
	
	
	
	
	
}

