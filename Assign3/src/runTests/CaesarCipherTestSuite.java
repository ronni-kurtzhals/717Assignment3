package runTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    CaesarCipherSingleLetterTest.class,
    CaesarCipherParametrizedLetterTest.class,
    CaesarCipherPerformanceTest.class,
    CaesarCipherInputTest.class,
    CaesarCipherOutputTest.class
})

public class CaesarCipherTestSuite {
    //container for test classes!
}
