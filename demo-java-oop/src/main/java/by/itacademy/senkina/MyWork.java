package by.itacademy.senkina;

public class MyWork {
    public static void main(String[] args) {
        User user2 = new User();
        user2.setName("Andrew");
        Position position = new Position();
        position.setSalary(1000);
        position.setName("Developer");
        Worker worker = new Worker();
        worker.setPosition(position);
        worker.setUser(user2);
        String name = worker.getUser().getName();
        System.out.println(name);
        user2.setName("Kate");
        name = worker.getUser().getName();
        System.out.println(name);
    }

}
