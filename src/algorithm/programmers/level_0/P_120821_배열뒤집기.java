package algorithm.programmers.level_0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P_120821_배열뒤집기 {
    class Solution {
        public int[] solution(int[] num_list) {

            List<Integer> collect = Arrays.stream(num_list).boxed().collect(Collectors.toList());
            int[] answer = new int[collect.size()];

            Collections.reverse(collect);

            for (int i = 0; i < collect.size(); i++) {
                answer[i] = collect.get(i); // Assign each element to the array
            }

            return answer;
        }
    }
}
