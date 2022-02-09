import java.util.Scanner;

public class 皇后2n {
    static int n = 0;
    static int method = 0;
    static int[] a;
    static int[][] chess;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = new int[n];
        chess = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                chess[i][j] = scanner.nextInt();
            }
        }
        dfs(0);
        System.out.println(method);
    }
    public static void dfs(int row){
        if(row == n){
            method ++;
            return;
        }else {
           for (int i = 0; i < n; i++){
               if(check(row,i)){
                   a[row] = i;
                   dfs(row + 1);    //递归。
                   a[row] = 0;          //回溯时的处理,因为这个数组是一个全局的，在下一次的
                                        //解进行判断时还需要用到这个数组。存有值会影响check函数判断。
               }
           }
        }
    }
    public static boolean check(int x,int y){
        if(chess[x][y] == 0){
            return false;
        }
        for (int i = 0; i < x; i++){
            if(a[i] == y) return false;
            if(a[i] + i == x + y) return false;
            if (a[i] - i == y - x) return false;
        }
        return true;
    }
}
