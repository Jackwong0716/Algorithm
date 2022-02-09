import java.util.Scanner;

public class 报时助手 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        String[] hours = {
                "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
                "ten",
                "eleven",
                "twelve",
                "thirteen",
                "fourteen",
                "fifteen",
                "sixteen",
                "seventeen",
                "eighteen",
                "nineteen",
                "twenty",
                "twenty one",
                "twenty two",
                "twenty three",
                "twenty four",
        };
        String [] minutes = {

                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
                "ten",
                "eleven",
                "twelve",
                "thirteen",
                "fourteen",
                "fifteen",
                "sixteen",
                "seventeen",
                "eighteen",
                "nineteen",
                "twenty",
                "twenty one",
                "twenty two",
                "twenty three",
                "twenty four",
                "twenty five",
                "twenty six",
                "twenty seven",
                "twenty eight",
                "twenty nine",
                "thirty",
                "thirty one",
                "thirty two",
                "thirty three",
                "thirty four",
                "thirty five",
                "thirty six",
                "thirty seven",
                "thirty eight",
                "thirty nine",
                "forty",
                "forty one",
                "forty two",
                "forty three",
                "forty four",
                "forty five",
                "forty six",
                "forty seven",
                "forty eight",
                "forty nine",
                "fifty",
                "fifty one",
                "fifty two",
                "fifty three",
                "fifty four",
                "fifty five",
                "fifty six",
                "fifty seven",
                "fifty eight",
                "fifty nine",
                "sixty"
        };
        if (minute == 0){
            System.out.println(hours[hour] + " o'clock");
        }
        else {
            System.out.println(hours[hour] + " " + minutes[minute - 1]);
        }
    }
}
