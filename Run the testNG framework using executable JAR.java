// Type one method... <Calling by method>
---------------------------------------------------
    TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { DataproviderExample.class });
		testng.addListener(tla);
		testng.run();
    
    

// Type two method... <Calling by xml file>
---------------------------------------------------
TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		//suites.add("D:\\selenium_sumit\\Workspace\\SeleniumTestNG\\ParameteriseUsingXML\\XMLdata.xml");//path to xml..
		suites.add("/SeleniumTestNG/ParameteriseUsingXML/XMLdata.xml");
		testng.setTestSuites(suites);
		testng.run();
