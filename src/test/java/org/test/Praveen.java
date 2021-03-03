package org.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Praveen {
	static WebDriver driver;
	
	
	@Test
	@Parameters({"Email", "Pass"})
		public void login(String fName, String fValue) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shano\\eclipse-workspace\\FormFillingDataEntry\\drivers\\chromedriver.exe");
		
			driver = new ChromeDriver();
			
			driver.get("https://www.onlinedataentryjob.com/form-filling-work.php");
			driver.manage().window().maximize();
			
	WebElement loginOpt = driver.findElement(By.xpath("//strong[text()='Login']"));
	loginOpt.click();
	
	WebElement dUser = driver.findElement(By.name("user_name"));
	dUser.sendKeys(fName);
	
	WebElement dPass = driver.findElement(By.name("password"));
	dPass.sendKeys(fValue);
	
	WebElement dSumbit = driver.findElement(By.name("login"));
	dSumbit.click();
	
	WebElement earnMoney =  driver.findElement(By.xpath("//strong[text()='Earn Money']"));
	earnMoney.click();
	
	driver.navigate().refresh();
	Thread.sleep(3000);
	
	WebElement earnMoney2 =  driver.findElement(By.xpath("//strong[text()='Earn Money']"));
	earnMoney2.click();
	
	
	WebElement formFilling = driver.findElement(By.xpath("(//img[@alt='START EARNING NOW'])[3]"));
	formFilling.click();
	
	}

	@Test
		public void test1() throws InterruptedException {
		Thread.sleep(1000);
		
		WebElement name = driver.findElement(By.name("name[2284]"));
		WebElement n1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[1]/td[2]"));
		String s1 = n1.getText();
		name.sendKeys(s1);
		  
		WebElement age = driver.findElement(By.name("age[2284]"));
		WebElement a1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[1]/td[3]"));
		String s2 = a1.getText();
		age.sendKeys(s2);
		  
		  WebElement mobile = driver.findElement(By.name("mobile[2284]"));
		  WebElement m1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[1]/td[4]"));
			String s3 = m1.getText();
		  mobile.sendKeys(s3);
		  
		  WebElement city = driver.findElement(By.name("city[2284]"));
		  WebElement c1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[1]/td[5]"));
			String s4 = c1.getText();
		  city.sendKeys(s4);
		  
		  WebElement state = driver.findElement(By.name("state[2284]"));
		  WebElement st1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[1]/td[6]"));
			String s5 = st1.getText();
		  state.sendKeys(s5);
		  
		  WebElement sal = driver.findElement(By.name("salary[2284]"));
		  WebElement sa1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[1]/td[7]"));
			String s6 = sa1.getText();
		  sal.sendKeys(s6);
		  
		  WebElement emi = driver.findElement(By.name("emi[2284]"));
		  WebElement e1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[1]/td[8]"));
			String s7 = e1.getText();
		  emi.sendKeys(s7);
		  
		  WebElement insurance = driver.findElement(By.name("insurance[2284]"));
		  WebElement i1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[1]/td[9]"));
			String s8 = i1.getText();
		  insurance.sendKeys(s8);
		
		  WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
		  nxt.click(); 

	}
	
	
	@Test
	public void test2() throws InterruptedException {
		
		Thread.sleep(1000); 
		WebElement name = driver.findElement(By.name("name[2285]"));
		WebElement n1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[2]/td[2]"));
		String s1 = n1.getText();
		name.sendKeys(s1);
		  
		WebElement age = driver.findElement(By.name("age[2285]"));
		WebElement a1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[2]/td[3]"));
		String s2 = a1.getText();
		age.sendKeys(s2);
		  
		  WebElement mobile = driver.findElement(By.name("mobile[2285]"));
		  WebElement m1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[2]/td[4]"));
			String s3 = m1.getText();
		  mobile.sendKeys(s3);
		  
		  WebElement city = driver.findElement(By.name("city[2285]"));
		  WebElement c1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[2]/td[5]"));
			String s4 = c1.getText();
		  city.sendKeys(s4);
		  
		  WebElement state = driver.findElement(By.name("state[2285]"));
		  WebElement st1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[2]/td[6]"));
			String s5 = st1.getText();
		  state.sendKeys(s5);
		  
		  WebElement sal = driver.findElement(By.name("salary[2285]"));
		  WebElement sa1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[2]/td[7]"));
			String s6 = sa1.getText();
		  sal.sendKeys(s6);
		  
		  WebElement emi = driver.findElement(By.name("emi[2285]"));
		  WebElement e1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[2]/td[8]"));
			String s7 = e1.getText();
		  emi.sendKeys(s7);
		  
		  WebElement insurance = driver.findElement(By.name("insurance[2285]"));
		  WebElement i1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[2]/td[9]"));
			String s8 = i1.getText();
		  insurance.sendKeys(s8);
		
		  WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
		  nxt.click(); 

	}
	
	
