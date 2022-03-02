public class 合并检测 {
    public static void main(String[] args) {
        int people = 1000;
        int min = Integer.MAX_VALUE;
        int k = 0;
        for (int i = 1; i <= 1000; i++){
            int count = 0;
            if(people % i == 0){
                count = people / i + (int) (people * 0.01 * i);
            }
            if(people % i != 0){
                count = people / i + 1 + (int) (people * 0.01 * i);
            }
            if (count < min){
                k = i;
                min = count;
            }
        }
        System.out.println(k);
    }
}
