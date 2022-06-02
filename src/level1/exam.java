package level1;

import java.util.ArrayList;

public class exam {
    class Solution {
        public int[] solution(int[] answers) {
            int[] score = {0,0,0};
            int[] giveUP1 = {1, 2, 3, 4, 5};
            int[] giveUP2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] giveUP3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

            for(int i = 0; i<answers.length; i++ ){
                if(answers[i] == giveUP1[i%giveUP1.length]){score[0]++;}
                if(answers[i] == giveUP2[i%giveUP2.length]){score[1]++;}
                if(answers[i] == giveUP3[i%giveUP3.length]){score[2]++;}
            }
            int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

            ArrayList<Integer> list = new ArrayList<>();
            if(maxScore == score[0]){list.add(1);}
            if(maxScore == score[1]){list.add(2);}
            if(maxScore == score[2]){list.add(3);}
            int[] answer = new int[list.size()];

            for(int i = 0 ; i<answer.length; i++){
                answer[i] = list.get(i);
            }


            return answer;
        }
    }
}
