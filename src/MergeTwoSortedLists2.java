package src;

import java.util.List;

public class MergeTwoSortedLists2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedListNode = new ListNode();
        ListNode dummy = mergedListNode;
        while(list1 != null && list2!=null){
            if(list1.val<list2.val){
                mergedListNode.next = new ListNode(list1.val);
                list1 = list1.next;

            } else{
                mergedListNode.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            mergedListNode = mergedListNode.next;
        }
        if(list1 != null) {
            mergedListNode.next = list1;

        } else if(list2 != null) {
            mergedListNode.next = list2;
        }
        return dummy.next;
        
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode mergedListNode = mergeTwoLists(list1, list2);
        while(mergedListNode != null){
            System.out.print(mergedListNode.val);
            mergedListNode = mergedListNode.next;
        }
        
    }
}
