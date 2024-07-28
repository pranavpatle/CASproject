### GSD

## Detailed Description:
- Navigate to Be. Cognizant Website and capture the user information.<br>
- Click One Cognizant application.<br>
- Search GSD in One Cognizant and click on Live Support - GSD application from search results.<br>
- Validate the welcome message of GSD Application.<br>
- Validate the default country and language.<br>
- Get all the drop-down details from Language drop down.<br>
- Get all the details present in the GSD page with tooltips and by changing Location from drop down (for three random Locations).<br>
  Note: Take all necessary screenshots for all the testcases and print all the data in the console.<br>
  
  
## Key Automation Scope:
- Handling alert, different browser windows, search option.<br>
- Navigating back to home page.<br>
- Extract multiple options items & store in collections.<br>
- Capture warning message.<br>
- Data Driven approach.<br>
- Cross Browser Testing.<br>
 
##Tools with its version
- maven		:		4.0.0
- selenium	:		4.17.0
- testng	: 		7.9.0
- apache.poi:		5.2.5	

## JAR FILES:

`<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd"><br>
  <modelVersion>4.0.0</modelVersion><br>
  <groupId>CASProject</groupId><br>
  <artifactId>CASProject</artifactId><br>
  <version>0.0.1-SNAPSHOT</version><br>
  <dependencies><br>
  
	  <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java --><br>
	<dependency><br>
	    <groupId>org.seleniumhq.selenium</groupId><br>
	    <artifactId>selenium-java</artifactId><br>
	    <version>4.17.0</version><br>
	</dependency><br>
  
	  <!-- https://mvnrepository.com/artifact/org.testng/testng --><br>
	<dependency><br>
	    <groupId>org.testng</groupId><br>
	    <artifactId>testng</artifactId><br>
	    <version>7.9.0</version><br>
	    <scope>test</scope><br>
	</dependency><br>
	
	
	<dependency><br>
	    <groupId>org.apache.logging.log4j</groupId><br>
	    <artifactId>log4j-api</artifactId><br>
	    <version>2.20.0</version><br>
	</dependency><br>
	
	<dependency><br>
	    <groupId>org.apache.logging.log4j</groupId><br>
	    <artifactId>log4j-core</artifactId><br>
	    <version>2.20.0</version><br>
	</dependency><br>
	
	<dependency><br>
	    <groupId>org.apache.logging.log4j</groupId><br>
	    <artifactId>log4j-slf4j-impl</artifactId><br>
	    <version>2.20.0</version><br>
	</dependency><br>
	
	<!-- https://mvnrepository.com/artifact/org.apache.poi/poi --><br>
	<dependency><br>
	    <groupId>org.apache.poi</groupId><br>
	    <artifactId>poi</artifactId><br>
	    <version>5.2.5</version><br>
	</dependency><br>
	
	<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml --<br>
	<dependency><br>
	    <groupId>org.apache.poi</groupId><br>
	    <artifactId>poi-ooxml</artifactId><br>
	    <version>5.2.5</version><br>
	</dependency><br>

	<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports --><br>
	<dependency><br>
		<groupId>com.aventstack</groupId><br>
		<artifactId>extentreports</artifactId><br>
		<version>5.1.1</version><br>
	</dependency><br>
	
		<!-- https://mvnrepository.com/artifact/io.basc.framework/log4j2 --><br>
	<dependency><br>
	    <groupId>io.basc.framework</groupId><br>
	    <artifactId>log4j2</artifactId><br>
	    <version>1.8.3</version><br>
	    <scope>test</scope><br>
	</dependency><br>


  </dependencies><br>
</project><br>

 
## OUTPUT:(chrome/Edge)

[RemoteTestNG] detected TestNG version 7.9.0<br>
17:13:31.555 [main] INFO  org.testng.internal.Utils - [TestNG] Running:<br>
  C:\Users\2327160\eclipse-workspace\CASProject\testng.xml<br>
<br>
Apr 02, 2024 5:13:38 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch<br>
WARNING: Unable to find an exact match for CDP version 123, returning the closest version; found: 121; Please update to a Selenium version that supports CDP version 123<br>
17:14:26.650 [main] INFO  testScenario.GSD - Verified the user Information and clicking on live Support GSD by searching GSD<br>
17:14:57.103 [main] INFO  testScenario.GSD - Validated Welcome Message<br>
17:14:57.418 [main] INFO  testScenario.GSD - Validated Language<br>
17:14:57.585 [main] INFO  testScenario.GSD - validated Country<br>
17:15:18.128 [main] INFO  testScenario.GSD - country Wise Ticket and Tooltip for 3 random country<br>
17:15:53.212 [main] INFO  testScenario.GSD - Verified the user Information and clicking on live Support GSD by searching GSD<br>
17:16:23.615 [main] INFO  testScenario.GSD - Validated Welcome Message<br>
17:16:23.948 [main] INFO  testScenario.GSD - Validated Language<br>
17:16:24.119 [main] INFO  testScenario.GSD - validated Country<br>
17:16:42.555 [main] INFO  testScenario.GSD - country Wise Ticket and Tooltip for 3 random country<br>
<br>
===============================================<br>
test suite<br>
Total tests run: 10, Passes: 10, Failures: 0, Skips: 0<br>
===============================================<br>

