package by.itacademy.senkina;

public class MainChar {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch);
        char ch1 = (char)(Math.random()*1000);
        char ch2 = (char)(Math.random()*1000);
        char ch3 = (char)(Math.random()*1000);
        String name = ""+ch1+ch2+ch3;
        System.out.println(name);
    }
}
