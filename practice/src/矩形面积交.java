import java.util.Scanner;

public class 矩形面积交 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x11 = scanner.nextDouble();
        double y11 = scanner.nextDouble();
        double x12 = scanner.nextDouble();
        double y12 = scanner.nextDouble();
        double x21 = scanner.nextDouble();
        double y21 = scanner.nextDouble();
        double x22 = scanner.nextDouble();
        double y22 = scanner.nextDouble();
        double area = (x12 - x21) * (y12 - y21);

        System.out.println(String.format("%.2f",area));
    }
}
