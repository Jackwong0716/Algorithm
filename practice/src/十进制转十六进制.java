import java.math.BigInteger;
import java.util.Scanner;

public class 十进制转十六进制 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a  = scanner.next();
        BigInteger bigInteger = new BigInteger(a,10);
        String hex = bigInteger.toString(16);
        String tmphex = hex.toUpperCase();
        System.out.println(tmphex);
    }
}
