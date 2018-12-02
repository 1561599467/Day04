package Test;

public class Test_8 {
    public static void main(String[] args) {
        ouShu(6);
    }

    public static void ouShu(int a) {
        if (a<=3) {
            return;
        }
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
