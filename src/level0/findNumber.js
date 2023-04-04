function solution(num, k) {
    let answer = num.toString().split("").map((item, index) => { if(k == item) return index +1; } )
        .filter(item2 => item2 !== undefined)[0];
    return answer === undefined ? -1 : answer;
}
/** indexOf를 썻다면 코드를 3줄에서 1줄로 줄일 수 있었다.
function solution(num, k) {
    return num.toString().split("").map((el) => Number(el)).indexOf(k) + 1 || -1
}
**/

