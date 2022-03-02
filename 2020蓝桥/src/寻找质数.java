public class 寻找质数 {
    public static void main(String[] args) {

    }
    //一，暴力循环
    public static boolean isPrime(int a){
        if(a == 0 || a == 1){  //因为0和1 ，必定不是质数，可以看定义。
            return false;
        }
//        for (int i = 2; i < a; i++){  //最后一个a本身不需要看。  O(n*n)的复杂度
//            if (a % i == 0) return false;   //有其他因数，就不是质数
//        }
        //这里可以使用局部优化：因为数学上a * b = x,现在这个x就是要判断的是不是素数的数，则必有a，b中有一个小于等于根号x，一个大于等于
        for (int i = 2; i * i <= a; i++){     //当然这里的i*i <= a,实现了 i <= sqrt(a)的功能。O(n * 根号n)复杂度
            if (a % i == 0) return false;
        }

        return true;
    }
}
