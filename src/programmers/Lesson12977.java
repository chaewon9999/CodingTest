package programmers;

public class Lesson12977 {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    boolean isPrime = true;
                    for (int num = 3; num < sum; num++) {
                        if (sum % num == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime) answer++;
                }
            }
        }
        return answer;
    }
}

//3가지 값을 구하기 위해 for문 3가지 사용
//소수임을 확인하기 위해 반복문과 boolean 사용
//1 이상의 3가지 정수의 합이기 때문에 3부터 반복문 시작
//중간에 나눠지는 값이 있다면 더 이상 계산하지 않아도 괜찮기때문에 break 추가
//https://school.programmers.co.kr/learn/courses/30/lessons/12977