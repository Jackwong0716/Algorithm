import java.util.Scanner;

public class 皇后2改进 {
    static int n = 0;
    static int methodcount = 0;
    static int[][] chess;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        chess = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                chess[i][j] =  scanner.nextInt();
            }
        }
        dfs(0,2);
        System.out.println(methodcount);
    }
    public static void dfs(int t,int s){
        if(t == n){
            if(s == 2) dfs(0,3);
            else methodcount ++;
            return;
        }
        for (int i = 0; i < n; i++){
            if(chess[t][i] != 1) continue;
            if(check(t,i,s)){
                chess[t][i] = s;
            }else continue;
            dfs(t+1,s);
            //第一种方法找完后,回溯必须复原，用于下次的深度搜索。
            //然后这里有个疑问，如何完成的多种情况的搜索？这就是深度优先搜索的机制。会对每种情况进行搜索。类似于二叉树的每种分支情况。
            chess[t][i] = 1;
        }
        return;
    }
    public static boolean check(int t,int i,int s){
        //这里只判断了同列，右对角线，左对角线，不需要判断同行的。因为dfs中，chess[][] != 1的判断，就会避免这种情况。
        //看同一列，有没有了
        for(int j = t-1; j >= 0; j--){
            if(chess[j][i] == s) return false;
        }
        //看右对角线有没有同类型皇后了。
        for (int j=t-1,q= i-1; j >= 0&&q >= 0; j--,q--){
            if (chess[j][q] == s) return false;
        }
        //看左对角线有没有同类型皇后
        for (int j = t - 1,q = i + 1; j >= 0 && q <= (n-1); j--,q++){
            if (chess[j][q] == s) return false;
        }
        return true;
    }
}
