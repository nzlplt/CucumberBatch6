package com.eurotech.runners;

import com.eurotech.step_definitions.LoginStepDef;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/Features",
        glue = "com/eurotech/step_definitions",
        dryRun = false,
        tags= "@rerun"


)

public class CukesRunner  {

}
