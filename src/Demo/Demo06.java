public class Demo06 {
    //    public static void main(String[] args) {
//        char a = 'a';
//        char c = exchange(a);
//        System.out.println(a + "转化为:" + c);
//
//    }
//    public static char exchange(char ch){
//        if (ch >= 'a' && ch <= 'z') {
//            ch -= 32;
//        } else if (ch >= 'A' && ch <= 'Z') {
//            ch += 32;
//        } else {
//            ch = ' ';
//            System.out.println("非字母");
//        }
//        return ch;
//    }
    public static void main(String[] args) {
        char ch = 'a';
        char CH = ziMu(ch);
        System.out.println(ch + "转化为:" + CH);
    }

    public static char ziMu(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            ch -= 32;
        } else if (ch >= 'A' && ch <= 'Z') {
            ch += 32;
        } else {
            System.out.println("非字母!");
        }
        return ch;
    }
}
