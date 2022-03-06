package tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

public class Runner {
	
	public static void main(String[] args) {
		TestNG testng = new TestNG();
		XmlSuite mySuite = new XmlSuite();
		mySuite.setName("Suite");
		List<XmlSuite> allSuites = new ArrayList<XmlSuite>();
		allSuites.add(mySuite);
		testng.setXmlSuites(allSuites);
	}

}
