public class Phone {
    public String number;
    public String model;
    public String weight;
    // конструктор с 3-мя параметрами
    public Phone(String number, String model, String weight) {
        // вызов из конструктора с 3-мя конструктора с 2-мя параметрами
        this(number,model);
        this.weight = weight;

    }
    // конструктор с 2-мя параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {
    }
    public void receiveCall(String name){
        System.out.print("\nЗвонит: " + name);
        System.out.print(" номер: " + getNumber());

    }
    public void receiveCall(String name,String number){
        System.out.print("\nЗвонит: " + name);
        System.out.print(" номер: " + number);
    }
    public String getNumber() {
        return number;
    }
    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", name='" + model + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

}

