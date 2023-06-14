import org.w3c.dom.Node;

// /****************************************************************

//  Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

//  *****************************************************************/

class Solution
{
    public static Node removeKthNode(Node head, int k)
    {
        Node dummy = new Node(0);
        // Write your code here.
        dummy.next= head;
        Node slow = dummy;
        Node fast = dummy;
        for(int i=0;i<k;i++)
           fast = fast.next;

         while(fast.next!= null)
         {
             fast=fast.next;
             slow= slow.next;
         }
         slow.next = slow.next.next;
         return dummy.next;
    }
} 
    
