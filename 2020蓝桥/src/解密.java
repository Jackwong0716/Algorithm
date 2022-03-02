import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 解密 {
    //这个题直接按照表读也可
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character,Character> map = new HashMap<>();
        for (int i = 0; i < 52; i++){
            char a = scanner.next().trim().charAt(0);
            char b = scanner.next().trim().charAt(0);
            map.put(b,a);
        }

        String s = scanner.next();
        char[] tmp = s.toCharArray();
        for (char a : tmp){
            System.out.println(map.get(a));
        }
    }
}
