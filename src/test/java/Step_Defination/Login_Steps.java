package Step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {
	 WebDriver driver;

@Given("user should be open chrome browser")
public void user_should_be_open_chrome_browser() {
	driver=new ChromeDriver();
	driver.get("https://javabykiran.com/liveproject/index.html");
	driver.manage().window().maximize();
}

@When("user enters username,password")
public void user_enters_username_password() {
    driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
    driver.findElement(By.id("password")).sendKeys("123456");
}

@And("click on login button")
public void click_on_login_button() {
    driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

}

@Then("page should be navigate home page")
public void page_should_be_navigate_home_page() {
	Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
}

@And("Close the browser")
public void close_the_browser() {
    driver.quit();
}

@When("When user enters username,password")
public void when_user_enters_username_password() {
	  driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("123456");
	
}

@Then("error message should be display to the user")
public void error_message_should_be_display_to_the_user() {
	String Actual=driver.findElement(By.id("email_error")).getText();
	String Expected="Please enter email as kiran@gmail.com";
	Assert.assertEquals(Expected, Actual);
}

@Then("close the browser")
public void close_the_browser1() {
    driver.quit();
}


	

}
