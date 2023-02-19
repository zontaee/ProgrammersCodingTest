const dots = [[1, 4], [9, 2], [3, 8], [11, 6]]

function solution(dots) {
    let answer = 0;
    // 기울기가 같으면 평행
    if((dots[0][0] - dots[1][0]) / (dots[0][1] - dots[1][1])
    === (dots[2][0] - dots[3][0]) / (dots[2][1] - dots[3][1]))  answer = 1;

    if((dots[0][0] - dots[2][0]) / (dots[0][1] - dots[2][1])
    ===(dots[1][0] - dots[3][0]) / (dots[1][1] - dots[3][1]) ) answer = 1;
    return answer;
}


