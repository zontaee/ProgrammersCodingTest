function solution(n) {
    let answer = 2;
    let number = 2;
    while (true) {
        if (n === number * number) {
            answer = 1;
            break;
        }
        if (number * number > 10000000) break;
        number++;
    }
    return answer;
}