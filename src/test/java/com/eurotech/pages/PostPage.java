package com.eurotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostPage extends BasePage {

    @FindBy(css = "#post-form-btn")
    public WebElement sbmtbtn;

    @FindBy(css = "#post-form-title")
    public WebElement titleInput;

    @FindBy(css = "#post-form-textarea")
    public WebElement textArea;

    @FindBy(xpath = "//*[contains(text(),'Created')]")
    public WebElement postCreatedMessage;

    public void postComment (){
       String  title= "Selenium";
        String post="we are learning Selenium";

        titleInput.sendKeys(title);
        textArea.sendKeys(post);
        sbmtbtn.click();



    }
    public void post2(String title, String post){
        titleInput.sendKeys(title);
        textArea.sendKeys(post);
        sbmtbtn.click();
        
    }
}