package tests;

import org.junit.Test;

import runTests.EncryptionMachine;

import static org.junit.Assert.assertEquals;

public class CaesarCipherParametrizedLetterTest {

    @Test
    public void testParametrizedLetterEncryption() {
        assertEquals(EncryptionMachine.encryptWord("hello"), "khoor");
    }

    @Test
    public void testParametrizedLetterEncryptionWrapAround() {
        assertEquals(EncryptionMachine.encryptWord("xyz"), "abc");
    }
}
