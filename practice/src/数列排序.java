import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 数列排序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < a.length; i ++){
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        //Arrays.sort(a, Collections.reverseOrder());
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
