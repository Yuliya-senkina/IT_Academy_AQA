public class Calc {
    int sum(int a, int b){
        return a+b;
    }
    double sum(double a, double b){
        return a+b;
    }
    double sum(double a, int b){
        return a+b;
    }

    public String sum(String a, String b) {
        String result = Integer.toString(Integer.parseInt(a)+Integer.parseInt(b));
        return result;
    }
    int sub(int a, int b){
        return a-b;
    }

    double sub(double a, double b){
        return a-b;
    }
    double sub(double a, int b){
        return a-b;
    }

    public String sub(String a, String b) {
        String result = Integer.toString(Integer.parseInt(a)-Integer.parseInt(b));
        return result;
    }
    int multiply(int a, int b){
        return a*b;
    }

    double multiply(double a, double b){
        return a*b;
    }
    double multiply(double a, int b){
        return a*b;
    }
    public String multiply(String a, String b) {
        String result = Integer.toString(Integer.parseInt(a)*Integer.parseInt(b));
        return result;
    }
    int div(int a, int b){
        return a/b;
    }
    double div(double a, double b){
        return a/b;
    }
    double div(double a, int b){
        return a/b;
    }
    public String div(String a, String b) {
        String result = Float.toString(Float.parseFloat(a)/Float.parseFloat(b));
        return result;
    }




}
