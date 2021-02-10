package com.legobatmanfan.mortgagecalculator.common;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class BrowserActions {
    public static void pageLoadWait(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void longPageLoadWait(){
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public String checkForAlert(WebDriver driverAlert){

        String message = "";
        try{
            Alert myAlert = new WebDriverWait(driverAlert, 20).until(ExpectedConditions.alertIsPresent());
            if (myAlert != null){
                driverAlert.switchTo().alert().accept();
                message = "Alert present";
            }
            else{
                throw new Throwable();
            }
        }
        catch(Throwable e){
            message = "Error checking for alert";
        }

        return message;
    }

    public void switchToParentWindow(WebDriver driverParentWindow, String parentWindowHandler){
        //String parentWindowHandler = driverParentWindow.getWindowHandle();
        driverParentWindow.switchTo().window(parentWindowHandler);
    }

    public static String switchToPopupWindow(WebDriver driverPopupWindow){
        String mainWindowHandler = driverPopupWindow.getWindowHandle();
        String childWindowHandler = null;
        Set<String> handles = driverPopupWindow.getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while(iterator.hasNext()){
            childWindowHandler = iterator.next();
        }
        driverPopupWindow.switchTo().window(childWindowHandler);
        return mainWindowHandler;
    }

    public String getTimeStampForFileName(){

        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    }

    public String getTimeStampForLogFile(){
        return new SimpleDateFormat("yyyy MMM dd HH:mm:ss a").format(new Date());
    }

    public static String getPageTitle(WebDriver myDriver){
//        String actualTitle = myDriver.getTitle();
////        return actualTitle;
        return myDriver.getTitle();
    }

    public static String getPageUrl(WebDriver pageDriver){
        return pageDriver.getCurrentUrl();
    }

    public static void scrollDown(WebDriver scrollDriver){
        JavascriptExecutor jsx = (JavascriptExecutor) scrollDriver;
        jsx.executeScript("window.scrollBy(0,450)","");
    }

}
