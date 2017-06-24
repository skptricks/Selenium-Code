.......................................
Source code of selenium Web Driver
........................................


// load the webpage using chrome driver...
###############################################################

System.out.println("launching chrome browser");
System.setProperty("webdriver.chrome.driver", "D:\\selenium_sumit\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();	    
driver.navigate().to("https://www.google.com/");
//driver.get("https://www.google.com/");

// maximize the browser window...
##########################################

driver.manage().window().maximize();  // maximize window


// Web driver implicit and explict wait...
######################################################

//Create implicit wait
--------------------------
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//Create explicit wait
--------------------------
WebDriverWait myWait = new WebDriverWait(driver, 10);
myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/h3/a")));


// get the actual value of the page  title...
#######################################################
        actualTitle = driver.getTitle();  // get page title
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close the window
        driver.close();
       
        // exit the program explicitly
        System.exit(0);

// Close the browser window
#######################################
driver.quit();  // using QUIT all windows will close
driver.close(); // close current window

// Extract tag name
########################################################
tagName = driver.findElement(By.id("email")).getTagName();

output:
------------
input  <tag>

// Find element by findElement function
#############################################
WebElement ll = driver.findElement(By.xpath("//*[@id='loginbutton']"));
	    ll.sendKeys("skkkkkkk");

	
// Locating elements the element of page	
################################################################
Summary for locating elements

Variation	 Description	                                                         Sample
----------       ------------------------------------------------                        ---------------
By.className	finds elements based on the value of the "class" attribute	        findElement(By.className("someClassName"))
By.cssSelector	finds elements based on the driver's underlying CSS Selector engine	findElement(By.cssSelector("input#email"))
By.id	locates elements by the value of their "id" attribute	                        findElement(By.id("someId"))  
By.linkText	finds a link element by the exact text it displays	                findElement(By.linkText("REGISTRATION"))  
By.name	locates elements by the value of the "name" attribute	                        findElement(By.name("someName"))  
By.partialLinkText	locates elements that contain the given link text	        findElement(By.partialLinkText("REG"))  
By.tagName	locates elements by their tag name	                                findElement(By.tagName("div"))  
By.xpath	locates elements via XPath	                                        findElement(By.xpath("//html/body/div/tr[5]"))

	


