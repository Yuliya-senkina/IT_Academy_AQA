public class Calc {
    double sum(int a, int b){
        return (double)a+b;
    }
    double sub(int a, int b){

        return  (double)a-b;
    }
    double multiply(int a, int b){

        return  (double)a*b;
    }
    double div(int a, int b){
        if (b == 0) {
            return Double.MAX_VALUE;
        } else
        return  (double)a/b;
    }
}
