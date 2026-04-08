package src;

public class MergeTwoSortedLists {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list1Next = new ListNode(2);
        ListNode list1NextNext = new ListNode(4);
        list1.next=list1Next;
        list1Next.next=list1NextNext;

        ListNode list2 = new ListNode(6);
        ListNode list2Next = new ListNode(7);
        ListNode list2NextNext = new ListNode(8);
        list2.next=list2Next;
        list2Next.next=list2NextNext;
        ListNode result = mergeListNodes(list1, list2);
        
        while (result!=null){

            System.out.println(result.val);
            result = result.next;
        }
    }

        public static ListNode mergeListNodes(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(-1);
            
            
            ListNode curr = dummy;
            while(list1!=null && list2!=null){
            
        if(list1.val<list2.val){
            curr.next = list1;
            list1 = list1.next;

        } else{
            curr.next = list2;
            list2 = list2.next;
        }
        curr = curr.next;

            }
            if(list1!=null){
                curr.next = list1;
            } else if(list2!=null){
                curr.next=list2;
            }
        return dummy.next;
        }
}
