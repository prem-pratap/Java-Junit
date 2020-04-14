package junit.first;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({stringPallindromeTesting.class,EmployeeTesting.class,Demo1Testing.class,CalculatorTesting.class})
public class TesterAll {
	

}
