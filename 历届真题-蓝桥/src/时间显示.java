import java.util.Scanner;


//很神奇
//s % 3600 完成的效果既有，以3600为一个周期，循环完不确定的n圈。
//         也相当于完成了 s - 3600 * n,的功能，得出最后剩余多少。
public class 时间显示 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long time = scanner.nextLong();
        long tmp = time / 1000;
        int s = (int) (tmp % (24*60*60));
        int h = s / 3600;
        s = s % 3600;
        int m = s / 60;
        s = s % 60;
        System.out.printf("%02d:%02d:%02d",h,m,s);
    }
}
