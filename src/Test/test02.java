package Test;

public class test02 {
    public static void main(String[] args) {
        int num=97;
        char ch1=getChar(num);
        System.out.println("字符:" + ch1);
        String str=getString(num);
        System.out.println("字符串:" + str);
    }
    public static char getChar(int num){
        char ch =(char) num;
        if (ch>='A' && ch<='Z') {
            return ch;
        } else if (ch>='a' && ch<='z') {
            return ch;
        } else if (ch>=0 && ch<='9') {
            return ch;
        }else{
            return ' ';
        }
    }
    public static String getString(int num){
        char ch=(char)num;
        String str="";
        if (ch>='A' && ch<='Z') {
            str += ch;
        } else if (ch>='a' && ch<='z') {
            str += ch;
        } else if (ch>=0 && ch<='9') {
            str += ch;
        }else{
            str="";
        }
        for (int i = 0; i < 2; i++) {
            str +=str;
        }
        return str;
    }
}
