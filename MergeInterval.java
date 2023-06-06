
import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class MergeInterval {
    public static List<Interval> mergeIntervals(Interval[] in) {
        // write your code here.
     List<Interval> al = new ArrayList<>();
     int n= in.length;

            Arrays.sort(in, new Comparator<Interval>(){
                @Override
                public int compare(Interval in1 ,Interval in2)
                  {
                      int finishTime1 = in1.start;
                      int finishTime2 = in2.start;

                     return  (finishTime1>finishTime2 ) ? 1: -1;
                      
                  }
            });

            // for(Interval inter: in)
            // System.out.println(inter.start+" "+inter.finish);

            int start = in[0].start;
            int end = in[0].finish;

            for(int j=1;j<n;j++)
            {
                Interval i = in[j];
                

                if(end>=i.start)
                {
                    start=(start<=i.start)?start:i.start;
                    end= (end>=i.finish)?end:i.finish;
                }
                else
                {
                    al.add(new Interval(start,end));
                    start= i.start;
                    end= i.finish;
                }

                
            }

            al.add(new Interval(start,end));

            return al;



    }
}
