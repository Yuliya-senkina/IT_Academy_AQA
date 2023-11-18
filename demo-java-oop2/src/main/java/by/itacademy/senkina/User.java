package by.itacademy.senkina;

public class User {
    public String name;
    public String password;
    public int age;

    public void setName(String name){
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void  setPassword(String password){
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setAge (int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }
}
