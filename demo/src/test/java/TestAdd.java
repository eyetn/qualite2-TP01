

import org.junit.Assert;
import org.junit.Test;

import com.example.Add;

public class TestAdd {

    @Test
    public void testAddition(){
        // GIVEN
        int a = 3;
        int b = 12;

        // WHEN
        int resTest = a + b;

        // THEN
        Assert.assertEquals("Echec test add", resTest, Add.add(a,b));
    }
}
