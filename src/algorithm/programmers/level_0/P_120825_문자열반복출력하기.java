package algorithm.programmers.level_0;

public class P_120825_문자열반복출력하기 {
    class Solution {
        public String solution(String my_string, int n) {

            int length = my_string.length();
            String answer = "";

            for(int i=0; i<length; i++){
                String substring = my_string.substring(i, i+1);

                for(int k=0; k<n; k++){
                    answer += substring;
                }
            }

            return answer;
        }
    }
}
