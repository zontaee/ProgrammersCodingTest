package level1;

public class Sort {
    class Solution {
        public long solution(long n) {
            String number = String.valueOf(n);
            int length = number.length();
            int[] sortNumber = new int[length];
            int temp = 0;
            int multiple = 1;
            long answer = 0;

            for (int i = 0; i < length; i++) {
                sortNumber[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
            }

            for (int i = 0; i < length-1; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (sortNumber[i] < sortNumber[j]){
                        temp = sortNumber[i];
                        sortNumber[i] = sortNumber[j];
                        sortNumber[j] = temp;
                    }
                }
            }
            for(int i = length -1; i>=0; i--){
                answer += (long)sortNumber[i]*multiple;
                multiple *= 10;
            }


            return answer;
        }
    }

}
