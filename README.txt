GSD---
========
Problem Statement: GSD
========================

1.Get all the details from GSD of Different Locations
2.Validate the default country and language.
3.Get all the details from GSD of Different Locations.
-(Suggested Site: https://be.cognizant.com)

Detailed Description: Main Project

1.Navigate to Be. Cognizant Website and capture the user information.
2.Click One Cognizant application.
3.Search GSD in One Cognizant and click on Live Support - GSD application from search results.
4.Validate the welcome message of GSD Application.
5.Validate the default country and language.
6.Get all the drop-down details from Language drop down.
7.Get all the details present in the GSD page with tooltips and by changing Location from drop down (for three random Locations).

Note: Take all necessary screenshots for all the testcases and print all the data in the console.

Key Automation Scope

-Handling alert, different browser windows, search option.
-Navigating back to home page.
-Extract multiple options items & store in collections.
-Capture warning message.
-Data Driven approach.
-Cross Browser Testing.



Output (Chrome and Edge):
=======================

BeCognizant page is opened.
User datails are captured.
Page scrolled and clicked on OneCognizant.
GSD is entered in the search bar on the One Cognizant page.
Clicked on the GSD Live Support application.
Default language and country is validated.
Details from laguage dropdown is taken.
Tool tips for 3 random countries are printed on the console.


Jar Files :-
==============


<dependencies>
	  
	  <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
	<dependency>
	    <groupId>org.seleniumhq.selenium</groupId>
	    <artifactId>selenium-java</artifactId>
	    <version>4.15.0</version>
	</dependency>
	
	
	<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
	<dependency>
	    <groupId>io.github.bonigarcia</groupId>
	    <artifactId>webdrivermanager</artifactId>
	    <version>5.5.3</version>
	</dependency>
	
	
	<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
	<dependency>
	    <groupId>org.apache.poi</groupId>
	    <artifactId>poi</artifactId>
	    <version>5.2.2</version>
	</dependency>
	
	
	<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
	<dependency>
	    <groupId>org.apache.poi</groupId>
	    <artifactId>poi-ooxml</artifactId>
	    <version>5.2.2</version>
	</dependency>
	
	
	<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
	<dependency>
	    <groupId>org.apache.logging.log4j</groupId>
	    <artifactId>log4j-core</artifactId>
	    <version>2.20.0</version>
	</dependency>
	
	
	<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api -->
	<dependency>
	    <groupId>org.apache.logging.log4j</groupId>
	    <artifactId>log4j-api</artifactId>
	    <version>2.20.0</version>
	</dependency>
	
	
	<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
	<dependency>
	    <groupId>commons-io</groupId>
	    <artifactId>commons-io</artifactId>
	    <version>2.11.0</version>
	</dependency>
	
	
	<!-- https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 -->
	<dependency>
	    <groupId>org.apache.commons</groupId>
	    <artifactId>commons-lang3</artifactId>
	    <version>3.12.0</version>
	</dependency>
	
	
	<!-- https://mvnrepository.com/artifact/org.testng/testng -->
	<dependency>
	    <groupId>org.testng</groupId>
	    <artifactId>testng</artifactId>
	    <version>7.7.1</version>
	    <scope>test</scope>
	</dependency>
	
	
	<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
	<dependency>
	    <groupId>com.aventstack</groupId>
	    <artifactId>extentreports</artifactId>
	    <version>5.0.9</version>
	</dependency>

  
  </dependencies>


