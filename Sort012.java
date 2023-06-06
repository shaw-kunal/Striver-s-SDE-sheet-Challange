public class Sort012 {
    //


    public static void swap(int[] a, int i,int j)
    {
        int temp= a[i];
        a[i] = a[j];
        a[j] =temp;
    }
    public static void sort012(int[] a)
    {
        //Write your code here
        int n = a.length;
        int left =0;
        int mid = 0;
        int right = n-1;
        while(mid<=right)
        {
            if(a[mid]==0)
            {
                swap(a,left,mid);
                left++;
                mid++;
            }
            else if(a[mid]==1)
            {
                // swap(a,mid,right);
                mid++;
            }
             else
             {
                 swap(a,right,mid);
                 right--;
             }
        }


        
    }
}