@Test
public void test3() throws InterruptedException {
		Thread.sleep(1000);


WebElement name = driver.findElement(By.name("name[2286]"));
		WebElement n1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[3]/td[2]"));
		String s1 = n1.getText();
		name.sendKeys(s1);
		  
		WebElement age = driver.findElement(By.name("age[2286]"));
		WebElement a1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[3]/td[3]"));
		String s2 = a1.getText();
		age.sendKeys(s2);
		  
		  WebElement mobile = driver.findElement(By.name("mobile[2286]"));
		  WebElement m1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[3]/td[4]"));
			String s3 = m1.getText();
		  mobile.sendKeys(s3);
		  
		  WebElement city = driver.findElement(By.name("city[2286]"));
		  WebElement c1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[3]/td[5]"));
			String s4 = c1.getText();
		  city.sendKeys(s4);
		  
		  WebElement state = driver.findElement(By.name("state[2286]"));
		  WebElement st1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[3]/td[6]"));
			String s5 = st1.getText();
		  state.sendKeys(s5);
		  
		  WebElement sal = driver.findElement(By.name("salary[2286]"));
		  WebElement sa1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[3]/td[7]"));
			String s6 = sa1.getText();
		  sal.sendKeys(s6);
		  
		  WebElement emi = driver.findElement(By.name("emi[2286]"));
		  WebElement e1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[3]/td[8]"));
			String s7 = e1.getText();
		  emi.sendKeys(s7);
		  
		  WebElement insurance = driver.findElement(By.name("insurance[2286]"));
		  WebElement i1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[3]/td[9]"));
			String s8 = i1.getText();
		  insurance.sendKeys(s8);
		
		  WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
		  nxt.click(); 
		  
		 }


@Test
public void test4() throws InterruptedException {
		Thread.sleep(1000);


WebElement name = driver.findElement(By.name("name[2287]"));
		WebElement n1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[4]/td[2]"));
		String s1 = n1.getText();
		name.sendKeys(s1);
		  
		WebElement age = driver.findElement(By.name("age[2287]"));
		WebElement a1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[4]/td[3]"));
		String s2 = a1.getText();
		age.sendKeys(s2);
		  
		  WebElement mobile = driver.findElement(By.name("mobile[2287]"));
		  WebElement m1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[4]/td[4]"));
			String s3 = m1.getText();
		  mobile.sendKeys(s3);
		  
		  WebElement city = driver.findElement(By.name("city[2287]"));
		  WebElement c1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[4]/td[5]"));
			String s4 = c1.getText();
		  city.sendKeys(s4);
		  
		  WebElement state = driver.findElement(By.name("state[2287]"));
		  WebElement st1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[4]/td[6]"));
			String s5 = st1.getText();
		  state.sendKeys(s5);
		  
		  WebElement sal = driver.findElement(By.name("salary[2287]"));
		  WebElement sa1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[4]/td[7]"));
			String s6 = sa1.getText();
		  sal.sendKeys(s6);
		  
		  WebElement emi = driver.findElement(By.name("emi[2287]"));
		  WebElement e1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[4]/td[8]"));
			String s7 = e1.getText();
		  emi.sendKeys(s7);
		  
		  WebElement insurance = driver.findElement(By.name("insurance[2287]"));
		  WebElement i1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[4]/td[9]"));
			String s8 = i1.getText();
		  insurance.sendKeys(s8);
		
		  WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
		  nxt.click(); 
		  
		 }


@Test
public void test5() throws InterruptedException {
		Thread.sleep(1000);


WebElement name = driver.findElement(By.name("name[2288]"));
		WebElement n1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[5]/td[2]"));
		String s1 = n1.getText();
		name.sendKeys(s1);
		  
		WebElement age = driver.findElement(By.name("age[2288]"));
		WebElement a1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[5]/td[3]"));
		String s2 = a1.getText();
		age.sendKeys(s2);
		  
		  WebElement mobile = driver.findElement(By.name("mobile[2288]"));
		  WebElement m1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[5]/td[4]"));
			String s3 = m1.getText();
		  mobile.sendKeys(s3);
		  
		  WebElement city = driver.findElement(By.name("city[2288]"));
		  WebElement c1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[5]/td[5]"));
			String s4 = c1.getText();
		  city.sendKeys(s4);
		  
		  WebElement state = driver.findElement(By.name("state[2288]"));
		  WebElement st1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[5]/td[6]"));
			String s5 = st1.getText();
		  state.sendKeys(s5);
		  
		  WebElement sal = driver.findElement(By.name("salary[2288]"));
		  WebElement sa1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[5]/td[7]"));
			String s6 = sa1.getText();
		  sal.sendKeys(s6);
		  
		  WebElement emi = driver.findElement(By.name("emi[2288]"));
		  WebElement e1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[5]/td[8]"));
			String s7 = e1.getText();
		  emi.sendKeys(s7);
		  
		  WebElement insurance = driver.findElement(By.name("insurance[2288]"));
		  WebElement i1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[5]/td[9]"));
			String s8 = i1.getText();
		  insurance.sendKeys(s8);
		
		  WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
		  nxt.click(); 
		  
		 }


