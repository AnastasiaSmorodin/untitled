package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {
    public DashboardPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void subTabs(String subName){
        String AllSubTubs = "//li[@class='in-header']//a//span[.='"+subName+"'] ";
    }
    @FindBy(xpath = "//li[@class='in-header']//a")
    public List<WebElement> allTabs;

    @FindBy (xpath = "//*[@id=\"appmenu\"]/li[2]")
    public WebElement fileModule;

    public String dashboardPageTitle(){
        return Driver.getDriver().getTitle();
    }


}