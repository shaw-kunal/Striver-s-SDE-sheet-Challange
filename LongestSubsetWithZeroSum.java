import java.io.*;
import java.util.* ;

import java.util.ArrayList;

 class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
    
	HashMap<Integer,Integer> map = new HashMap<>();
	int n = arr.size();
	int sum =0;
	int max=0;
	for(int i=0;i<n;i++)
	{   
		int ele = arr.get(i);
		sum+=ele;
		if(sum==0) 
		max=i+1;
		else{

			if(map.containsKey(sum))
			{
				max=Math.max(max,i-map.get(sum));
			}
			else
			{
				map.put(sum,i);
				
			}
		}
	}
	return max;

	


	}
}