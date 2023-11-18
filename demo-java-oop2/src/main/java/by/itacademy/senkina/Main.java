package by.itacademy.senkina;

public class Main {
    public static void main(String[] args) {

        User user1 = new User ();
        user1.setName("Petr");
        User user2 = new User();
        user2.setName("Kola");
        User user3 = new User();
        user3.setName("Olga");
        User [] users = new User[3];
        users[0]=user1;
        users[1]=user2;
        users[2]=user3;
        for (int i = 0; i<3; i++){
            System.out.println(users[i].getName());
        }
    }
}