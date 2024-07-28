package com.becognizant.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import com.becognizant.pageObjects.*;
import com.becognizant.utilities.*;
import baseClass.BaseClass;

@Listeners(com.becognizant.utilities.ExtentReportManager.class)
public class TC003_GSDPage extends TC002_OneCognizant{
	
	//Test 1: Check if Be.Cognizant is visible or not
		@Test(priority = 1)        
		public void beCognizantTextValidation(){
			BeCognizant bCog = new BeCognizant(driver);     //Instance of BeCognizant.java
			String text = bCog.beCognizantVisibility();
			Assert.assertEquals(text,p.getProperty("beCognizantText"));		 //Validation
			
			logger.info("--//beCognizant text Validation Done//--");
		}
		
		
		// Test 2: Profile Validation 
		@Test(priority = 2)     
		public void profileValidation() throws IOException, InterruptedException {
			com.becognizant.pageObjects.BeCognizant bCog = new com.becognizant.pageObjects.BeCognizant(driver);
			Thread.sleep(5000);
			com.becognizant.utilities.Screenshots ss = new com.becognizant.utilities.Screenshots();
			bCog.clickOnProfile();
			Thread.sleep(3000);
			
			ss.ScreenShot("BeCognizantProfile.png");     // Screenshot 1: if the Profile is displayed
			logger.info("--//BeCognizant Profile Screenshot Taken//--");
			
			
			
		}
		
		// Test 3: Check if OneCognizant is present 
		@Test(priority = 3)
		public void oneCognizantTextValidation() {
			System.out.println("Sharma, Harshit (Contractor)\n"+"232733");
			com.becognizant.pageObjects.BeCognizant bCog = new com.becognizant.pageObjects.BeCognizant(driver);
			boolean textOneCognizant = bCog.oneCognizantVisibility().equalsIgnoreCase(p.getProperty("oneCognizantText"));
			Assert.assertEquals(textOneCognizant,true);        // Validation
			logger.info("--//OneCognizant text Validation Done//--");
		}
		
