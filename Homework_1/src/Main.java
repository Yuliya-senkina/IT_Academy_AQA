public class Main {
    public static void main(String[]args){
        // создание трех экземпляров класса
        Phone phone1 = new Phone("+375256667778", "iPhone 14 Pro Max", "240 г");
        Phone phone2 = new Phone("+375299900995", "Xiaomi 13T Pro", "206 г");
        Phone phone3 = new Phone("+375443434567", "Huawei nova 11 Pro", "188 г");
        // вывод значений в консоль

        System.out.println("Phone 1: " + phone1);
        System.out.println("Phone 2: " + phone2);
        System.out.println("Phone 3: " + phone3);
        //вызов методов receiveCall и getNumber
        phone1.receiveCall("Ivan");
        phone2.receiveCall("Olga");
        phone3.receiveCall("Petr");
        // вызов конструктора без параметров
        Phone phone4 = new Phone();
        //вызов метода receiveCall c 2-мя параметрами
        phone4.receiveCall("Kate","+33333333333");

    }
}