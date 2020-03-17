package leetcode;

public class LeetCode148 {
	   public ListNode sortList(ListNode head) {
	        if(head == null || head.next == null) return head;
	        ListNode dummy = new ListNode(0);
	        dummy.next = head;
	        int len = getListLen(head);
	        int itrv = 1;
	        while(itrv < len) {
	            ListNode pre = dummy;
	            ListNode h = dummy.next;
	            // �ҵ��ϲ������h1��h2ͷ�ڵ�
	            while(h!=null) {
	                int i = itrv;
	                ListNode h1 = h;
	                for(; h != null && i > 0; i--) {
	                    h = h.next;
	                }
	                // i>0˵��û������2ֱ�ӷ���
	                if(i > 0) break;
	                ListNode h2 = h;
	                i = itrv;
	                for(; h != null && i > 0; i--) {
	                    h = h.next;
	                }
	                // �����������ĳ���
	                int c1 = itrv;
	                int c2 = itrv - i;
	                
	                //�ϲ�
	                while(c1 > 0 && c2 > 0) {
	                    if(h1.val < h2.val) {
	                        pre.next = h1;
	                        h1 = h1.next;
	                        c1--;
	                    }else {
	                        pre.next = h2;
	                        h2 = h2.next;
	                        c2--;
	                    }
	                    pre = pre.next;
	                }
	                pre.next = c1 > 0 ? h1 : h2;
	                while(c1 > 0 || c2 > 0) {
	                    pre = pre.next;
	                    c1--;
	                    c2--;
	                }
	                pre.next = h;
	            }
	            itrv*=2;
	        }
	        return dummy.next;
	    }

	    private int getListLen(ListNode head) {
	        ListNode cur = head;
	        int len = 0;
	        while(cur != null) {
	            len++;
	            cur = cur.next;
	        }
	        return len;
	    }

}
