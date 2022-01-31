import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 查找整数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++){
            int tmp = scanner.nextInt();
            list.add(tmp);
        }
        int a = scanner.nextInt();
        int i = 0;
        for (; i < list.size(); i++){

            if (a == list.get(i)){
                System.out.println(i + 1);
                return;
            }
        }
        if (i == list.size()){
            System.out.println(-1);
        }
    }
}
