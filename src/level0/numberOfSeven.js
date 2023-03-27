function solution(array) {
    let answer = 0;
    array.map(item => {
        item.toString().split("").map(item2 => {
            if (item2.includes('7')) ++answer
        });
    })
    return answer;
}