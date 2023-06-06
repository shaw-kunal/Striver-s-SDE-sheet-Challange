

import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class DuplicateElementInArray{
    public static int findDuplicate(ArrayList<Integer> a, int n){
        // Write your code here.
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
          arr[i] = a.get(i);

          
        for(int i=0;i<n;i++)
        {
            int index = Math.abs(arr[i]) - 1;
            if(arr[index]<0)
              return Math.abs(arr[i]);
              arr[index]*=-1;
        }
        return -1;

    }
}
