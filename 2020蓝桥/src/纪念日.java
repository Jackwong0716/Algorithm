public class 纪念日 {
    //这个题需要计算闰年和平年的个数。
    //再如果不会可以使用计算器。
    public static void main(String[] args) {
        int pingyear = 0;
        int runyear = 0;
        for (int i = 1922; i <= 2020; i++){
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                runyear ++;
            }
        }
        pingyear = 2020 - 1921 - runyear;
        int minute = (runyear * 366 + pingyear * 365) * 24 * 60 - (22) * 24 * 60;
        System.out.println(minute);

    }
}
