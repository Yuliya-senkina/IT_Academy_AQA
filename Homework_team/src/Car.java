public class Car {
    public Brand brandOfCar;
    public Model modelOfCar;
    public String typeOfBody;
    public String typeOfFuel;

    @Override
    public String toString() {
        return brandOfCar +
                " " + modelOfCar +
                ", typeOfBody='" + typeOfBody + '\'' +
                ", typeOfFuel='" + typeOfFuel + '\'';
    }
    public Car(String nameOfBrand, String countryOfBrand, String nameOfModel, String generation, int year, String typeOfBody, String typeOfFuel) {
        this.brandOfCar = new Brand(nameOfBrand, countryOfBrand);
        this.modelOfCar = new Model(nameOfModel, generation, year);
        this.typeOfBody = typeOfBody;
        this.typeOfFuel = typeOfFuel;
    }
}