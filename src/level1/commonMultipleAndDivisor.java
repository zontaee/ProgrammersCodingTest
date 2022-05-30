package level1;

public class commonMultipleAndDivisor {

    public int[] solution(int n, int m) {
        int[] answer = {n, n};

        if (n > m) {
            answer[0] = euclid(m, n);
            answer[1] = n * m / answer[0];
        } else {
            answer[0] = euclid(n, m);
            answer[1] = n * m / answer[0];
        }


        return answer;
    }

    /**
     *유클리드 호제법 재귀함수 이용
     */
    public int euclid(int a, int b) {
        if (a % b == 0)
            return b;
        return euclid(b, a % b);
    }
}
