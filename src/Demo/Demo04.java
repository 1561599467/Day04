

public class Demo04 {
    //    public static void main(String[] args) {
//        int min = getMin(1, 2, 3);
//        System.out.println("最小值:" + min);
//    }
//
//    public static int getMin(int a, int b, int c) {
//        int d = a < b ? a : b;
//        d = d < c ? d : c;
//        return d;
//    }
    public static void main(String[] args) {
        int min = getMin(23, 26, 19);
        System.out.println("最小值为:" + min);
    }

    public static int getMin(int a, int b, int c) {
        int min = (a < b) ? a : b;
        min = (min < c) ? min : c;
        return min;
    }
}
