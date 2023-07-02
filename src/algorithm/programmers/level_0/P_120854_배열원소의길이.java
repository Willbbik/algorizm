package algorithm.programmers.level_0;

import java.util.stream.IntStream;

public class P_120854_배열원소의길이 {
    class Solution {
        public int[] solution(String[] strlist) {

            int[] answer = new int[strlist.length];

            IntStream.range(0, strlist.length)
                    .forEach(idx -> {
                        answer[idx] = strlist[idx].length();
                    });

            return answer;
        }
    }
}
