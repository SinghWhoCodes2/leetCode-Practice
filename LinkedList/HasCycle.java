package LinkedList;

public class HasCycle {

	
	  class ListNode {
	      int val;
	      ListNode next;
	     ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	
	
	//perfect optimized solution
	  //Time Complexity:O(n)
	  //Space Complexity:O(1)
	  
	public boolean hasCycle(ListNode head) {
		
		ListNode slow=head;
		ListNode fast=head;
		
		while (fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if (slow==fast) {
				return true;
			}
		}
		
		return false;
	}
	
	//perfect optimized solution
	  //Time Complexity:O(n)
	  //Space Complexity:O(n)
//	public boolean hasCycle(ListNode head) {
//        HashSet<ListNode> set = new HashSet<>();
//        while(head!=null)
//        {
//            if(set.contains(head))
//                return true;
//            set.add(head);
//            head = head.next;
//        }
//        return false;
//    }
	
	
	
}
