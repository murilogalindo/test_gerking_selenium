package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="/home/murilo/Documentos/Kabum/Features/Login.feature",glue={"stepDefinitions"})
public class TestRunner {


}
