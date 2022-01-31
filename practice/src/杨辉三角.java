import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 杨辉三角 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new LinkedList<>();
        List<Integer> sumlist = new LinkedList<>();
        for (int i = 1; i <= n; i++){
            if(i == 1){
                int a = 1;
                list.add(a);
                sumlist.add(a);
                System.out.print(a + " ");
                System.out.println();
            }else {
                List<Integer> tmplist = new LinkedList<>();
                int j = 0;
                for (; j < i; j++){
                    if(j == 0){
                        System.out.print(list.get(j) + " ");
                        tmplist.add(list.get(j));

                    }else if(j == i - 1){
                        System.out.print(list.get(j - 1) + " ");
                        tmplist.add(list.get(j - 1));
                    }else {
                        int num = list.get(j - 1) + list.get(j);
                        System.out.print(num + " ");
                        tmplist.add(num);
                    }
                }
                System.out.println();
                for (int z = 0; z < tmplist.size(); z++){
                    sumlist.add(tmplist.get(z));
                }
                list = tmplist;
            }
        }
        //这一部分是为了另一种题型。判断某个数第一次出现的位置。
        int num = scanner.nextInt();
        for (int i = 0; i < sumlist.size(); i++){
            if(sumlist.get(i) == num){
                System.out.println(i + 1);
                return;
            }
        }
    }
}
