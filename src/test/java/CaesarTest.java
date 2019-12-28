import org.junit.*;
import static org.junit.Assert.*;

public class CaesarTest {

    @Test
    public void runCipher_returnStringPlainText_String(){
        Caesar testCipher = new Caesar("tom",2);
        testCipher.getPlainText();
        assertTrue(testCipher.getPlainText() == "tom");
    }

    @Test
    public void runCipher_returnIntShift_Integer(){
        Caesar testCipher2 = new Caesar("nebuchadnezzer", 2);
        testCipher2.getShift();
        assertTrue(testCipher2.getShift() == 2);

    }

    @Test
    public void encrypt_returnEncryptedText_String(){
        Caesar testCipher3 = new Caesar("tom", 2);
        testCipher3.encrypt("tom", 2);
        assertTrue(testCipher3.encrypt("tom", 2) == "vqo");
    }

    @Test
    public void decrypt_returnDecryptedText_String(){
        Caesar testCipher4 = new Caesar("vqo", 2);
        testCipher4.decrypt("vqo", 2);
        assertTrue(testCipher4.decrypt("vqo",2) == "tom");
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}