public class BestTimeToSellBuy 
{

     public static int maximumProfit(ArrayList<Integer> p){
        // Write your code here.
        // 2,100,150,120
        int profit =0;
        int min=p.get(0);

        for(int i=0;i<p.size();i++)
        {
            min=Math.min(min,p.get(i));
            profit=Math.max(profit, p.get(i)-min);

        }
        return profit;


    }
}
