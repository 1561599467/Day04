package Test;

public class Test_7 {
    public static void main(String[] args) {
        String str = "摄氏度";
        double d1 = 30.0;
        double d2 = zhuanHuan(str, d1);
        System.out.println("摄氏度为:" + d1 + "°--" + "华氏度为:" + d2 + "°");
        String str2 = "华氏度";
        double d3 = 86.0;
        double d4 = zhuanHuan(str2, d3);
        System.out.println("华氏度为:" + d3 + "°--" + "摄氏度为:" + d4 + "°");
    }

    public static double zhuanHuan(String str, double a) {
        double i = 0;
        switch (str) {
            case "摄氏度":
                i = (9.0 / 5) * a + 32;
                break;
            case "华氏度":
                i = (a - 32) / (9.0 / 5);
                break;
        }
        return i;
    }
}
