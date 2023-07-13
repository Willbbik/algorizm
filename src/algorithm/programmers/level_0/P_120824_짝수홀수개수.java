package algorithm.programmers.level_0;

import java.util.stream.IntStream;

public class P_120824_짝수홀수개수 {
    class Solution {
        public int[] solution(int[] num_list) {

            IntStream intStream = IntStream.of(num_list);

            int totalSize = num_list.length;
            int evenCount = (int) intStream.filter(num -> num % 2 == 0).count();
            int oddCount = totalSize - evenCount;

            int[] answer = {evenCount, oddCount};
            return answer;
        }
    }
}
