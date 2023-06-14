import java.io.*;
import java.util.* ;

/****************************************************************

    Following is the class structure of the Node class:

        class Node
        {
        public:
	        int data;
	        Node *next;
	        Node(int data)
	        {
		        this->data = data;
		        this->next = NULL;
	        }
        };

*****************************************************************/

public class Solution {

	public static int findLength(Node node)
	{
		int length =0;

		while(node != null) 
		{
		length++;
		node = node.next;
		}
		return length;
		
	}
	public static Node getListAfterReverseOperation(Node head, int n, int b[])
	 {
		// Write your code here.

		if(head== null || head.next == null)
		 return head;

		 int length = findLength(head);

		 Node dummy = new Node(0);
		 dummy.next = head;

		 Node pre = dummy;
		 Node cur ;
		 Node nex ;
		 for(int i=0;i<n;i++)
		 {
			 if(length ==0) break;
			 if(b[i]==0) continue;
			 cur =pre.next;
			 nex  = cur.next;

			 for(int j=0;j<Math.min(b[i],length)-1;j++)
			 {
				 cur.next = nex.next;
				 nex.next = pre.next;
				 pre.next = nex;
				 nex = cur.next;

			 }
			 length -= Math.min(b[i],length);
			 pre=cur;
		 }
			 return dummy.next;
	}
}