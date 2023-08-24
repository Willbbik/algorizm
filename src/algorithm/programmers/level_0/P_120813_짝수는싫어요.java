package algorithm.programmers.level_0;

import java.util.ArrayList;
import java.util.List;

public class P_120813_짝수는싫어요 {
    class Solution {
        public int[] solution(int n) {
            int[] answer = {};

            List<Integer> list = new ArrayList<>();

            for(int i=1; i<=n; i++){
                if(i % 2 != 0){
                    list.add(i);
                }
            }

            int[] result = list.stream().mapToInt(i -> i).toArray();

            return result;
        }
    }
}
