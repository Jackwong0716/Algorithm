import java.math.BigInteger;

public class 字串01 {
    public static void main(String[] args) {
        for (int i = 0; i < 32; i++){
            BigInteger bigInteger = new BigInteger(String.valueOf(i));
            String bin = bigInteger.toString(2);
            if(bin.length() != 5){
                if(bin.length() == 1){
                    System.out.println("0000" + bin);
                }else if(bin.length() == 2){
                    System.out.println("000" + bin);
                }else if(bin.length() == 3){
                    System.out.println("00" + bin);
                }else if(bin.length() == 4){
                    System.out.println("0" + bin);
                }
            }else {
                System.out.println(bin);
            }
        }
    }
}
