package org.details;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("prexo.mis@dealsdray.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("prexo.mis@dealsdray.com");
		
		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		login.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/div[1]/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/button")).click();
		
		Thread.sleep(1500);
		File file = new File("C:\\Users\\comed\\Downloads\\demo-data.xlsx");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(file.getAbsolutePath());				
		driver.findElement(By.xpath("//button[text()='Import']")).click();;
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Validate Data']")).click();;
		Thread.sleep(1000);		
		driver.switchTo().alert().accept();
	}

}