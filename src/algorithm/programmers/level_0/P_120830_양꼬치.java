package algorithm.programmers.level_0;

public class P_120830_양꼬치 {
    class Solution {

        public static int LAMB_SKEWERS_PRICE = 12000;
        public static int DRINK_PRICE = 2000;

        public int solution(int n, int k) {
            int price = getPrice(n, k);

            return calculateServicePrice(price, n);
        }

        private int getPrice(int n, int k) {
            return (LAMB_SKEWERS_PRICE * n) + (DRINK_PRICE * k);
        }

        public int calculateServicePrice(int price, int n){
            int count = n / 10;

            return price - (DRINK_PRICE * count);
        }
    }
}
