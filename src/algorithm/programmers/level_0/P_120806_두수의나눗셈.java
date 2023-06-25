package algorithm.programmers.level_0;

public class P_120806_두수의나눗셈 {
    class Solution {
        public int solution(int num1, int num2) {

            double value = (double) num1 / (double) num2;

            return (int) Math.floor(value * 1000);
        }
    }
}
