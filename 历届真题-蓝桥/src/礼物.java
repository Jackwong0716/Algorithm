import java.util.Scanner;

//没有成功，求解错误。
public class 礼物 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = n; i >= 1; i--){
            if(i % 2 != 0){
                continue;
            }
            int k = i / 2;
            if(qiank(a,k,s) && houk(a,k,s)){
                System.out.println(i);
                return;
            }
        }
    }
    public static boolean qiank(int[] a,int k,int s){
        int sum = 0;
        for (int i = 0; i < k; i++){
            sum = sum + a[i];
        }
        if(sum <= s){
            return true;
        }
        return false;
    }
    public static boolean houk(int[] a,int k,int s){
        int sum = 0;
        for (int i = a.length - k; i < a.length; i++){
            sum = sum + a[i];
        }
        if(sum <= s){
            return true;
        }
        return false;
    }
}
