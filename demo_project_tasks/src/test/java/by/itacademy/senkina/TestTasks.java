package by.itacademy.senkina;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestTasks {
    @Test
    public void testCheckExelent(){
        Tasks tasks = new Tasks();
        String actual = tasks.check(1,1,2);
        Assertions.assertEquals("excelent",actual);
    }
    @Test
    public void testCheckGood(){
        Tasks tasks = new Tasks();
        String actual = tasks.check(1,1,0);
        Assertions.assertEquals("good",actual);
    }

    @Test
    public void testCheckFine(){
        Tasks tasks = new Tasks();
        String actual = tasks.check(1,-5,0);
        Assertions.assertEquals("fine",actual);
    }

    @Test
    public void testCheckBad(){
        Tasks tasks = new Tasks();
        String actual = tasks.check(-1,-5,-100);
        Assertions.assertEquals("bad",actual);
    }
}
