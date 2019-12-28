import org.junit.*;
import static org.junit.Assert.*;

public class CaesarTest {

    @Test
    public void runCipher_returnString_String(){
        Caesar testCipher = new Caesar("nebuchadnezzer",2);
        String expectedOutput = "";
        assertEquals(expectedOutput, testCipher);
    }

    @Test
    public void runCipher_returnInt_Integer(){
        Caesar testCipher2 = new Caesar("nebuchadnezzer", 2);
        Integer expectedOutput2 = 2;
        assertEquals(expectedOutput2, testCipher2 );

    }

    @Test
    public void encrypt_returnShiftedText_String(){
        Caesar testCipher3 = new Caesar("thomas", 2);
        String expectedOutput = new String();
        assertEquals(expectedOutput, testCipher3.encrypt("vjqocu",2));

    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}