package 链表;

import java.util.List;

public class 单链表的倒数第k个节点 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){this.val = val;this.next = next;}
    }
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // 删除第n个节点，要找倒数第n + 1个节点，你找倒数第n个没法删除啊。
        ListNode node = findFromEnd(dummy,n + 1);
        node.next = node.next.next;
        return dummy.next;
    }
    public ListNode findFromEnd(ListNode dummy,int k){
        ListNode p = dummy;
        ListNode p1 = dummy;
        ListNode p2 = dummy;
        for (int i = 0; i < k; i++){
            p1 = p1.next;
        }
        while (p1 != null){
            p2 = p2.next;
            p1 = p1.next;
        }
        return p2;
    }

}
