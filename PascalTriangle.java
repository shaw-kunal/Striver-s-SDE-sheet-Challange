import java.util.ArrayList;

public class PascalTriangle {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
        
        ArrayList<ArrayList<Long>> al = new ArrayList<>();
        long first = 1;
        al.add(new ArrayList<>(Arrays.asList(first)));

        if(n==1) return al;
        for(int i=1;i<n;i++)
        {
            ArrayList<Long> curr = new ArrayList<>();
            ArrayList<Long> prev =  al.get(i-1);
            curr.add(first);
            for(int j=1;j<i;j++)
            {
              long t = prev.get(j-1)+prev.get(j);
              curr.add(t);
            }
            curr.add(first);
            al.add(curr);
        }
        return al;
}
}
}
