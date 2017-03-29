package com.org;

import org.junit.Assert;

//import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2etest {

	@Test
	public void Should_Get_Item_Prize() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/siq/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		String itemname = "Adidas";
		driver.findElement(By.name("item_name")).sendKeys(itemname);
		driver.findElement(By.xpath("//button[@id='singleitem']")).click();
		String expectedValue = driver.findElement(By.xpath("/html/body/div/form/strong[1]")).getText();
		Assert.assertEquals(expectedValue,"500");
		Thread.sleep(500);
		driver.close();
	}
	@Test
	public void Should_Add_Item_Quantity_is_One() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/siq/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		String itemname = "Adidas";
		String itemqty = "1";
		driver.findElement(By.name("item_name")).sendKeys(itemname);
		driver.findElement(By.xpath("//button[@id='singleitem']")).click();
		String expectedValue = driver.findElement(By.xpath("/html/body/div/form/strong[1]")).getText();
		//System.out.println("value of single item price " + expectedValue);
		Assert.assertEquals(expectedValue,"500");
		driver.findElement(By.name("item_qty")).sendKeys(itemqty);
		driver.findElement(By.xpath("//button[@id='totalprice']")).click();
		int qty = Integer.parseInt(itemqty);
		int val = Integer.parseInt(expectedValue);
		int actualTotalPrice = val*qty;
		String totalPrice = driver.findElement(By.id("list")).getText();
		//System.out.println("The "+totalPrice);
		String compareValue = "Total Price: "+actualTotalPrice;
		Assert.assertEquals(compareValue,totalPrice);
		//System.out.println("It displayed total prize of shoe as quantity is 1");
		Thread.sleep(500); 
		driver.close();
	}
	@Test
	public void Should_Add_Item_Quantity_is_two() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/siq/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		String itemname = "Adidas";
		String itemqty = "2";
		driver.findElement(By.name("item_name")).sendKeys(itemname);
		driver.findElement(By.xpath("//button[@id='singleitem']")).click();
		String expectedValue = driver.findElement(By.xpath("/html/body/div/form/strong[1]")).getText();
		Assert.assertEquals(expectedValue,"500");
		driver.findElement(By.name("item_qty")).sendKeys(itemqty);
		driver.findElement(By.xpath("//button[@id='totalprice']")).click();
		int qty = Integer.parseInt(itemqty);
		int val = Integer.parseInt(expectedValue);
		int actualTotalPrice = val*qty;
		String totalPrice = driver.findElement(By.id("list")).getText();
		String compareValue = "Total Price: "+actualTotalPrice;
		Assert.assertEquals(compareValue,totalPrice);
		Thread.sleep(500); 
		driver.close();
	}
	@Test
	public void Should_Add_Item_Quantity_is_five() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/siq/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		String itemname = "Adidas";
		String itemqty = "5";
		driver.findElement(By.name("item_name")).sendKeys(itemname);
		driver.findElement(By.xpath("//button[@id='singleitem']")).click();
		String expectedValue = driver.findElement(By.xpath("/html/body/div/form/strong[1]")).getText();
		Assert.assertEquals(expectedValue,"500");
		driver.findElement(By.name("item_qty")).sendKeys(itemqty);
		driver.findElement(By.xpath("//button[@id='totalprice']")).click();
		int qty = Integer.parseInt(itemqty);
		int val = Integer.parseInt(expectedValue);
		int actualTotalPrice = val*qty;
		String totalPrice = driver.findElement(By.id("list")).getText();
		String compareValue = "Total Price: "+actualTotalPrice;
		Assert.assertEquals(compareValue,totalPrice);
		Thread.sleep(500); 
		driver.close();
   }
	@Test
	public void Should_Add_Item_Quantity_is_Zero() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/siq/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		String itemname = "Adidas";
		String itemqty = "0";
		driver.findElement(By.name("item_name")).sendKeys(itemname);
		driver.findElement(By.xpath("//button[@id='singleitem']")).click();
		String expectedValue = driver.findElement(By.xpath("/html/body/div/form/strong[1]")).getText();
		Assert.assertEquals(expectedValue,"500");
		driver.findElement(By.name("item_qty")).sendKeys(itemqty);
		driver.findElement(By.xpath("//button[@id='totalprice']")).click();
		Thread.sleep(500);
		driver.switchTo().alert().accept();	
		String totalPrice = driver.findElement(By.id("list")).getText();
		Assert.assertEquals(totalPrice,"Total Price:");	
		Thread.sleep(500);
		driver.close();
   }
	@Test
	public void Should_clear_data() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/siq/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		String itemname = "Adidas";
		String itemqty = "5";
		driver.findElement(By.name("item_name")).sendKeys(itemname);
		driver.findElement(By.xpath("//button[@id='singleitem']")).click();
		driver.findElement(By.name("item_qty")).sendKeys(itemqty);
		driver.findElement(By.xpath("//button[@id='cleardata']")).click();	
		String abc = driver.findElement(By.name("item_name")).getAttribute("class");
		Boolean status = abc.contains("ng-empty");
		Assert.assertEquals(status,true);
		String xyz = driver.findElement(By.name("item_qty")).getAttribute("class");
		Boolean status1 = xyz.contains("ng-empty");
		Assert.assertEquals(status1,true);
		System.out.println("clear the data");
		Thread.sleep(500); 
		driver.close();
	}
	@Test
	public void Should_Pass_two_different_pair_Of_Shoes() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/siq/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		String itemname = "Adidas";
		String itemqty = "3";
     	driver.findElement(By.name("item_name")).sendKeys(itemname);
		driver.findElement(By.xpath("//button[@id='singleitem']")).click();
		String expectedValue = driver.findElement(By.xpath("/html/body/div/form/strong[1]")).getText();
		Assert.assertEquals(expectedValue,"500");
		driver.findElement(By.name("item_qty")).sendKeys(itemqty);
		driver.findElement(By.xpath("//button[@id='totalprice']")).click();
		Thread.sleep(2000);
		int qty = Integer.parseInt(itemqty);
		int value = Integer.parseInt(expectedValue);
		int actualTotalPrice = value*qty;
		String totalPrice = driver.findElement(By.id("list")).getText();
		String compareValue = "Total Price: "+actualTotalPrice;
		Assert.assertEquals(compareValue,totalPrice);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='cleardata']")).click();
		String xyz = driver.findElement(By.name("item_qty")).getAttribute("class");
		Boolean status = xyz.contains("ng-empty");
		Assert.assertEquals(status,true);
		System.out.println("clear the data");
		String itemname1 = "Nike";
		String itemqty1 = "2";
     	driver.findElement(By.name("item_name")).sendKeys(itemname1);
		driver.findElement(By.xpath("//button[@id='singleitem']")).click();
		String expectedValue1 = driver.findElement(By.xpath("/html/body/div/form/strong[1]")).getText();
		System.out.println("value of single item price " + expectedValue1);
		Assert.assertEquals(expectedValue1,"3500");
		Thread.sleep(500);
		driver.findElement(By.name("item_qty")).sendKeys(itemqty1);
		driver.findElement(By.xpath("//button[@id='totalprice']")).click();
		int qty1 = Integer.parseInt(itemqty);
		int value1 = Integer.parseInt(expectedValue);
		int actualTotalPrice1 = value1*qty1;
		String totalPrice1 = driver.findElement(By.id("list")).getText();
		Thread.sleep(500);
		System.out.println("The "+totalPrice1);
		String compareValue1 = "Total Price: "+actualTotalPrice1;
		Assert.assertEquals(compareValue1,totalPrice);
		driver.close();
	}
}
