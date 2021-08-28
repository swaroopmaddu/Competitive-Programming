class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverseList(slow);
        fast = head;
        
        while(slow!=null){
            if(slow.val!=fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
        
    }
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode current = head;
        
        while(current!=null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}