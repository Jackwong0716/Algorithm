package 链表;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 合并k个升序链表 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val,ListNode next){this.val = val;this.next = next;}
    }
    public static void main(String[] args) {

    }
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        if (lists.length == 0) return dummy.next;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return  o1.val - o2.val;
            }
        });
        //只是把k个链表的头节点加入优先级队列中
        //
        for (ListNode head: lists){
            if (head != null){
                pq.add(head);
            }
        }
        while (!pq.isEmpty()){
            //获取头部最小节点
            ListNode tmp = pq.poll();
            p.next = tmp;
            if(tmp.next != null){
                pq.add(tmp.next);
            }
            p = p.next;
        }
        return dummy.next;
    }
}
