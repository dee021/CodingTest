const readline = require('readline');
const rl = readline.createInterface({
    input : process.stdin,
    output : process.stdout
});

let input;
let a, b, c;

rl.on('line', function(line) {
    input = line;   
    rl.close();
}).on("close", () => {
    [a, b, c] = input.split(' ').map(el => parseInt(el));
    console.log((a+b)%c);
    console.log(((a%c) + (b%c))%c);
    console.log((a*b)%c);
    console.log(((a%c) * (b%c))%c);
    process.exit();
});
