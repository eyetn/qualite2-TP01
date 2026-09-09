import org.junit.*;

public class TestSub {

    @Test
    public void testSub(){

        //GIVEN 
        int a=5,b=2;

        //WHEN
        int res=a-b;

        //THEN
        Assert.assertEquals("Echec test sub",res,Sub.sub(a, b));
    }
}