@Test
public void test6() throws InterruptedException {
		Thread.sleep(1000);


WebElement name = driver.findElement(By.name("name[2289]"));
		WebElement n1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[6]/td[2]"));
		String s1 = n1.getText();
		name.sendKeys(s1);
		  
		WebElement age = driver.findElement(By.name("age[2289]"));
		WebElement a1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[6]/td[3]"));
		String s2 = a1.getText();
		age.sendKeys(s2);
		  
		  WebElement mobile = driver.findElement(By.name("mobile[2289]"));
		  WebElement m1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[6]/td[4]"));
			String s3 = m1.getText();
		  mobile.sendKeys(s3);
		  
		  WebElement city = driver.findElement(By.name("city[2289]"));
		  WebElement c1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[6]/td[5]"));
			String s4 = c1.getText();
		  city.sendKeys(s4);
		  
		  WebElement state = driver.findElement(By.name("state[2289]"));
		  WebElement st1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[6]/td[6]"));
			String s5 = st1.getText();
		  state.sendKeys(s5);
		  
		  WebElement sal = driver.findElement(By.name("salary[2289]"));
		  WebElement sa1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[6]/td[7]"));
			String s6 = sa1.getText();
		  sal.sendKeys(s6);
		  
		  WebElement emi = driver.findElement(By.name("emi[2289]"));
		  WebElement e1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[6]/td[8]"));
			String s7 = e1.getText();
		  emi.sendKeys(s7);
		  
		  WebElement insurance = driver.findElement(By.name("insurance[2289]"));
		  WebElement i1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[6]/td[9]"));
			String s8 = i1.getText();
		  insurance.sendKeys(s8);
		
		  WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
		  nxt.click(); 
		  
		 }

@Test
public void test7() throws InterruptedException {
		Thread.sleep(1000);


WebElement name = driver.findElement(By.name("name[2290]"));
		WebElement n1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[7]/td[2]"));
		String s1 = n1.getText();
		name.sendKeys(s1);
		  
		WebElement age = driver.findElement(By.name("age[2290]"));
		WebElement a1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[7]/td[3]"));
		String s2 = a1.getText();
		age.sendKeys(s2);
		  
		  WebElement mobile = driver.findElement(By.name("mobile[2290]"));
		  WebElement m1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[7]/td[4]"));
			String s3 = m1.getText();
		  mobile.sendKeys(s3);
		  
		  WebElement city = driver.findElement(By.name("city[2290]"));
		  WebElement c1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[7]/td[5]"));
			String s4 = c1.getText();
		  city.sendKeys(s4);
		  
		  WebElement state = driver.findElement(By.name("state[2290]"));
		  WebElement st1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[7]/td[6]"));
			String s5 = st1.getText();
		  state.sendKeys(s5);
		  
		  WebElement sal = driver.findElement(By.name("salary[2290]"));
		  WebElement sa1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[7]/td[7]"));
			String s6 = sa1.getText();
		  sal.sendKeys(s6);
		  
		  WebElement emi = driver.findElement(By.name("emi[2290]"));
		  WebElement e1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[7]/td[8]"));
			String s7 = e1.getText();
		  emi.sendKeys(s7);
		  
		  WebElement insurance = driver.findElement(By.name("insurance[2290]"));
		  WebElement i1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[7]/td[9]"));
			String s8 = i1.getText();
		  insurance.sendKeys(s8);
		
		  WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
		  nxt.click(); 
		  
		 }

@Test
public void test8() throws InterruptedException {
		Thread.sleep(1000);


WebElement name = driver.findElement(By.name("name[2291]"));
		WebElement n1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[8]/td[2]"));
		String s1 = n1.getText();
		name.sendKeys(s1);
		  
		WebElement age = driver.findElement(By.name("age[2291]"));
		WebElement a1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[8]/td[3]"));
		String s2 = a1.getText();
		age.sendKeys(s2);
		  
		  WebElement mobile = driver.findElement(By.name("mobile[2291]"));
		  WebElement m1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[8]/td[4]"));
			String s3 = m1.getText();
		  mobile.sendKeys(s3);
		  
		  WebElement city = driver.findElement(By.name("city[2291]"));
		  WebElement c1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[8]/td[5]"));
			String s4 = c1.getText();
		  city.sendKeys(s4);
		  
		  WebElement state = driver.findElement(By.name("state[2291]"));
		  WebElement st1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[8]/td[6]"));
			String s5 = st1.getText();
		  state.sendKeys(s5);
		  
		  WebElement sal = driver.findElement(By.name("salary[2291]"));
		  WebElement sa1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[8]/td[7]"));
			String s6 = sa1.getText();
		  sal.sendKeys(s6);
		  
		  WebElement emi = driver.findElement(By.name("emi[2291]"));
		  WebElement e1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[8]/td[8]"));
			String s7 = e1.getText();
		  emi.sendKeys(s7);
		  
		  WebElement insurance = driver.findElement(By.name("insurance[2291]"));
		  WebElement i1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[8]/td[9]"));
			String s8 = i1.getText();				   
		  insurance.sendKeys(s8);
		
		  WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
		  submit.click(); 
		  
		 }





			 
	
@AfterClass
public void close() {
	System.out.println("Task Completed");
	driver.close(); 

}
	

}
