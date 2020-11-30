/*

 */
package LinkedLists;

/**
 *
 * @author Sai
 */
public class LinkedListCycleII {
    
    public ListNode Intersect(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next != null){                
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow){
                return slow;
            }
        }
        return null;
    }
    
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next ==null){
            return null;
        }
        ListNode intersectionNode = Intersect(head);
        
        if(intersectionNode == null){
            return null;
        }
        ListNode start = head;
        while(intersectionNode!=start){
            start = start.next;
            intersectionNode = intersectionNode.next;
        }
        return start;
    }
}
