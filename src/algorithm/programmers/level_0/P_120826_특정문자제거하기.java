package algorithm.programmers.level_0;

public class P_120826_특정문자제거하기 {
    class Solution {
        public String solution(String my_string, String letter) {
            String answer = my_string.replaceAll(letter, "");

            return answer;
        }
    }
}
