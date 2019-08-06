// Complete the kangaroo function below.
function kangaroo(x1, v1, x2, v2) {
  let jump = (x1 - x2)/(v2 - v1);
  if ((x1>x2 && v1>v2)||(x2>x1 && v2>v1)||(!Number.isInteger(jump))){
    // If the starting positions and the jump rates are higher, they will never catch each other.
    // And if jump is not a Integer, they will not catch either.
    return 'NO'
  } else {
    return 'YES'
  };
}
// Testing input
var test1 = [0,3,4,2];
var test2 = [0,2,5,3];
var result1 = kangaroo(test1[0], test1[1], test1[2], test1[3]);
var result2 = kangaroo(test2[0], test2[1], test2[2], test2[3]);
console.log(result1);
console.log(result2);
