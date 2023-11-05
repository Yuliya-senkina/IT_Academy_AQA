package demo.task;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alex",17);
        User user2 = new User("Alex",17);
        System.out.println(user.getName()+" "+ user.getAge());
        System.out.println(user2.getName()+" "+ user2.getAge());

        boolean c = user.equals(user2);
        System.out.println(c);
    }


}
