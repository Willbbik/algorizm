package algorithm.programmers.level_0;

public class P_120822_문자열뒤집기 {
    class Solution {
        public String solution(String my_string) {

            StringBuffer sb = new StringBuffer(my_string);
            String reverse = sb.reverse().toString();

            return reverse;
        }
    }
}
