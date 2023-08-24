package algorithm.programmers.level_0;

public class P_120906_자릿수더하기 {

    class Solution {
        public int solution(int n) {

            String str = String.valueOf(n);
            String[] array = str.split("");


            int result = 0;
            for (int i=0; i<array.length; i++) {
                result += Integer.valueOf(array[i]);
            }

            return result;
        }
    }

}
