import java.util.Scanner;

//对撞指针,对称问题，对撞指针。
public class 完美的代价 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String s = scanner.next();
        int oddnum = 0;
        int end = num -1;
        int swapnum = 0;
        char[] arr = s.toCharArray();
        int[] cnt = new int[26];
        if(!ishuiwen(s)){
            System.out.println("Impossible");
            return;
        }
        for (int i = 0; i < end ; i++){
            for (int j = end; j >= i; j--){
                if(i == j){  //单个的字符。
                    swapnum = swapnum +  num / 2 - i;
                    break;
                }
                if(arr[i] == arr[j]){
                    //能找到这个字符对称的那个字符。
                    for (int k = j; k < end; k++){
                        char tmp = arr[k];
                        arr[k] = arr[k + 1];
                        arr[k + 1] = tmp;
                        swapnum ++;
                    }
                    //将这个字符放到最后对称位置后，尾指针要向前移动。
                    end --;
                    break;
                }
            }
        }
        System.out.println(swapnum);
    }
    public static boolean ishuiwen(String s){
        int[] tmp = new int[26];
        //统计每个字母的个数，如果个数为奇数的字母超过了1个，则不是回文
        // 为什么偶数的回文不判断呢？因为偶数如果现个数为奇数的字母，则必有另一个个数为奇数的字母。
        for (int i = 0; i < s.length(); i++){
            tmp[s.charAt(i) - 'a'] ++;
        }
        int oddnum = 0;
        for (int i = 0; i < tmp.length; i++){
            if(tmp[i] % 2 == 1){
                oddnum ++;
            }
        }
        if(oddnum > 1){
            return false;
        }
        return true;
    }
}
