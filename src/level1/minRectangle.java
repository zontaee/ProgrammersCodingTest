package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class minRectangle {
    public int solution(int[][] sizes) {
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        for(int i =0 ; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
        }
        for (int i = 0; i<sizes.length; i++){
            one.add(sizes[i][0]);
            two.add(sizes[i][1]);
        }
        Collections.sort(one,Collections.reverseOrder());
        Collections.sort(two,Collections.reverseOrder());

        int answer = one.get(0)*two.get(0);
        return answer;
    }
}
