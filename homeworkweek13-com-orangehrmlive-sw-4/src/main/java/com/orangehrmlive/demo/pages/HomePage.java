package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;

import org.openqa.selenium.By;

public class HomePage extends Utility {

    By userName=By.xpath("//input[@id='txtUsername']");
    By passwordField=By.xpath("//input[@id='txtPassword']");
    By loginField=By.id("btnLogin");
    By welcomeText=By.xpath("//a[@id='welcome']");
    By forgetPassword=By.xpath("//a[contains(text(),'Forgot your password?')]");

    public void  sendUserName(String email){
        sendTextToElement(userName,email);
    }
    public void sendPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginField);
    }
    public String varifytheTextMessage(){
      return  getTextFromElement(welcomeText);
    }
    public void forgetPassword(){
        clickOnElement(forgetPassword);
    }





}
