package algorithm.programmers.level_0;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P_120903_배열의유사도 {
    class Solution {
        public int solution(String[] s1, String[] s2) {
            List<String> list1 = Arrays.asList(s1);
            List<String> list2 = Arrays.asList(s2);

            List<String> result = list1.stream()
                    .filter(o -> list2.stream().anyMatch(Predicate.isEqual(o)))
                    .collect(Collectors.toList());

            return result.size();
        }
    }
}
