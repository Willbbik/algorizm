package algorithm.programmers.level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_120809_배열두배만들기 {
    class Solution {
        public int[] solution(int[] numbers) {

            List<Integer> list = new ArrayList<>();

            Arrays.stream(numbers)
                    .forEach(num -> list.add(num * 2));

            int[] answer = list.stream()
                           .mapToInt(i -> i)
                           .toArray();

            return answer;
        }
    }
}
