package com.eurotech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",//cucumber picks failed scenarios from this file
        glue = "com/eurotech/step_definitions"
)
public class FailedTestRunner {
}



