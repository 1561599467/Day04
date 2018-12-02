package Test;

public class Test_6 {
    public static void main(String[] args) {
        double d1 = 10.1;
        System.out.println(d1 + "->" + round(d1));
        double d2 = 10.4;
        System.out.println(d2 + "->" + round(d2));
        double d3 = 10.5;
        System.out.println(d3 + "->" + round(d3));
        double d4 = 10.9;
        System.out.println(d4 + "->" + round(d4));
    }

    public static int round(double d) {
        int i = (int) (d + 0.5);
        return i;
    }
}
