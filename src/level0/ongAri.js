function solution(babbling) {
    const ong = ["aya", "ye", "woo", "ma"];
    let answer = 0;
    for (let i of babbling) {
        for (let ii of ong) {
            if (i.includes(ii)) {
                i = i.replace(ii, 'X');
            }
        }
        i = i.replace(new RegExp("X", 'g'), '');
        if (i === '') answer++
    }
    return answer;
}