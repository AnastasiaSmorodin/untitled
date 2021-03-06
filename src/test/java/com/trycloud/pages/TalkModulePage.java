package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TalkModulePage {
    public TalkModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@class='app-navigation-search__input']")
    public WebElement talkModuleSerachbox;


    @FindBy(xpath = "//ul[@class='conversations']//a[@aria-label='Conversation, User71']")
    public WebElement user71;


    @FindBy(xpath = "//div[@placeholder='Write message, @ to mention someone …']")
    public WebElement messageBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement messageSubmitButton;

    @FindBy(xpath = "//div[starts-with(@id,\"message\") and @class='message']//div[@class='rich-text--wrapper']")
    public List<WebElement> listOfMessages;

    @FindBy(xpath="//a[@aria-label='Talk'][1]")
    public WebElement talkmodule;
}





