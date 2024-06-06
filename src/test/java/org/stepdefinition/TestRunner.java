package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\91958\\eclipse-workspace\\NewCucumber\\src\\test\\resources\\Facebook\\Facebookpro.feature",
                 glue="org.stepdefinition",
                 monochrome=true,
                 dryRun=false,
                 strict=false,
                 plugin= {"html:HtmlReport","junit:JunitReport\\junit.xml","json:JsonReport\\jsonr.json"})
























public class TestRunner {

}
