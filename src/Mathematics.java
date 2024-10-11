

public class Mathematics {
    public static double abs(double num) {
        if (num < 0) {
            return -num;
        }
        return num;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }
}