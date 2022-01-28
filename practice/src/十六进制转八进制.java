import java.math.BigInteger;
import java.util.Scanner;

public class 十六进制转八进制 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        String[] hex = new String[input];
        for (int i = 0; i < input; i++){
            hex[i] = scanner.next();
        }
        for (int i = 0; i < hex.length; i++){
            BigInteger tmphex = new BigInteger(hex[i],16);
            String octal = tmphex.toString(8);
            System.out.println(octal);
        }
    }
}

