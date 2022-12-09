public class Math {

    double E = 2.71828;
    public static double PI = 3.14159;





    static double abs(int x) {

        if (x < 0){

            x = x*1;
            return x;



        } else {
            return x;
        }



    }

    static double max(double x, double y) {

        if (x > y) {
            return x;
        } else if (x < y) {
            return y;
        } else {
            return x;
        }

    }

    static double min(double x, double y) {

        if (x > y) {
            return y;
        } else if (x < y) {
            return x;
        } else {
            return y;
        }


    }

}
