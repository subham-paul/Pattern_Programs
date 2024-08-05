const n = 5;
let str = "";

for (let row = 0; row < n; row++) {
    for (let col = 0; col < n; col++) {
        if (row == 0 || row == n - 1 || col == 0 || col == n - 1) {
            str += "*";
        } else {
            str += " ";
        }
    }
    str += "\n";
}

console.log(str);