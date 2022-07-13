const readline = require('readline');
const rl = readline.createInterface({
    input : process.stdin,
    output : process.stdout
});

let input = [];
let count = 0;
rl.on('line', function(line) {
    input.push(line);
    count++;
    if (count === 2)
        rl.close();
}).on("close", () => {
    let [a, b, c] = input[1].toString();
    console.log(input[0]*parseInt(c));
    console.log(input[0]*parseInt(b));
    console.log(input[0]*parseInt(a));
    console.log(input[0]*input[1]);
    process.exit();
});
