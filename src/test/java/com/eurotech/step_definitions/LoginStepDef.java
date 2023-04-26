package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

import static com.eurotech.utilities.Driver.driver;

public class LoginStepDef {

    LoginPage loginpage=new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {
       loginpage.loginAsTeacher();

    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {

        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains("Welcome"));
    }

    @When("The user enters student credentials")
    public void theUserEntersStudentCredentials() {
        System.out.println("I enter student username and password and click login button");
    }

    @When("The user enters developer credentials")
    public void the_user_enters_developer_credentials() {
        System.out.println("I enter developer username and password and click button");
    }

    @When("The user logs in using {string} and {string} credentials")
    public void theUserLogsInUsingAndCredentials(String username, String password) {
        System.out.println("username " + username);
        System.out.println("password " + password);
        loginpage.login(username,password);
    }

    @Then("The welcome message contains {string}")
    public void theWelcomeMessageContains(String expectedMessage) {
        System.out.println("expectedMessage = " + expectedMessage);
        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains(expectedMessage));
    }

    @When("The user logs in using following credentials")
    public void theUserLogsInUsingFollowingCredentials(Map<String,String > userCredentials) {
        System.out.println("userCredentials = " + userCredentials);
        String username= userCredentials.get("username");
        String password=userCredentials.get("password");
        loginpage.login(username,password);

        String expectedMessage=userCredentials.get("message");
        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains(expectedMessage));
    }

}