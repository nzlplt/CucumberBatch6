package com.eurotech.pages;

import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebElement loginButton;

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);

    }
@FindBy(id="rcc-confirm-button")
  public  WebElement ıunderstandBtn;


    @FindBy(name="email")
    public WebElement usernameInput;


    @FindBy(name="password")
    public WebElement passwordInput;

    @FindBy(id="loginpage-form-btn")
    public   WebElement loginBtn;

    @FindBy(xpath = "//div[text()='Invalid Credentials!']")
    public  WebElement warningMessage;


    //@FindAll
    //To use multiple locator if at least one of them is matching it will find the web element.
    @FindAll({
            @FindBy(id = "loginpage-input-email"),
            @FindBy(name="emailfhfdjkhfjkdshfkjdshfjkdhjkfhdskj")})

    public WebElement usernameInputFindAll;



    //@FindBys
    // if the locators are matching with element then it will return it. And logic applies here
    @FindBys({
            @FindBy(xpath="//input[@type='email']"),
            @FindBy(id="loginpage-input-email")})

    public WebElement passwordInputFindBys;



    public void login(String userName, String password){
    ıunderstandBtn.click();
    usernameInput.sendKeys(userName);
    passwordInput.sendKeys(password);
    loginBtn.click();

}
public  void loginAsTeacher(){
    String username= ConfigurationReader.get("userTeacher");
    String password=ConfigurationReader.get("userPassword");
    login(username,password);
}


}
