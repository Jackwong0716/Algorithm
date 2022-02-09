import java.util.Scanner;

public class 回形取数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 0 ;
        m = scanner.nextInt();
        int n =  0;
        n = scanner.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        int circle = 0;  //用这个圈数记录循环的输出个数。
        int count = 0;
        while (count < m*n){
            for (int i = circle; i < m - circle  && count < m * n; i++){    //往下
                System.out.print(arr[i][circle] + " ");
                count ++;
            }
            for (int j = circle + 1; j < n - circle  && count < m * n; j++){
                System.out.print(arr[m - circle - 1][j] + " ");
                count ++;
            }
            for (int k = m - circle - 2; k >= circle  && count < m * n; k--){
                System.out.print(arr[k][n - circle - 1]+ " ");
                count ++;
            }
            for (int q = n - circle - 2; q > circle  && count < m * n; q--){
                System.out.print(arr[circle][q]+ " ");
                count ++;
            }
            circle ++;
        }


    }
}
