import java.util.Scanner;

public class 龟兔赛跑 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1,v2,t,s,l;
        v1 = scanner.nextInt();
        v2 = scanner.nextInt();
        t = scanner.nextInt();
        s = scanner.nextInt();
        l = scanner.nextInt();
        int time = 0;
        int x1 = 0;
        int x2 = 0;
        for (int i = 0;;i++){
            if(x1 == l || x2 == l){
                break;
            }
            if (x1 - x2 >= t){
                for (int j = 0; j < s; j++){
                    x2 = x2 + v2;
                    time ++;
                    if(x2 == l){        //这个判断不能少，因为在这个期间，虽然还没用完s秒，但是乌龟已经跑到重点了。
                        break;
                    }
                }
            }else {
                x1 = x1 + v1;
                x2 = x2 + v2;
                time ++;
            }
        }
        if (x1 == l && x2 != l){
            System.out.println("R");
            System.out.println(time);
        }
        if (x1 != l && x2 == l){
            System.out.println("T");
            System.out.println(time);
        }
        if (x1 == l && x2 == l){
            System.out.println("D");
            System.out.println(time);
        }

    }
}
