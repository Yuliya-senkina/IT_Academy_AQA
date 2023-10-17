public class Main {
    public static void main(String[] args) {
      Calc calc = new Calc();
      int result;
      result=calc.sum(1,2);
      System.out.println("1 + 2= "+result);
      Assertions.assertEquals(result,3);
    }
}
