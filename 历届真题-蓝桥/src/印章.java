import java.util.Scanner;

public class 印章 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if(m < n){
            System.out.printf("%.4f",0.0);
        }
        else if(n == 1){
            System.out.printf("%.4f",1.0);
        }

    }
}
