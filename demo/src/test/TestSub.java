import org.junit.*;
import Sub.*;

public class TestSub {

    @Test
    public void testSub(){
        Assert.assertEquals("Echec test sub",3,Sub.sub(5, 2));
    }
}
