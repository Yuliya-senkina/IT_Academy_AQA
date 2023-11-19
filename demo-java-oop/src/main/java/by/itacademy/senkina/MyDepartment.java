package by.itacademy.senkina;

public class MyDepartment {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        user1.setName("Petr");
        user2.setName("Masha");
        Position position1 = new Position();
        Position position2 = new Position();
        position1.setName("QA");
        position2.setName("Designer");
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        worker1.setUser(user1);
        worker2.setUser(user2);
        worker1.setPosition(position1);
        worker2.setPosition(position2);
        String position = worker2.getPosition().getName();
        System.out.println(position);
        position2.setName("Director");
        System.out.println(worker2.getPosition().getName());
        worker2.setPosition(position1);
        System.out.println(worker2.getPosition().getName());
    }



}
