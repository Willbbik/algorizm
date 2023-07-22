package algorithm.programmers.level_0;

public class P_120818_옷가게할인받기 {
    class Solution {
        public int solution(int price) {

            int discountedPrice = getDiscountedPrice(price);

            return discountedPrice;
        }

        public int getDiscountedPrice(int price) {

            if(price >= 500000){
                price *= 0.8;
            } else if (price >= 300000){
                price *= 0.9;
            } else if (price >= 100000){
                price *= 0.95;
            }

            return price;
        }

    }

}
