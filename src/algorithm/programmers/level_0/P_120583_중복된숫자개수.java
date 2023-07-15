package algorithm.programmers.level_0;

import java.util.Arrays;

public class P_120583_중복된숫자개수 {
    class Solution {
        public int solution(int[] array, int n) {

            long count = Arrays.stream(array)
                    .filter(number -> number == n)
                    .count();

            return (int) count;
        }
    }
}
