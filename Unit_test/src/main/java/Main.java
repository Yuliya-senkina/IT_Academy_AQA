public class Main {
    public static void main(String[] args) {
      Calc calc = new Calc();
      double result;
      result=calc.sum(1,2);
      System.out.println("1 + 2 = "+result);
      Assertions.assertEquals(result,3);
        result = calc.div(10, 0);
        if (result == Double.MAX_VALUE) {
            System.out.println("Деление на 0 не допустимо");
        } else
            System.out.println(result + "\n");
    }
}
