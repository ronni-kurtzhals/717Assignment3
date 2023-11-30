package tests;

import org.junit.Test;
import runTests.EncryptionMachine;

public class CaesarCipherOutputTest {

    @Test
    public void testWelcomeMessage() {
    	String[] args = {"csci", "2", "hello", "world"};
        EncryptionMachine.main(args);
    }
}
