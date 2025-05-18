package programmers;
public class Lesson133499 {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++){
            String word = babbling[i];

            if(word.contains("ayaaya") || word.contains("yeye") || word.contains("woowoo") || word.contains("mama")) {
                continue;
            }

            word = word.replace("aya", " ");
            word = word.replace("ye", " ");
            word = word.replace("woo", " ");
            word = word.replace("ma", " ");
            word = word.replace(" ", "");

            if(word.isBlank()){
                answer++;
            }
        }
        return answer;
    }
}

//public int solution(String[] babbling) {
//    int answer = 0;
//    for(int i = 0; i < babbling.length; i++){
//        String word = babbling[i];
//        word = word.replaceFirst("aya", "");
//        word = word.replaceFirst("ye", "");
//        word = word.replaceFirst("woo", "");
//        word = word.replaceFirst("ma", "");
//
//        if (word.isBlank()) {
//            answer++;
//        }
//    }
//    return answer;
//}
//기존 구현 코드였으나 하나를 띄웠을 경우는 반복적으로 처리해주지 못하는 문제가 발생

//조건문을 통해 같은 단어가 반복될 시 아예 넘어가버리게 수정
//문제를 잘 읽자

//https://school.programmers.co.kr/learn/courses/30/lessons/133499