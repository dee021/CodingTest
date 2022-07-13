const readline = require('readline');
const rl = readline.createInterface({
    input : process.stdin,
    output : process.stdout
});

let input;
let arr = [];

rl.on('line', function(line) {
    input = line;   
    rl.close(); // 입력 종료
}).on("close", () => {
    arr = input.split(' ').map(el => parseInt(el));
    // map : 배열 각 원소에 대하여 지정한 작업을 수행
    console.log(arr[0]-arr[1]);
    process.exit();
});