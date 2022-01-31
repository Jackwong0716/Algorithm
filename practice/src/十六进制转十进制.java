import java.math.BigInteger;
import java.util.Scanner;

public class 十六进制转十进制 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String hex = scanner.next();
            BigInteger bigInteger = new BigInteger(hex,16);
            String tmphex= bigInteger.toString(10);
            System.out.println(tmphex);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
