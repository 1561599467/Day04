package Test;

public class test01 {
    public static void main(String[] args) {
        boolean bo1= doCheck(2);
        System.out.println(bo1);
        boolean bo2= doCheck(3);
        System.out.println(bo2);
    }
    public static boolean doCheck(int num){
        boolean flag ;
        if (num % 2 == 0) {
            for (int i = 0; i <= 20; i++) {
                num -= i;
            }
            flag = true;
        } else {
            for (int i = 0; i <= 20; i++) {
                num+=i;
            }
            flag =false;
        }
        System.out.println(num);
        return flag;
    }
}
