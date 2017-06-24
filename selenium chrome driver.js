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

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    


