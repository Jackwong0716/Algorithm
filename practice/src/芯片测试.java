import java.util.Scanner;

public class 芯片测试 {
    //第一次我理解下，是都是0，就会是坏的芯片。
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        boolean flag;
        for (int k = 0; k < n; k++){  //每个芯片
            flag = false;
            int num = 0;
            for (int i = 0; i < n; i++){
                if (flag){
                    break;
                }
                else if(i == k){
                    continue;
                }else {
                    int q = i + 1;
                    while (q < n){
                        if(q == k){
                            q ++;
                        }else {
                            if(arr[i][k] != arr[q][k]){
                                System.out.print(k + 1 + " ");
                                flag = true;
                                break;
                            }else {
                                num ++;
                                if (num == n - 2){
                                    flag = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
