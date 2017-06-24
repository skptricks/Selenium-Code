// load the webpage using chrome driver...

System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_sumit\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.google.com/");	    
	    driver.manage().window().maximize();  // maximize window
