/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }
        ListNode cur = (list2.val <= list1.val) ? list2: list1;
        ListNode cur1 = list1, cur2 = list2;
        ListNode hold = cur;
        if(cur == list1){
            cur1 = cur1.next;
        }else{
            cur2 = cur2.next;
        }
        while(cur.next!= null){
            if (cur1.val <= cur2.val){
                cur.next = cur1;
                cur1 = cur1.next;
                cur = cur.next;
            }else if (cur1.val >= cur2.val){
                cur.next = cur2;
                cur2 = cur2.next;
                cur = cur.next;
            }      
        }
        if (cur1 == null){
            cur.next = cur2;
        }else if (cur2 == null){
            cur.next = cur1;
        }
        return hold;
    }
}