package leetcode;

import java.util.LinkedList;

public class LeetCode2 {
	
	class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    	
	    	//哑头结点
	    	ListNode dummyHead = new ListNode(0);
	    	
	    	ListNode p = l1, q = l2, curr =dummyHead;
	    	
	    	//进位
	    	int carry = 0;
	    	
	    	while(p != null || q != null) {
	    		int x = (p != null )? p.val : 0;
	    		int y = (q != null )? q.val : 0;
	    		int sum = carry + x + y; 
	    		carry = sum / 10;
	    		curr.next = new ListNode(sum % 10);
	    		curr = curr.next;
	    		if(p != null) {p = p.next;}
	    		if(q != null) {q = q.next;}
	    		
	    	}
	    	if(carry > 0) {
	    		curr.next = new ListNode(carry);
	    	}
	    	return dummyHead.next;
	    }
	}

}




 // Definition for singly-linked list.
 	class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
     
     
     
  }
 	
 	
 	

