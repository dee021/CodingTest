const readline = require('readline');
const rl = readline.createInterface({
    input : process.stdin,
    output : process.stdout
});

let input;

rl.on('line', function(line) {
    input = line;   
    rl.close();
}).on("close", () => {
    input = parseInt(input);
    console.log(input-543);
    process.exit();
});
