package tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import runTests.EncryptionMachine;

public class CaesarCipherInputTest {

    @Test
    public void testPromptForKey() {
        assertEquals(EncryptionMachine.promptForKey(new Scanner("csci")), "csci");
    }

    @Test
    public void testPromptForWordCount() {
        assertEquals(EncryptionMachine.promptForWordCount(new Scanner("4")), 4);
    }
}
