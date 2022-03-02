import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 双向排序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = i + 1;
        }
        int[][] operate = new int[m][2];
        for (int i = 0; i < m; i ++){
            for (int j = 0; j < 2; j++){
                operate[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i ++){
            if(operate[i][0] == 0){
                maopao0(arr,operate[i][1]);
            }else {
                maopao1(arr,operate[i][1]-1,n - operate[i][1] + 1,n);
            }
        }

        for (int i = 0; i < n; i ++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void maopao0(int[] arr,int n){
        for (int i = 0; i < n - 1; i ++){
            for (int j = 0; j < n -i - 1; j++){
                if(arr[j + 1] > arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    public static void maopao1(int[] arr,int begin,int length,int n){
        for (int i = 0; i < length - 1; i++){
            for (int j = begin; j < n - i - 1; j++){
                if(arr[j + 1] < arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = tmp;
                }
            }
        }
    }


}
