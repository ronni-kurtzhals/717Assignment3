package tests;

import org.junit.Test;

import runTests.EncryptionMachine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CaesarCipherPerformanceTest {

    @Test(timeout = 1000)
    public void testPerformanceLargeWord() {
        assertTrue(EncryptionMachine.encryptWord("pneumonoultramicroscopicsilicovolcanoconiosis").equals("sqhxprqrxowudplfurvfrslfvlolfryrofdqrfrqlrvlv"));
    }
}
