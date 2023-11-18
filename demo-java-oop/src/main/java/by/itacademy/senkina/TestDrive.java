package by.itacademy.senkina;

public class TestDrive {
    public static void main(String[] args) {
    User[] users = new User[10];
    for(int i = 0; i < 10 ; i++){
        users[i].setAge(i);
        users[i].setPassword(""+Math.random()*10);
        users[i].setName(""+(char)(Math.random()*1000)+(char)(Math.random()*1000)+(char)(Math.random()*1000));}
for (int i = 0; i < 10; i++){
    System.out.println("Usernsme: " + users[i].getName()+", Password: "+users[i].getPassword()+", Age: "+users[i].getAge());

    }
}
}
