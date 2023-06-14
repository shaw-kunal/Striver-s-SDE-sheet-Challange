
import java.io.*;
import java.util.* ;


	// Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}


 class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
	
     LinkedListNode<Integer> prev=null; 
     LinkedListNode<Integer> curr=head;
	 while(curr!= null)
	 {
     LinkedListNode<Integer> forw=curr.next;
	 curr.next = prev;
	 prev=curr;
	 curr = forw;
	 }
	
	 return prev;
		

    }
}