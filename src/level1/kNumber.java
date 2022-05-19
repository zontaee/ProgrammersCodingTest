package level1;

public class kNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array ={1, 5, 2, 6, 3, 7, 4};
        int[][] commands ={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] solution1 = solution.solution(array, commands);
        for (int i = 0; i<solution1.length; i++){
            System.out.println(solution1[i]);
        }


    }
}
    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            int temp = 0;

            for (int i = 0; i < commands.length; i++) {

                //int[] arraycopy = array; //---> 배열 복사
                int[] arraycopy = array.clone();
                int first = commands[i][0];
                int last = commands[i][1];
                int order = commands[i][2];

                for (int j = first - 1; j < last - 1 ; j++) {
                    for(int k = j; k < last  ; k++ )
                        if(arraycopy[j] > arraycopy[k]){
                            temp = arraycopy[j];
                            arraycopy[j] = arraycopy[k];
                            arraycopy[k]=temp;
                        }
                }
                answer[i]= arraycopy[first + order-2];

            }



            return answer;
        }
    }


