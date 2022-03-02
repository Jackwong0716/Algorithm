import java.util.Scanner;

public class 字符串编码 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.next();
        for (int i = 0; i < tmp.length(); ){
            if(i != tmp.length() - 1){
                int a = Integer.valueOf(tmp.substring(i, i + 2));
                if (a >= 1 && a <= 26){
                    char x = (char) ('A' + (a - 1));
                    System.out.print(x);
                    i = i + 2;
                    continue;
                }
            }
            char out = (char) ('A' + (Integer.valueOf(String.valueOf(tmp.charAt(i))) - 1));
            i ++;
            System.out.print(out);
        }

    }
}
