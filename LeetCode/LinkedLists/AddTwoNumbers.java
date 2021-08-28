public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0,sum=0;
        while(l1 !=null && l2 != null){
            sum = l1.val + l2.val + carry;
            carry = (int)Math.floor(sum/10);
            sum = sum % 10;
            current.next = new ListNode(sum);
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1!=null){
            while(l1 !=null){
                sum = l1.val + carry;
                carry = (int)Math.floor(sum/10);
                sum = sum % 10;
                current.next = new ListNode(sum);
                current = current.next;
                l1 = l1.next;
            }
        }
        if(l2!=null){
            while(l2 !=null){
                sum = l2.val + carry;
                carry = (int)Math.floor(sum/10);
                sum = sum % 10;
                current.next = new ListNode(sum);
                current = current.next;
                l2 = l2.next;
            }
        }
        if(carry!=0){
            current.next = new ListNode(carry);
        }
        return head.next;
    }
}
