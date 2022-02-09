import java.util.Scanner;

public class Fj的字符串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String left = "";
        String right = "";
        String result = "";
        for (int i = 0; i < n; i++){
            char tmp = (char) ('A' + i);
            result = left + String.valueOf(tmp) + right;
            left = result;
            right = result;
        }
        System.out.println(result);
    }
}
