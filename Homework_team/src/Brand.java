public class Brand {
    public String nameOfBrand;
    public  String countryOfBrand;
    public Brand(String nameOfBrand, String countryOfBrand) {
        this.nameOfBrand = nameOfBrand;
        this.countryOfBrand = countryOfBrand;
    }

    @Override
    public String toString() {
        return  "nameOfBrend='" + nameOfBrand + '\'' +
                ", countryOfBrand='" + countryOfBrand + '\'';
    }
}