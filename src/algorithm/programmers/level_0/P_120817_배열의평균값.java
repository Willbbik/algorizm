package algorithm.programmers.level_0;

import java.util.Arrays;

public class P_120817_배열의평균값 {
    class Solution {
        public double solution(int[] numbers) {

            double average = Arrays.stream(numbers)
                    .average()
                    .orElse(0);

            double answer = 0;
            return answer;
        }
    }
}
