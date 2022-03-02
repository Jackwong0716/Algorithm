import java.math.BigInteger;
import java.util.Scanner;

public class 八次求和 {
    //一，无脑暴力法
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger sum = BigInteger.ZERO;
        BigInteger mo = BigInteger.valueOf(123456789);
        for (int i = 1; i <= n; i++){
            sum = sum.add(new BigInteger(i+"").pow(8).remainder(mo));
        }
        System.out.println(sum.remainder(mo));
    }
//    public static void main(String[] args) {
//        System.out.println(fast_power(10,3));
//    }
//    public static long fast_power(long base,int index){
//        long ans = 1;
//        base %= 1000;
//        while (index > 0){
//            if((index & 1) == 1){
//                ans = (ans * base) % 1000;
//            }
//            base = (base * base) % 1000;
//            index = index / 2;
//        }
//        return ans % 1000;
//    }
}
