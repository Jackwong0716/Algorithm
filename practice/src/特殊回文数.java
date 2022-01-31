import java.util.Scanner;

public class 特殊回文数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        for (int i = 10000; i <= 99999; i++){
            int bit1 = i % 10;
            int bit2 = (i/10) % 10;
            int bit3 = (i/100) % 10;
            int bit4 = (i/1000) % 10;
            int bit5 = (i/10000) % 10;
            int sum = bit1 + bit2 + bit3 + bit4 + bit5;
            if(bit1 == bit5 && bit2 == bit4 && sum == a){
                System.out.println(i);
            }
        }
        for (int i = 100000; i <= 999999; i++){
            int bit1 = i % 10;
            int bit2 = (i/10) % 10;
            int bit3 = (i/100) % 10;
            int bit4 = (i/1000) % 10;
            int bit5 = (i/10000) % 10;
            int bit6 = (i/100000) % 10;
            int sum = bit1 + bit2 + bit3 + bit4 + bit5 + bit6;
            if(bit1 == bit6 && bit2 == bit5 && bit3 == bit4 && sum == a){
                System.out.println(i);
            }
        }
    }
}
