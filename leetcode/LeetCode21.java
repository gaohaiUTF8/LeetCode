package leetcode;

public class LeetCode21 {
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null)return l2;
		if(l2==null)return l1;
		
		ListNode dummy = new ListNode(0);		
		ListNode last = dummy;
		
		while(l1 != null && l2 !=null) {
			if (l1.val < l2.val) {
				last.next = l1;
				l1 = l1.next;
				last = last.next;
			}
			else {
				last.next = l2;
				l2 = l2.next;
				last = last.next;
			}
			
		    if (l1 != null) {
				last.next = l1;
			}
		    if (l2 != null) {
		    	last.next = l2;
		    }
				
			}
		 
		 
		 
		 
		 
		 return dummy.next;

	    }

}
