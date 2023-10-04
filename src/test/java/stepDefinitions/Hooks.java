package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import utilities.Driver;
import utilities.ReusableMethods;

public class Hooks {
     @After
    public void closeDriver(Scenario scenario){
        if (!(scenario.isFailed())){
           ReusableMethods.logout();
           Driver.quitDriver();
        }
    }


}
