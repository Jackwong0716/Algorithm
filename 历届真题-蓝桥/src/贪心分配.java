import java.util.Arrays;

public class 贪心分配 {
    public static void main(String[] args) {
        int[] childs = {2,1,3};
        int[] cookies = {1,2,3};
        fenpei(childs,cookies);
    }
    static int fenpei(int[] childs,int[] cookies){
        Arrays.sort(childs);
        Arrays.sort(cookies);
        int child = 0;
        int cookie = 0;
        while (child < childs.length && cookie < cookies.length){
            if(childs[child] <= cookies[cookie]){
                child ++;
                cookie ++;
            }else {
                cookie ++;
            }
        }
        return child;
    }
}
