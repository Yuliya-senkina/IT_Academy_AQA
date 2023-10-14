public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println("Sum integer = "+ calc.sum(1,3));
        System.out.println("Sub integer = "+ calc.sub(3,1));
        System.out.println("Multiply integer = "+ calc.multiply(3,5));
        System.out.println("Div integer = "+ calc.div(3,5));
        System.out.println("Sum double = "+ calc.sum(1.5,3.7));
        System.out.println("Sub double = "+ calc.sub(3.2,1.25));
        System.out.println("Multiply double = "+calc.multiply(3.5,5.6));
        System.out.println("Div double = "+ calc.div(3.5,5.6));
        System.out.println("Sum double+int = "+ calc.sum(1.5,3));
        
        System.out.println("Sub double+int = "+ calc.sub(3.2,1));
        System.out.println("Multiply double+int = "+calc.multiply(3.5,5));
        System.out.println("Div double+int = "+ calc.div(3.5,5));
        System.out.println("Sum string+string = "+calc.sum("23","17"));
        System.out.println("Sum string+string = "+calc.sub("23","17"));
        System.out.println("Sum string+string = "+calc.multiply("23","17"));
        System.out.println("Sum string+string = "+calc.div("23","17"));
    }
}
