package 链表;

import java.util.List;
//借鉴：https://cloud.tencent.com/developer/article/1680952
//https://labuladong.github.io/algo/2/17/16/

public class 合并两个链表 {
    //注意是有序链表  有序链表
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //虚拟头节点，统一逻辑
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = list1;
        ListNode p2 = list2;
        while (p1 != null && p2 != null){
            if (p1.val < p2.val){
                p.next = p1;
                p1 = p1.next;
            }else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        if(p1 != null){
            p.next = p1;
        }
        if (p2 != null){
            p.next = p2;
        }
        return dummy.next;

    }
}
