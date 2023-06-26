package algorithm.programmers.level_0;

public class P_120829_각도기 {
    public int solution(int angle) {
        if (angle == 180) {
            return 4;
        } else if (90 < angle && angle < 180) {
            return 3;
        } else if (90 == angle) {
            return 2;
        } else {
            return 1;
        }
    }
}
