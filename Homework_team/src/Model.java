public class Model {
    public String nameOfModel;
    public String generation;
    public int year;
    public Model(String nameOfModel, String generation, int year) {
        this.nameOfModel = nameOfModel;
        this.generation = generation;
        this.year = year;
    }

    @Override
    public String toString() {
        return  "nameOfModel='" + nameOfModel + '\'' +
                ", generation='" + generation + '\'' +
                ", year=" + year;
    }
}