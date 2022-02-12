import java.util.Scanner;

public class 字符串比较 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        if(a.length() != b.length()){
            System.out.println("1");
            return;
        }
        if(a.equals(b)){
            System.out.println("2");
            return;
        }
        if (a.equalsIgnoreCase(b)){

            System.out.println("3");
            return;
        }
        else {
            System.out.println("4");
            return;
        }
    }
}
