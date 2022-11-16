package jUnitTestPackage;
//devBhardwaj_E21CSEU0275

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testAddInt.class, testAddStr.class })
public class AllTestsCheck {

}
