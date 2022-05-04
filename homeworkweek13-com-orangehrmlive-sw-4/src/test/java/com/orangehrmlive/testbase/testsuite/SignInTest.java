package com.orangehrmlive.testbase.testsuite;



import com.orangehrmlive.demo.pages.ForgetPasswordTest;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.testbase.TestBase;


import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends TestBase {

     HomePage homePage=new HomePage();
     ForgetPasswordTest forgetPasswordTest=new ForgetPasswordTest();

     @Test
        public void userSholdLoginSuccessfullyWithValidCredentials(){
             homePage.sendUserName("Admin");
             homePage.sendPassword("admin123");
             homePage.clickOnLoginButton();
            String expectedMessage="Welcome";
            String actualMessage=homePage.varifytheTextMessage();
          Assert.assertEquals(actualMessage,expectedMessage,"WelcomePage not displyed");


     }
       @Test
     public void userShouldNavigateToForgotPasswordPageSuccessfully(){
          homePage.forgetPassword();
          String expectedMessage="Forgot Your Password?";
          String actualMessage=forgetPasswordTest.varifyforgetPassword();
          Assert.assertEquals(actualMessage,expectedMessage,"User is on HomePage");





       }
























}




