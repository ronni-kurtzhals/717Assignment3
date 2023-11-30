package tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import runTests.EncryptionMachine;

public class CaesarCipherSingleLetterTest {

    @Test
    public void testSingleLetterEncryption() {
        assertEquals(EncryptionMachine.encryptWord("a"), "d");
    }

    @Test
    public void testSingleLetterEncryptionWrapAround() {
        assertEquals(EncryptionMachine.encryptWord("x"), "a");
    }
}