		//Test 4: Navigate to OneCognizant 
		@Test(priority = 4)
		public void navigateOneCognizant() throws IOException, InterruptedException {
			com.becognizant.pageObjects.BeCognizant bCog = new com.becognizant.pageObjects.BeCognizant(driver);
			bCog.clickOneCognizant();
			
			logger.info("--//Switch to OneCognizant from BeCognizant Done//--");
			Screenshots ss = new Screenshots();
			Thread.sleep(5000);
			ss.ScreenShot("OneCognizant.png");     // Screenshot 2: of OneCognizant Page
			logger.info("--//OneCognizant Screenshot Taken//--");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		//Test 5: Search "GSD" in the textArea
		@Test(priority = 5)
		public void searchGsd() throws InterruptedException, IOException{
			OneCognizant oneCog = new OneCognizant(driver);     //Instance of BeCognizant.java
			com.becognizant.utilities.Screenshots ss = new com.becognizant.utilities.Screenshots();
			
			// Condition if Edge searech button need to be clicked first then search "GSD"
			if(choice==2) {
				oneCog.clickandsearchmagnifier(p.getProperty("searchText"));
			}
			else {
				oneCog.searchText(p.getProperty("searchText"));
			}
			logger.info("--//Search 'GSD' Done//--");
			Thread.sleep(3000);
			ss.ScreenShot("SearchResult.png");    // Screenshot 3: Getting the search Result screenshot
			logger.info("--//'GSD' Search Result Screenshot Taken//--");
		}
		
		//Test 6: Clicking on the GSD Button
		@Test(priority = 6)
		public void clickOnGSD() throws InterruptedException, IOException{
			OneCognizant oneCog = new OneCognizant(driver);
			Screenshots ss = new Screenshots();
			oneCog.clickOnGsd();
			logger.info("--//Click on 'GSD' Done//--");
			Thread.sleep(5000);
			ss.ScreenShot("GSDIndia.png");        // Screenshot 4: GSD India page screenshot
			logger.info("--//'GSD' Page Screenshot Taken//--");
		}
	
	
	
	
		
		
		
	
	
	
	

	// Test 7: Verify if the WelCome Message and browse Message is available
	@Test(priority = 7)
	public void verifyMessage(){
		GSDPage gsdP = new GSDPage(driver);
		String welcomeText = gsdP.getWelcomeMsg();
		String browseText = gsdP.getBrowseMsg();
		
		
		
		Assert.assertEquals(welcomeText, p.getProperty("WelComeMessage"));
		logger.info("--//Welcome Message Verified//--");
		System.out.println("Welcome Message is validated");
		Assert.assertEquals(browseText, p.getProperty("BrowseMessage"));
		logger.info("--//Browse Message Verified//--");
		System.out.println("Browser Message is validated");
	}
	
	// Test 8: Verify if the Default Language is present ("English")
	@Test(priority = 8)
	public void verifyDefaultLanguage() {
		GSDPage gsdP = new GSDPage(driver);
		String lang = gsdP.getDefaultLanguage();
		Assert.assertEquals(lang, p.getProperty("defaultLanguage"));
		logger.info("--//Default Language Verified//--");
		System.out.println("Default Language is English");
	}
	
	// Test 8: Verify if the Default Country is present ("India")
	@Test(priority = 9)
	public void verifyDefaultCountry() {
		GSDPage gsdP = new GSDPage(driver);
		String country = gsdP.getDefaultCountry();
		Assert.assertEquals(country, p.getProperty("defaultCountry"));
		logger.info("--//Default Country Verified//--");
		System.out.println("Default Country is India");
		
	}
	
	//Test 9: Get all available Languages and print on console and write into testexcel.xslx
	@Test(priority = 10)
	public void verifyAvailableLanguages() throws IOException{
		GSDPage gsdP = new GSDPage(driver);
		
		ExcelUtils excel = new ExcelUtils();
		String xlFile = System.getProperty("user.dir")+"\\testData\\testexcel.xlsx";
		
		List<WebElement> lang = gsdP.getAVailableLanguages();  // Getting all languages in a list
		System.out.println("-------AVAILABLE LANGUAGES------");
		
		Screenshots ss = new Screenshots();
		ss.ScreenShot("Languages.png");						//Getting the screenshot of Languages
		logger.info("--//Screenshot taken showing all languages//--");
		for(int l = 0 ; l< lang.size();l++) {
			System.out.println(lang.get(l).getText());    // Print all lnaguages on console
			excel.setCellData(xlFile, "Lnaguages", l+1, 0, lang.get(l).getText());     // Write all languages in testexcel.xlsx
		}
		logger.info("--//All AVailable Languages Taken//--");
	}
	

	//Test 11: Getting all ticket details for the default country("India")
	@Test(priority=11)
	public void defaultCountryTickets() throws IOException {
		GSDPage gsdP =  new GSDPage(driver);
		
		ExcelUtils excel = new ExcelUtils();
		String xlFile = System.getProperty("user.dir")+"\\testData\\testexcel.xlsx";
		
		String defaultCountry = gsdP.getDefaultCountry();
		String sheetName = defaultCountry+"Tickets";       // Name of the sheet in excel
		
		//Call methods for getting ticket details
		verifyITInfraSupport(sheetName);
		verifyHumanResources(sheetName);
		verifyITApplicationSupport(sheetName);
		verifyPolicyProcessSupport(sheetName);
		
		//Writing Name of country
		excel.setCellData(xlFile, sheetName, 10, 0, defaultCountry);
		excel.fillGreenColor(xlFile, sheetName, 10, 0);
		
		logger.info("--//All AVailable Tickets of Default Country Taken//--");
	}

	//Test 12: Picking 3 random countries and getting all the ticket details
	@Test(priority = 12)
	public void randomCountry() throws InterruptedException, IOException {
		GSDPage gsdP = new GSDPage(driver);
		Screenshots ss = new Screenshots();
		
		List<WebElement> country = gsdP.getAvailableCountries();
		gsdP.clickCountries();
		
		int size = country.size();
		System.out.println(size);
		
		gsdP.clickCountries();
		
		int count=0;
		for(int i=0;i<size;i++) {
			int choosenNo = randomNumber(size);    //getting a random number within the range = size = no. of countries
			System.out.println(choosenNo);			// Print the choosen random number
			if(choosenNo!=0) {
				count++;
				gsdP.clickCountries();
				
				String coun = country.get(choosenNo).getText();      // Get the name of the country
				country.get(choosenNo).click();						// Click on the choosen country
				
				System.out.println("Random Country "+count+": "+coun);   // Print the country name
				System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
				
				String sheetName = "Country"+count;					// Getting the sheetname for Countries in testexcel.xlsx
				
				//Call methods for getting ticket details
				verifyITInfraSupport(sheetName);
				verifyHumanResources(sheetName);
				verifyITApplicationSupport(sheetName);
				verifyPolicyProcessSupport(sheetName);
				
				ExcelUtils excel = new ExcelUtils();
				String xlFile = System.getProperty("user.dir")+"\\testData\\testexcel.xlsx";
				
				//Writing the country name in Excel
				excel.setCellData(xlFile, sheetName, 10, 0, coun);
				excel.fillGreenColor(xlFile, sheetName, 10, 0);
				
				Thread.sleep(5000);
				ss.ScreenShot(coun+".png");   // Getting the screenshot for countries displayed as country_name.png 
				
			}
			// Breaking the loop if 2 countries are selected 
			if(count==3) {
				break;
			}
		}
		logger.info("--//All AVailable Tickets of 2 Random Countries Taken//--");
		
	}
	
}