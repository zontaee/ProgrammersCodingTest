

function solution(common) {
    // geometric 등비 수열, arithmetic 등차 수열
    let sequence ="geometric";
    // 수열 종류 판별
    if((common[1]-common[0]) === (common[2]-common[1])) sequence = "arithmetic";
    // 수열 종류에 따라 마지막 수 계산
    const answer = sequence === "arithmetic" ?
        common[common.length-1] + (common[1] - common[0])
      : common[common.length-1] * (common[1] / common[0]);
    console.log(answer);
    return answer;
}

