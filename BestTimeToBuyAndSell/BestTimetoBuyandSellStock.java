/*
 O(N) and O(1) could find the max num[j] - num[i] in an array (j > i)
*/
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int len = prices.length;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len; ++i) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        
        return max;
    }
}