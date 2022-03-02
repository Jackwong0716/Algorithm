import java.math.BigInteger;

public class 斐波加最大公约数 {
    public static void main(String[] args) {
        BigInteger f2020 = feibo(2020);
        //System.out.println(f2020);
        BigInteger f520 = feibo(520);
        //System.out.println(agcd(f2020,f520));
        System.out.println(f2020.gcd(f520));
    }
    public  static BigInteger feibo(int value){
        if (value == 1){
            return BigInteger.ONE;
        }
        if (value == 2){
            return BigInteger.ONE;
        }
        BigInteger tmp = BigInteger.ZERO;
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        for (int i = 0; i < value - 2; i++){
            tmp = a.add(b);
            a = b;
            b = tmp;
        }
        return tmp;
    }
    public static BigInteger agcd(BigInteger a,BigInteger b){
        BigInteger t = BigInteger.ZERO;
        BigInteger zz = BigInteger.ZERO;
        while (b.compareTo(zz) != 0){
            t = a.remainder(b);
            a = b;
            b = t;
        }
        return a;
    }
}
