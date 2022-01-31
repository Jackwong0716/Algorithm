import java.util.Scanner;

public class 圆的面积精度 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        double area = Math.PI * r * r;
        //System.out.println(area);
        //使用这个format会自动进行四舍五入。，，这个很重要。
        System.out.println(String.format("%.7f",area));
    }
}
