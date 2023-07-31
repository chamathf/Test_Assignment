package org.common;

public class Constants {

    public static final String BROWSER_NAME = System.getProperty("selenide.browser" ,"chrome"); // User Can Change the Browser By Changing the def: "chrome" or "firefox"

    public static final String APP_URL = System.getProperty("app.url" ,"https://mejuri.com/world/en/");
    public static final String EMAIL= System.getProperty("account.email","cmfernando654@gmail.com"); // User Can Change the Email By Changing the def:

    public static final String USER_NAME=System.getProperty("User.name" ,"Chamath").toUpperCase(); // User Can Change the User_Name By Changing the def:
    public static final String PASSWORD= System.getProperty("account.password","Malaka@123"); // User Can Change the Password By Changing the def:

    public static final String Ring_Category= System.getProperty("ring.category","Signet Rings"); // User Can Change the Ring Category By Changing the def:

    public static final String Item_Name= System.getProperty("item.name","Honey Mini Signet"); // User Can Change the Item Name By Changing the def:
    public static final String ACCOUNT_NAME=System.getProperty("account.name" ,"WELCOME BACK, "+Constants.USER_NAME+""); // This is Used for Identify the Account Name

    public static final String SIZE=System.getProperty("size" ,"4"); // User Can Change the Size "3" or "4" By Changing the def:
    public static final String DESCRIPTION_NAME=System.getProperty("description.name" ,"Size: "+Constants.SIZE+", Gold Vermeil"); // This is Used for Item Description


}
