import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 基础Huffuman树 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入的个数
        int n = scanner.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++){
            int tmp = scanner.nextInt();
            list.add(tmp);
        }
        int sum = 0;
        while (list.size() != 1){
            Integer a = Collections.min(list);
            list.remove(a);
            Integer b = Collections.min(list);
            list.remove(b);
            list.add(a + b);
            sum = sum + a + b;
        }
        System.out.println(sum);
    }
}
