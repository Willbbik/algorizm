package algorithm.programmers.level_0;

public class P_120819_아이스아메리카노 {
    class Solution {
        public int[] solution(int money) {
            int iceAmericanoPrice = 5500;
            int[] answer = new int[2];

            if(money < iceAmericanoPrice){
                answer[0] = 0;
                answer[1] = 0;
            }

            int i = money / iceAmericanoPrice;
            int w = money % iceAmericanoPrice;

            answer[0] = i;
            answer[1] = w;

            return answer;
        }
    }
}
