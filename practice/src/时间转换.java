import java.util.Scanner;

public class 时间转换 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int h = 0;
        int m = 0;
        int s = 0;
        h = time / 3600;
        m = (time - 3600 * h) / 60;
        s = (time - 3600 * h - 60 * m);
        System.out.println(h+":"+m+":"+s);
    }
}
