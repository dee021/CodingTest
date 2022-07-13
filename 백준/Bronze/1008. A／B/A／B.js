const readline = require('readline');
const rl = readline.createInterface({
    input : process.stdin,
    output : process.stdout
});

let input;
let arr = [];

rl.on('line', function(line) {
    input = line;   
    rl.close();
}).on("close", () => {
    arr = input.split(' ').map(el => parseInt(el));
    console.log(arr[0]/arr[1]);
    process.exit();
});
