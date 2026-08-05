public class maxProfit{
public static void main(String[] args){

int[] prices={7,1,5,3,6,4};

int profit=0;

        int low=prices[0];

        for(int i=0;i<prices.length;i++){

                int temp=prices[i]-low;

                profit=Math.max(profit,temp);

                if(prices[i]<low){

                    low=prices[i];

                }
        }

    System.out.println(profit);

    }

}
     