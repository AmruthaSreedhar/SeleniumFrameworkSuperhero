package tests;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestIUtil extends TestBase {

public static void doLogin(String username) throws InterruptedException

{
	getObject("Login").click();
	getObject("register_name").sendKeys(username);
	getObject("enter_name").click();
	getObject("start").click();
	getObject("choose_battlefield_bus").click();
	getObject("bus_timer").click();
	getObject("bus_answer").click();
	getObject("select_next_battlefield").click();
	getObject("restaurant_timer").click();
	getObject("restaurant_answer").click();
	getObject("select_next_battlefield").click();
	getObject("start").click();
	getObject("office_answer").click();
	getObject("leaderboard").click();
	getObject("leaderboard").click();
	
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("///*[@id='showData']/table/tbody/tr]")));
	

	List<WebElement> rows = driver.findElements(By.xpath("//*[@id='showData']"));
	for (WebElement row : rows) { 
	    List<WebElement> cells = row.findElements(By.tagName("td")); 

	    // Print the contents of each cell
	    for (WebElement cell : cells) {         

	    System.out.println(cell.getText());

	}
}
	
}
}

