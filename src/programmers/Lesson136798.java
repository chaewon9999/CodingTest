package programmers;

public class Lesson136798 {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count += (j * j == i) ? 1 : 2;
                }
            }

            if (count > limit) {
                count = power;
            }

            answer += count;
        }

        return answer;
    }
}

//처음 풀이
//class Solution {
//    public int solution(int number, int limit, int power) {
//        int answer = 0;
//        for (int i = 1; i <= number; i++) {
//            int count = 0;
//            for (int j = 1; j <= number; j++) {
//                if (i % j == 0) {
//                    count++;
//                }
//            }
//            if (count > limit) {
//                count = power;
//            }
//            answer += count;
//        }
//        return answer;
//    }
//}
// 단순하게 전부 계산해 봤더니 시간 초과 -> 최적화 필요

//class Solution {
//    public int solution(int number, int limit, int power) {
//        int answer = 0;
//
//        for (int i = 1; i <= number; i++) {
//            int count = 0;
//            for (int j = 1; j <= number; j++) {
//                if (i % j == 0) {
//                    count++;
//                }
//                if (count > limit) {
//                    count = limit + 1;
//                    break;
//                }
//            }
//            if (count > limit) {
//                count = power;
//            }
//            answer += count;
//        }
//        return answer;
//    }
//}
//해당 코드로 최적화 시도 -> 여전히 실패

//제곱수 도입

//https://school.programmers.co.kr/learn/courses/30/lessons/136798
