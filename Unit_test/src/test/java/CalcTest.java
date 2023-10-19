import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    public void testSum(){
      Calc calc = new Calc();
        double actual = calc.sum(1,1000);
      Assertions.assertEquals(1001,actual);
    }
    @Test
    public void testSum2(){
        Calc calc = new Calc();
        double actual = calc.sum(-1,-1000);
        Assertions.assertEquals(-1001,actual);
    }
    @Test
    public void testSub(){
        Calc calc2 = new Calc();
        double actual = calc2.sub(0,500);
        Assertions.assertEquals(-500,actual);
    }
    @Test
    public void testSub2(){
        Calc calc2 = new Calc();
        double actual = calc2.sub(-500,500);
        Assertions.assertEquals(-1000,actual);
    }
    @Test
    public void testMultiply(){
        Calc calc2 = new Calc();
        double actual = calc2.multiply(3,4);
        Assertions.assertEquals(12,actual);
    }
    @Test
    public void testMultiply2(){
        Calc calc2 = new Calc();
        double actual = calc2.multiply(0,4);
        Assertions.assertEquals(0,actual);
    }
    @Test
    public void testDiv(){
        Calc calc2 = new Calc();
        double actual = calc2.div(4,2);
        Assertions.assertEquals(2,actual);
    }
    @Test
    public void testDiv2(){
        Calc calc2 = new Calc();
        double actual = calc2.div(4,-1);
        Assertions.assertEquals(-4,actual);
    }
    @Test
    public void testDiv3(){
        Calc calc2 = new Calc();
        double actual = calc2.div(4,0);
        Assertions.assertEquals(Double.MAX_VALUE,actual);
    }
}
