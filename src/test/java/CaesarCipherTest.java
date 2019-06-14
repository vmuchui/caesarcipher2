import org.junit.*;
import static org.junit.Assert.*;

public class CaesarCipherTest {
    @Test
    public void CaesarCipher_instantiatesCorrectly_true() {
        CaesarCipher testCaesarCipher = new CaesarCipher("me", 1);
        assertTrue(testCaesarCipher instanceof CaesarCipher);
    }
    @Test
    public void getName_returnsString_string() {
        CaesarCipher testCaesarCipher = new CaesarCipher("me", 1);
        assertEquals("me", testCaesarCipher.getName());
    }
    @Test
    public void getKey_returnsString_int() {
        CaesarCipher testCaesarCipher = new CaesarCipher("me",1);
        assertEquals(1, testCaesarCipher.getKey());
    }
    @Test
    public void encrypt_returnsString_String() {
        CaesarCipher testCaesarCipher = new CaesarCipher("me",1);
        assertEquals("nf", testCaesarCipher.encrypt());
    }
    @Test
    public void encrypt_shiftCharactersAppropriately_String() {
        CaesarCipher testCaesarCipher = new CaesarCipher("me",1);
        assertEquals("nf", testCaesarCipher.encrypt());
    }
    @Test
    public void encrypt_doesNotAcceptValuesHigherThan26_String() {
        CaesarCipher testCaesarCipher = new CaesarCipher("me",29);
        assertEquals("ph", testCaesarCipher.encrypt());
    }
    @Test
    public void encrypt_doesNotAcceptValuesLessThan0_String() {
        CaesarCipher testCaesarCipher = new CaesarCipher("me",-1);
        assertEquals("me", testCaesarCipher.encrypt());
    }
    @Test
    public void encrypt_doesNotReturnNonLetterCharacters_String() {
        CaesarCipher testCaesarCipher = new CaesarCipher("z",1);
        assertEquals("A", testCaesarCipher.encrypt());
    }

    @Test
    public void encrypt_returnsLetterCharactersForCapitalLetters_String() {
        CaesarCipher testCaesarCipher = new CaesarCipher("Z",1);
        assertEquals("a", testCaesarCipher.encrypt());
    }
    public void decrypt_returnsString_String() {
        CaesarCipher testCaesarCipher = new CaesarCipher("z",1);
        assertEquals("y", testCaesarCipher.decrypt());
    }
    @Test
    public void decrypt_decryptsWordsToReturnOriginalValue_String() {
        String expected = "name";
        CaesarCipher testCaesar = new CaesarCipher(expected, 2);
        String encrypted = testCaesar.encrypt();
        CaesarCipher newCaesar = new CaesarCipher(encrypted, 2);
        assertEquals(expected, newCaesar.decrypt());
    }
    @Test
    public void decrypt_doesNotAcceptValuesLessThan0_String() {
        CaesarCipher testCaesar = new CaesarCipher("name", -2);
        assertEquals("name",testCaesar.decrypt());
    }
    @Test
    public void decrypt_doesNotReturnNonLetterCharacters_String() {
        CaesarCipher testCaesarCipher = new CaesarCipher("a", 1);
        assertEquals("Z", testCaesarCipher.decrypt());
    }
    @Test
    public void decrypt_returnsLettersForCapitalLetters_String() {
        CaesarCipher testCaesarCipher = new CaesarCipher("A", 1);
        assertEquals("z", testCaesarCipher.decrypt());
    }
 }