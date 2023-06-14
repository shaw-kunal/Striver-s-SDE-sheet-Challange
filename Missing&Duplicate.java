
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

 class MissingDuplicate {

    public static int[] missingAndRepeating(ArrayList<Integer> a, int n) {
        // Write your code here
        int missing=-1;
        int duplicate=-1;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
         arr[i] =a.get(i);
        for(int i=0;i<n;i++)
        {
           int index =Math.abs(arr[i])-1;
           if(arr[index]<0)
           {
            duplicate = Math.abs(arr[i]);
            break;
           }
           arr[index]*=-1;
           
        }
            int sum=0;
        for(int i=0;i<n;i++)  sum+=a.get(i);
         
        int Total =(int)(n*(n+1))/2; 
        // System.out.println(sum+" "+Total);
         missing = Total-(sum-duplicate);
        return new int[]{missing,duplicate};
    }
}