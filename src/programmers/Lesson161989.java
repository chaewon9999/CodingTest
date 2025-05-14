package programmers;

public class Lesson161989 {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int endPoint = section[0] + m - 1;
        for (int i : section) {
            if (i > endPoint) {
                endPoint = i + m - 1;
                answer++;
            }
        }
        return answer;
    }
}

//무조건 한 번 칠해야하므로 answer를 1으로 놓고 시작
//처음 칠했을 때 칠해진 범위 endPoint
//반복문을 통해 색칠해야 할 곳이 endPoint가 작다면 무시
//https://school.programmers.co.kr/learn/courses/30/lessons/161989