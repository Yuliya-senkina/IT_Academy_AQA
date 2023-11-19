package by.itacademy.senkina;

public class MyCity {

    public static void main(String[] args) {
        Adress adress1 = new Adress();
        adress1.setCity("Gomel");
        adress1.setStreet("Sovetskaya");
        adress1.setHouse("1");
        adress1.setFlat(56);
        User user1 = new User();
        user1.setName("Olga");
        user1.setAdress(adress1);
        Adress adress2 = user1.getAdress();
        String city = adress2.getCity();
        System.out.println(city);

    }
}
