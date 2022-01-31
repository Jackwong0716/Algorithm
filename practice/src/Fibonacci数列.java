import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci数列 {
//不使用求余，就使用java大数存储尝试
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();
        BigInteger fn1 = new BigInteger("1");
        BigInteger fn2 = new BigInteger("1");
        BigInteger fn = new BigInteger("0");
        if(n == 1 || n == 2){
            System.out.println(1 % 10007);
        }else {
            //(1)循环次数。
            for (int i = 0; i < n - 2; i++){
                //这个直接使用求余，可以减少数值大写，使用int可以存下来。
                //同时为什么这样可以，因为借用的结合律和分配律。
                fn = fn1.add(fn2);
                fn1 = fn2;   //（2）保存上次的值
                fn2 = fn;
            }
            System.out.println(fn.remainder(BigInteger.valueOf(10007)));
        }

    }
//使用求余减小数值的方法
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int fn1 = 1;
//        int fn2 = 1;
//        int fn = 0;
//        if(n == 1 || n == 2){
//            System.out.println(1 % 10007);
//        }else {
//            //(1)循环次数。
//            for (int i = 0; i < n - 2; i++){
//
//                //这个直接使用求余，可以减少数值大写，使用int可以存下来。
//                //同时为什么这样可以，因为借用的结合律和分配律。
//                fn = (fn1 + fn2) % 10007;
//                fn1 = fn2;   //（2）保存上次的值
//                fn2 = fn;
//            }
//            System.out.println(fn);
//        }
//    }
    //使用递归，在数值特别大时会出现栈溢出。所以用循环。
    //循环代替递归需解决两个问题：（1）循环次数（2）保存上次的值。
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int result = fibonacci(n);
//        System.out.println(result % 10007);
//    }
//    public static int fibonacci(int n){
//        if(n == 1 || n == 2){
//            return 1;
//        }else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
//    }
}
