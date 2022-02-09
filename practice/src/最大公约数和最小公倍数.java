public class 最大公约数和最小公倍数 {
    public static void main(String[] args) {
        int a = 12;
        int b = 9;
        int gongyue = getGongyue(a,b);
        System.out.println("最大公约数：" + gongyue);
        System.out.println("最小公倍数：" + getMinbei(a,b,gongyue));
    }
    //辗转相除法的原理在于，数字a对数字b求模，假设余数为c，那么a和b的最大公约数就等于b和c的最大公约数。
    public static int getGongyue(int a,int b){
        if(a % b == 0){
            return b;               //例如：a = 4, b = 2;
        }
        return getGongyue(a,a % b);
    }
    //最小公倍数=两个数的乘积  / 最大公约数
    public static int getMinbei(int a,int b,int gongyue){
        return  a * b / gongyue;
    }
}
