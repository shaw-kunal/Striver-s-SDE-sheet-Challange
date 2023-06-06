import java.util.*;

public class NextPermutaion {

    public static void main(String[] args) 
    {
     ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,3,2));
      System.out.println(nextPermutation(al));
        
    }
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> a) 
	{-
		// Write your code here.

	   // three step 
	   // find the element from right which is a[i]<a[i+1]
	   // then just find the  greater element than a[i]
	   // swap it 
	   // and rverse the element from i+1, n-1 
		int n = a.size();
        if(n==1) return a;

		int index =-1;
	    for(int i=n-2;i>=0;i--)
		{
			if(a.get(i)<a.get(i+1))
			{
				index=i;
			    break;
			}
		}
        if(index==-1)
          Collections.sort(a);
		// int j=-1;
        else
        {
		   for(int i=n-1;i>index;i--)
	    	{
			if(a.get(i)>a.get(index))
			{
                Collections.swap(a,index,i);
				break;
			}
            
		    List<Integer> sublist= a.subList(index+1,n-1);
			Collections.reverse(sublist);
		}
    }
      return a;
	
	}
}

    
