package Test;

public class Test_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        printNum(a, b);
        doubling(a, b);
        printNum(a, b);
        System.out.println("**********************");
        a = doubling(a);
        b = doubling(b);
        printNum(a, b);
    }
    public static void printNum(int iVar, int iVar2) {
        System.out.println("iVar:" + iVar + ",iVar2:" + iVar2);
    }
    public static void doubling(int r, int p) {
        r += r;
        p += p;
        System.out.println("翻倍:r=" + r + ",p=" + p);
    }
    public static int doubling(int r) {
        r += r;
        return r;
    }
}
