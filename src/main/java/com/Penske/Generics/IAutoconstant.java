package com.Penske.Generics;

public interface IAutoconstant {


    String DirPath = System.getProperty("user.dir");

    long ITO = 20;
    long ETO = 10;

    String CHROME_KEY = "webdriver.chrome.driver";
    String CHROME_VALUE = "src/test/resources/Driver/chromedriver.exe";
    String CHROME = "chrome";

    String GECKO_KEY = "webdriver.gecko.driver";
    String GECKO_VALUE = "src/test/resources/Driver/geckodriver.exe";
    String GECKO = "firefox";

    String EDGE_KEY = "webdriver.edge.driver";
    String EDGE_VALUE = "src/test/resources/Driver/msedgedriver.exe";

    String url ="https://www.pensketruckrental.com/";
    String ExcelPath =DirPath+"/src/test/resources/Excel_File/Book1.xlsx";
    String ScreenshortPath="";



}
