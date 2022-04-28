package level1;

public class lotte {
    /**
     * 풀이
     *  최고의 등수(1등 minRank)를 7, 최악의 등수(6등 maxrRank)를 1 지정후 조건에 따라 minRank는 -1 maxRank는 +1 해준다
     */
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = {0,0};
            int minRank = 7;
            int maxRank  = 1;


            for(int i = 0; i < 6; i++){
                int check = 0;
                if(lottos[i] == 0){
                    minRank  -= 1;
                    maxRank += 1;
                }else{
                    for(int j = 0; j < 6; j++){
                        if(lottos[i] == win_nums[j]){
                            minRank  -= 1;
                            check = 1;
                        }
                    }
                    if( check == 0){
                        maxRank += 1;
                    }
                }
            }
            if(minRank  == 1 && maxRank == 7){
                maxRank = 6;
            }
            if(minRank  == 7 && maxRank == 7){
                minRank = 6;
                maxRank = 6;
            }
            answer[0] = minRank ;
            answer[1] = maxRank;
            return answer;
        }

    }
}
