package leetcode;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;





public class LeetCode23 {
	
	
	public ListNode mergeKLists1(ListNode[] lists) {

        if (lists.length == 0) {
            return null;
        }

        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
          
        	@Override
        	public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        for (ListNode list : lists) {
            if (list == null) {
                continue;
            }
            pq.add(list);
        }

        while (!pq.isEmpty()) {
            ListNode nextNode = pq.poll();
            curr.next = nextNode;
            curr = curr.next;
            if (nextNode.next != null) {
                pq.add(nextNode.next);
            }
        }
        return dummyHead.next;
    }
	
	
	
	
	//超出时间限制
	public ListNode mergeKLists(ListNode[] lists) {
		
		ListNode dummy = new ListNode(-1);
		ListNode p =dummy;
		List<Integer> temp = new ArrayList<>();
		for(ListNode node : lists) {
			while(node != null) {
				temp.add(node.val);
			}
		}
		Collections.sort(temp);
		for(Integer integer : temp) {
			p.next = new ListNode(integer); 
			p=p.next;
		}
		return dummy.next;
    }
	


}
