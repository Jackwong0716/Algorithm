import java.util.Scanner;

public class 矩阵乘法 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][n];
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0;j < n; j++){
                b[i][j] =  arr[i][j] = scanner.nextInt();

            }
        }
        if(m == 0){
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    if(i == j){
                        System.out.print(1 + " ");
                    }else {
                        System.out.print(0 + " ");
                    }
                }
                System.out.println();
            }
        }else if(m == 1){
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
        }else {
            for (int k = 1; k < m; k++){   //2次幂，实际值计算一次乘法。
                int[][] tmp = new int[n][n];
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < n; j++){
                        int sum = 0;
                        for (int t = 0; t < n; t++){
                            sum = sum + arr[i][t] * b[t][j];
                        }
                        tmp[i][j] = sum;
                    }
                }
                b = tmp;
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
