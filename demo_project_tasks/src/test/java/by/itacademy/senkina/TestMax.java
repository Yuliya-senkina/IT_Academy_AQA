package by.itacademy.senkina;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMax {
    @Test
    public void testCheckExelent(){
        Max tasks = new Max();
        int actual = tasks.max(1,2);
        Assertions.assertEquals(2,actual);
    }
}
