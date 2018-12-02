public class Demo05 {
    public static void main(String[] args) {
        int x = 12;
        int y = 27;
        char ch = '+';
        int result = jiSuan(x, y, ch);
        System.out.println("" + x + ch + y + "=" + result);

    }

    public static int jiSuan(int x, int y, char ch) {
        int result = 0;
        if (ch == '+') {
            result = x + y;
        } else if (ch == '-') {
            result = x - y;
        } else if (ch == '*') {
            result = x * y;
        } else if (ch == '/') {
            result = x / y;
        } else {
            System.out.println("符号错误!");
        }
        return result;
    }
}
