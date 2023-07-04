package algorithm.programmers.level_0;

public class P_120816_피자나눠먹기3 {
    class Solution {
        public int solution(int slice, int n) {
            int result = n / slice;
            int k = n % slice;

            if(k > 0){
                result += 1;
            }

            return result;
        }
    }
}
