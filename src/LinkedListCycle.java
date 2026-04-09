package src;

import src.CreateBST.TreeNode;
import src.MergeTwoSortedLists.ListNode;

public class LinkedListCycle {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        //ListNode node4 = new ListNode(-4);
        head.next=node2;
        node2.next=node3;
        //node3.next=node4;
        //node4.next=node2;
        System.out.println(hasCycle(head));

    }
    public static boolean hasCycle(ListNode head) {
        //2 ptr if the ptr meet then cycle exists
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr!=null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr==fastPtr){
                return true;
            }
        }

        return false;
    }
}
