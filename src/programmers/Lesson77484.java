package programmers;

public class Lesson77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int rightNumber = 0;
        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                count++;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i] != 0) {
                    rightNumber += win_nums[j] == lottos[i] ? 1 : 0;
                }
            }
        }
        int[] answer = {rightNumber + count, rightNumber};

        if (answer[0] > 1) {
            answer[0] = 7 - answer[0];
        } else {
            answer[0] = 6;
        }

        if (answer[1] > 1) {
            answer[1] = 7 - answer[1];
        } else {
            answer[1] = 6;
        }
        return answer;
    }
}

// 맞춘 갯수를 먼저 구한 후 해당 갯수가 1보다 작을때는 6 클때는 7에서 빼서 순위 정해주기
//https://school.programmers.co.kr/learn/courses/30/lessons/77484