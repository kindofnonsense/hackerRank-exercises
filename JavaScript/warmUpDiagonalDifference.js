function diagonalDifference(arr) {
    // Write your code here
    var primDiag = arr[0][0] + arr[1][1] + arr[2][2];
    var secDiag = arr[0][2] + arr[1][1] + arr[2][0];
    var diagDiff = Math.abs(primDiag - secDiag);
    return diagDiff;
};

let arr = [[11,2,4], [4,5,6], [10,8,-12]];

console.log(diagonalDifference(arr));
