package com.pabloburzomi.TestWebForm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pablo\\Documents\\workspace-spring-tool-suite-4-4.10.0.RELEASE\\TestWebForm\\src\\test\\resources\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pabloburzomi.com/");
	}



	@Test
	public void testGooglePage() throws InterruptedException {
		
		
		WebElement nombre = driver.findElement(By.name("nombre"));
		WebElement email = driver.findElement(By.name("email"));
		WebElement textarea = driver.findElement(By.name("mensaje"));
		WebElement boton = driver.findElement(By.name("submit"));
		
		nombre.sendKeys("pablo");
		email.sendKeys("pablo@gmail.com");
		textarea.sendKeys("este es un mensaje, gracias");
		boton.submit();
		
		Thread.sleep(5000);
		
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	}
