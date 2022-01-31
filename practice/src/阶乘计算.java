import java.math.BigInteger;
import java.util.Scanner;

public class 阶乘计算 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger sum = BigInteger.valueOf(1);
        for (long i = 1; i <= n; i++){
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(sum);
    }
}
