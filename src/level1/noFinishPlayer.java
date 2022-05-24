package level1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class noFinishPlayer {
    class Solution {
        /**
         * 시간복잡도 n^2
         * @param participant
         * @param completion
         * @return
         */
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            for(int i = 0 ; i< completion.length; i++){
                for(int j = 0; j< participant.length; j++){
                    if(completion[i].equals(participant[j])){
                        participant[j] = "";
                        break;
                    }
                }
            }
            for(int i = 0; i< participant.length; i++){
                if(participant[i] != ""){
                    answer = participant[i];
                }
            }
                return answer;
        }

        /**
         * 시간 복잡도 n
         * @param participant
         * @param completion
         * @return
         */
        public String solution2(String[] participant, String[] completion) {
            String answer = "";
            HashMap<String,Integer> player = new HashMap<>();
            for (String s : participant) {
                player.put(s,player.getOrDefault(s,0) + 1);
            }
            for (String s : completion) {
                player.put(s,player.get(s)-1);
            }
            Iterator<Map.Entry<String, Integer>> iterator = player.entrySet().iterator();

            while (iterator.hasNext()){
                Map.Entry<String, Integer> next = iterator.next();
                if(next.getValue() != 0 ){
                    answer = next.getKey();
                }
            }
            return answer;
        }
    }
}
