package Test;

public class Test_3 {
    public static void main(String[] args) {
        int a = 100;
        char ch = getChar(a);
        System.out.println("字符:" + ch);
        String str = getString(a);
        System.out.println("字符串" + str);
    }
    public static char getChar(int num) {

        char ch = (char) num;
        if (ch >= 'a' && ch <= 'z') {
            return ch;
        } else if (ch >= 'A' && ch <= 'Z') {
            return ch;
        } else if (ch >= '0' && ch <= '9') {
            return ch;
        } else {
            return ' ';
        }
    }

    public static String getString(int num) {
        char ch = (char) num;
        String str = "";

        for (int i = 0; i < 4; i++) {
            if (ch >= 'a' && ch <= 'z') {
                str += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                str += ch;
            } else if (ch >= '0' && ch <= '9') {
                str += ch;
            } else {
                return " ";
            }
        }
        return str;
    }
}
