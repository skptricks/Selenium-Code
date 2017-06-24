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
	    


