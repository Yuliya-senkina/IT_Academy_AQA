package by.itacademy.senkina;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGreet {
    @Test
    public void testGenerateGreet(){
        Greet tasks = new Greet();
        String actual = tasks.generateGreet("Kate");
        Assertions.assertEquals("Hello Kate!",actual);
    }

    @Test
    public void testGenerateGreetNull(){
        Greet tasks = new Greet();
        String actual = tasks.generateGreet(null);
        Assertions.assertEquals("Hello !",actual);
    }
}
