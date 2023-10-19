package by.itacademy.senkina;
public class Tasks {
    public  String check(int x, int y, int z) {
        if (x > 0 && y > 0 && z > 0) {
            return"excelent";
        } else if (x > 0 && y > 0 || x > 0 && z > 0 || y > 0 && z > 0) {
            return"good";
        } else if (x > 0 || y > 0 || z > 0) {
            return "fine";
        } else {
            return "bad";
        }

    }
}
