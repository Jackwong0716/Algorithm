import java.util.Scanner;
//分解质因数，只有合数才会分解，质数还是原数。
//1，求其质数，要从最小的质数开始算起。例如本题使用2.当然2是最小的质数。1不是质数。可以百度定义。
//2, 然后如果求出来的是合数，则会继续分解。

public class 分解质因数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = a;
        for (int i = a; i <=  b; i++){
            int k = 2;
            n = i;
            System.out.print(i + "=");
            while (k <= n){
                if (n % k == 0){
                    System.out.print(k);
                    n = n / k;
                    if(k <= n){
                        System.out.print("*");
                    }
                }else {
                    k ++;

                }
            }
            System.out.println();
        }
    }
}
