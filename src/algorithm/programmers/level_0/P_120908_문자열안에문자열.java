package algorithm.programmers.level_0;

public class P_120908_문자열안에문자열 {
    class Solution {
        public int solution(String str1, String str2) {
            boolean contains = str1.contains(str2);

            if(contains){
                return 1;
            }

            return 2;
        }
    }
}
