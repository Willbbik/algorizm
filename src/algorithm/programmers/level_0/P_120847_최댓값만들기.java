package algorithm.programmers.level_0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class P_120847_최댓값만들기 {
    class Solution {
        public int solution(int[] numbers) {

            List<Integer> collect = Arrays.stream(numbers)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());

            int result = collect.get(0) * collect.get(1);

            return result;
        }
    }
}
