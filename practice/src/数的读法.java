import java.util.Scanner;

//特殊情况下，2，6，10都会读读一十，单独处理。
//
public class 数的读法 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputnum = scanner.next();
        StringBuilder builder = new StringBuilder();
        String[] arr = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu","shi"};
        String[] liang = {"","shi","bai","qian","wan","shi","bai","qian","yi","shi"};
        int lenth = inputnum.length();
        boolean flag = true;
        if(lenth == 2 || lenth == 6 || lenth == 10){
            //一，读shi的情况。
            char[] tmp = inputnum.toCharArray();
            for (int i = 0; i < tmp.length; i++){
                int tmpint = Integer.valueOf(String.valueOf(tmp[i]));
                //1，处理第一个是1的情况。
                if(i == 0 && tmpint == 1){
                    builder.append(arr[10] + " ");
                    lenth --;
                    continue;
                }
                //2,同时如果第二个是0，则进行另一种处理。
                if(tmpint == 0 && i == 1){
                    builder.append(liang[lenth-1] + " ");
                    lenth --;
                    continue;
                }
                //3,出现多个0的情况时。
                //
                if (tmpint == 0 && i != 1){
                    lenth --;
                    //这个判断使用了超前搜索，超前搜索不一定是多位，只同时看两位也是够的。
                    if (flag && i < tmp.length - 1 && Integer.valueOf(String.valueOf(tmp[i+1])) != 0){
                        builder.append(arr[tmpint] + " ");
                        flag = false;
                    }
                    continue;
                }
                //4,只要不是0了，就要将flag置为true
                builder.append(arr[tmpint] + " ");
                builder.append(liang[lenth-1] + " ");
                flag = true;
                lenth --;
            }
        }
        else {    //二，读一十的情况。
            char[] tmp = inputnum.toCharArray();
            for (int i = 0; i < tmp.length; i++){
                int tmpint = Integer.valueOf(String.valueOf(tmp[i]));
                //对同时多个0的处理。
                if (tmpint == 0 && i != 0){
                    lenth --;
                    if (flag && i < tmp.length - 1 && Integer.valueOf(String.valueOf(tmp[i+1])) != 0){
                        if(lenth == 4 || lenth == 8){
                            builder.append(liang[lenth] + " ");
                            flag = false;
                        }else {
                            builder.append(arr[tmpint] + " ");
                            flag = false;
                        }
                        //这个lenth == 4是添加单位的时的情况。
                    }else if(lenth == 4 || lenth == 8){
                        builder.append(liang[lenth] + " ");
                        builder.append(arr[tmpint] + " ");
                        flag = false;
                    }
                    continue;
                }
                builder.append(arr[tmpint] + " ");
                builder.append(liang[lenth-1] + " ");
                flag = true;
                lenth --;
            }
        }
        String result = builder.toString();
        System.out.println(result);
    }
}
