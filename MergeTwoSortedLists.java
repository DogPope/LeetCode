// Problem found at https://leetcode.com/problems/merge-two-sorted-lists
public class MergeTwoSortedLists{
    public ListNode mergeTwoSortedLists(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.val < l2.val){
            l1.next = mergeTwoSortedLists(l1, l2);
            return l1;
        }
        else{
            l2.next = mergeTwoSortedLists(l1, l2);
            return l2;
        }
    }
    class ListNode{
        int val;
        ListNode next;
        ListNode (int x) {val = x;}
    }
    public static void main(String[] args) {
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        ListNode l1 = m.new ListNode(1);
        l1.next = m.new ListNode(2);
        
    }
}