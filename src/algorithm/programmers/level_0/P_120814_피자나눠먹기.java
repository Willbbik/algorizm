package algorithm.programmers.level_0;

public class P_120814_피자나눠먹기 {

    class Solution {
        public int solution(int n) {
            int result = n / 7;
            int k = n % 7;

            if(k > 0){
                result += 1;
            }

            return result;
        }
    }

}
