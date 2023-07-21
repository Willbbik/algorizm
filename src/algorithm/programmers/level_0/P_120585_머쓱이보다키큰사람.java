package algorithm.programmers.level_0;

import java.util.Arrays;

public class P_120585_머쓱이보다키큰사람 {
    class Solution {
        public int solution(int[] array, int height) {

            long count = Arrays.stream(array)
                    .filter(qwe -> qwe > height)
                    .count();

            return (int) count;
        }
    }
}
