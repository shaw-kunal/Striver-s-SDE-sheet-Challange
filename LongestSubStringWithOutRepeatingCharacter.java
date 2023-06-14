
import java.util.* ;
import java.io.*; 
 class Solution 
{
	public static int uniqueSubstrings(String in) 
    {
		//write your code here
		
		int left=0,right=1;
		char ch[] = in.toCharArray();
		HashSet<Character> set = new HashSet<>();
		int n= in.length();
		if(n==1) return 1;
		set.add(ch[0]);
		int max = 0;
		while(right<n)		
	    { 
		   char c= ch[right];
		   while(set.contains(c))
		      set.remove(ch[left++]);
		   set.add(c);
		   max= Math.max(max,right-left+1);
		   right++;
		}
		return max;
	}

}
