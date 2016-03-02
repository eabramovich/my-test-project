package allcafe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class LoginPage extends AnyPage {

	 public LoginPage(PageManager pages) {
		 super(pages);
	 }
	 
	 public LoginPage ensurePageLoaded() {
	    super.ensurePageLoaded();
	    wait.until(presenceOfElementLocated(By.id("login_form")));
	    return this;
	 }
	 
	 @FindBy(name = "email")
	 private WebElement usernameField;
	 
	 @FindBy(name = "password")
	 private WebElement passwordField;
	
	 @FindBy(name = "submit")
	 private WebElement submitButton;
	 
	 @FindBy(css = ".error")
	 private WebElement error;
	 
	 public LoginPage setUsernameField(String username) {
		 usernameField.sendKeys(username);
		 return this;
	 }
	 
	 public LoginPage setPasswordField(String password) {
		 passwordField.sendKeys(password);
		 return this;
	 }
	 
	 public void clickSubmitButton() {
		 submitButton.click();
	 }
	 
	  public String getTextError() {
		  pages.loginPage.ensurePageLoaded();
		  return error.getText();
	  }

}
