package by.itacademy.senkina;

public class User {
    private String name;
    private String password;
    private int age;
    private Adress adress;

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

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
