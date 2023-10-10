public class Utils {

    public static void check(int x, int y, int z){
        if ( x > 0 & y > 0 & z > 0)
        {
            System.out.print("excelent");
        }
        else if ( x > 0 & y > 0 || x > 0 & z > 0 || y > 0 & z > 0)
        {
            System.out.print("good");
        }
        else if  ( x > 0 || y > 0 || z > 0)
        {
            System.out.print("fine");
        }
        else
        {
            System.out.print("bad");
        }
    }
}
