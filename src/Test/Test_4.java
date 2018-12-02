package Test;

public class Test_4 {
    public static void main(String[] args) {
        showColor("green");
    }

    public static void showColor(String color) {
        switch (color) {
            case "red":
                System.out.println(color + "是红色!");
                break;
            case "yellow":
                System.out.println(color + "是黄色!");
                break;
            case "blue":
                System.out.println(color + "是蓝色!");
                break;
            default:
                System.out.println("未知颜色");
        }
    }
}
