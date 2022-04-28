package level1;

public class numberChange {
    class Solution {
        public int[] solution(long n) {
            String str = String.valueOf(n);
            int numberLength = str.length();
            int[] answer = new int[numberLength];
            long restNumber;
            long liveNumber = n;
            for(int i = 0 ; i < numberLength; i++){
                restNumber = liveNumber%10;
                liveNumber = liveNumber/10;

                answer[i] = (int)restNumber;
            }

            return answer;
        }
    }
}
