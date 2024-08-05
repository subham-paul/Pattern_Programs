let n = 5;
let str = "";
for (row = 1; row <= n; row++) {
    for (col = 1; col <= n - row; col++) {
        str += "*";
    }
    str += "\n"
}
console.log(str);