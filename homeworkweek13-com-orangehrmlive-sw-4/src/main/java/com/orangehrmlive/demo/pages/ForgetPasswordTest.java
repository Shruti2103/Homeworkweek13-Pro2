package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class ForgetPasswordTest extends Utility {

    By varifyText=By.xpath("//h1[contains(text(),'Forgot Your Password?')]");


    public String varifyforgetPassword(){
        return getTextFromElement(varifyText);
    }

}
