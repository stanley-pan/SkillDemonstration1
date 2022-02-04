import static org.junit.Assert.*;
import org.junit.*;

public class CombineStringTest {
    @Test
    public void CombineStringTest(){
        String result = CombineString.CombineString("blue", "berry");
        assertEquals("greenberry", result); // wrong test
    }
}
