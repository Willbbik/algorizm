package algorithm.programmers.level_0;

public class P_120831_짝수의합 {
    class Solution {
        public int solution(int n) {

            int result = 0;

            while(n > 0){

                if(n % 2 == 0){
                    result += n;
                }

                n--;
            }
            return result;
        }
    }
}
