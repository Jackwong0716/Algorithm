import java.math.BigInteger;
import java.util.Scanner;

public class 高精度加法 {
    //使用biginteger
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        BigInteger tmpa = new BigInteger(a);
        BigInteger tmpb = new BigInteger(b);
        System.out.println(tmpa.add(tmpb));
    }
    //不使用biginteger，自研算法，但是性能很差。
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.next();
//        String b = scanner.next();
//        int maxlength = a.length() > b.length() ? a.length():b.length();
//        char[] achar = new char[maxlength];
//        char[] bchar = new char[maxlength];
//        for (int i = 0; i < maxlength; i++){
//            achar[i] = '0';
//            bchar[i] = '0';
//        }
//        for (int i = 0; i < a.length(); i++){
//            char[] tmp = a.toCharArray();
//            achar[i] = tmp[a.length()-1-i];
//        }
//        for (int i = 0; i < b.length(); i++){
//            char[] tmp =  b.toCharArray();
//            bchar[i] = tmp[b.length()-1-i];
//        }
//        int[] c = new int[maxlength + 1];  //这个动态分配的数组的大小很关键。它是个数，不是固定的100个。
//        int shiwei = 0;
//        for (int i = 0; i < maxlength; i++){
//            int tmp = Integer.valueOf(String.valueOf(achar[i])) +Integer.valueOf(String.valueOf(bchar[i])) +shiwei;
//            int gewei = tmp % 10;
//            c[i] = gewei;
//            shiwei = tmp / 10;
//        }
//        //根据这个最高位是不是0，来判断是否最后相加的结果增加了位数。
//        if(shiwei != 0){
//            c[maxlength] = shiwei;
//        }
//        if(c[maxlength] == 0){
//            for (int i = 0; i < maxlength; i++){
//                System.out.print(c[maxlength - 1 - i]);
//            }
//        }else {
//            for (int i = 0; i < maxlength + 1; i++){
//                System.out.print(c[maxlength - i]);
//            }
//        }
//    }
}
