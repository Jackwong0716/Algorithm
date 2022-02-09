import java.util.Scanner;

public class 芯片测试2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++){
            int num1 = 0;
            int num0 = 0;
            for (int j = 0; j < n; j++){
                if(arr[j][i] == 0){
                    num0 ++;
                }else if (arr[j][i] == 1){
                    num1 ++;
                }
            }
            if(num1 > num0){
                System.out.print(i + 1 + " ");
            }
        }
    }
}
