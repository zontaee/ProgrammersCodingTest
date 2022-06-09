package level1;
import java.util.Arrays;
public class gymClothes {
    public int solution(int n, int[] lost, int[] reserve) {


        Arrays.sort(lost);
        Arrays.sort(reserve);
        n -= lost.length;

        for (int i = 0; i<lost.length; i++ ){
            for(int j=0; j<reserve.length; j++){
                if(reserve[j] == lost[i]){
                    n += 1;
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i<lost.length; i++ ){
            for(int j=0; j<reserve.length; j++){
                if(reserve[j] == lost[i] -1 || reserve[j] == lost[i] + 1 ){
                    n += 1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        int answer = n;
        return answer;
    }
}
