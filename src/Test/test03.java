package Test;

public class test03 {
    public static void main(String[] args) {
        int a=5;
        get(a);
    }
    public static void get(int a){
        for (int i = 0; i <= a; i++) {
            if (i % 2==0) {
                System.out.print(i + " ");
            }
        }
    }
}
