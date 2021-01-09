import java.util.Arrays;

public class BuyOneGetOneFree {

    public int buy(int[] prices) {
        int ret = 0;
        Arrays.sort(prices);
        int len = prices.length;
        for (int i = len - 1; i >= 0; i -= 2) {
            ret += prices[i];
        }
        return ret;
    }
}
