import java.util.LinkedList;
import java.util.List;

public class 回溯全排列 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permute(nums);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums,track,res);
        return res;
    }
    static void backtrack(int[] nums,LinkedList<Integer> track, List<List<Integer>> res){
        //遍历到叶子节点的时候的操作
        if(track.size() == nums.length){
             res.add(new LinkedList<>(track));
             return;
        }
        //每个节点都面临的操作
        for (int i = 0; i < nums.length; i++){
            if (track.contains(nums[i])){
                continue;
            }
            //往下走之前，做的决策
            track.add(nums[i]);
            //backtrack就相当于指针，进入下层决策树。
            backtrack(nums,track,res);
            //回溯时的删除操作
            track.removeLast();
        }
    }
}
