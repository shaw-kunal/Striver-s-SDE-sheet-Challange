import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

 class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        
		// Write your code here.
        LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode prev = dummy;
        LinkedListNode p1 = first;
        LinkedListNode p2 = second;

        while(p1!= null && p2 != null)
        {
            if((int)p1.data<(int)p2.data)
             {
                 prev.next = p1;
                 p1= p1.next;
             }
             else
             {
                 prev.next = p2;
                 p2= p2.next;
             }
             prev= prev.next;
        }
        if(p1== null)
        {
            prev.next=p2;
        }

        if(p2== null)
        {
            prev.next = p1;
        }
        return dummy.next;
	}
}
