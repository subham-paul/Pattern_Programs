n = 5;
str = "";
for (row = 1; row <= n; row++) {
    for (col = 1; col <= row; col++) {
        str += "*";
    }
    str += "\n";
}

console.log(str);