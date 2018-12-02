package Test;

public class Test_5 {
    public static void main(String[] args) {
        getValue("大", 25, 43, 57);
        getValue("小", 5, 6, 7);
    }

    public static void getValue(String ext, int a, int b, int c) {
        switch (ext) {
            case "大":
                int max = getMax(a, b, c);
                System.out.println("最大值为:" + max);
                break;
            case "小":
                int min = getMin(a, b, c);
                System.out.println("最小值为:" + min);
                break;
        }
    }

    public static int getMax(int a, int b, int c) {
        int max = (a > b) ? a : b;
        max = (max > c) ? max : c;
        return max;
    }

    public static int getMin(int a, int b, int c) {
        int min = (a < b) ? a : b;
        min = (min < c) ? min : c;
        return min;
    }
}
