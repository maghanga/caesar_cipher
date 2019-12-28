import org.junit.*;
import static org.junit.Assert.*;

public class CaesarTest {

    @Test
    public void runCipher_returnString_String(){
        Caesar testCipher = new Caesar("nebuchadnezzer",2);
        String expectedOutput = new String();
        assertEquals(expectedOutput, testCipher);

    }


//    @Test
//    public void runPingPong_replaceMultiplesOf5_ArrayList() {
//        PingPong testPingPong = new PingPong();
//        ArrayList<Object> expectedOutput = new ArrayList<Object>();
//        expectedOutput.add(1);
//        expectedOutput.add(2);
//        expectedOutput.add("ping");
//        expectedOutput.add(4);
//        expectedOutput.add("pong");
//        assertEquals(expectedOutput, testPingPong.runPingPong(5));
//    }


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}