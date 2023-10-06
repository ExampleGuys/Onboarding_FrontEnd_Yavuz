package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


import utilities.Driver;

import java.time.Duration;


public class Hooks {

    @Before
    public void setUp(Scenario scenario){

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Driver.getDriver().manage().window().maximize();
        System.out.println(scenario.getName());
    }

    @AfterStep
    public void step(Scenario scenario) {
        System.out.println(scenario.getName()+"Step is " + scenario.getStatus());

    }

    @After
    public void closeDriver(){
        Driver.closeDriver();
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
          //  final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
        //    scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();
        System.out.println("Scenario is = " + scenario.getStatus());
    }




}
