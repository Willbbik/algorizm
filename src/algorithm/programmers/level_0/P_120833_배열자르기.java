package algorithm.programmers.level_0;

import java.util.Arrays;

public class P_120833_배열자르기 {
    class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {

            int[] result = Arrays.copyOfRange(numbers, num1, num2+1);

            return result;
        }
    }
}
