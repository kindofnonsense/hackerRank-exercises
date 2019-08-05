// Complete the countApplesAndOranges function below.
function countApplesAndOranges(s, t, a, b, apples, oranges) {

  let fixedPosApples = [];
  let fixedPosOranges = [];
  let applesInRange = 0;
  let orangesInRange = 0;

  // Modify apples positions with Apple three reference
  apples.forEach( function(apple){
    apple += a;
    fixedPosApples.push(apple);
    // Verify if that apple is in [s,t]'s range
    if (apple >= s && apple <= t){
      applesInRange++;
    }
  });
  // Do the same with the orange three
  oranges.forEach( function(orange){
    orange += b;
    fixedPosOranges.push(orange);
    if (orange >= s && orange <= t){
      orangesInRange++;
    }
  });
  // Show the result of apples and oranges in range:
  console.log(applesInRange);
  console.log(orangesInRange);
};

var matrix = [
[7,11],
[5,15],
[3, 2],
[-2, 2, 1],
[5, -6]];
// console.log(inputMatrix) // Show matrix
countApplesAndOranges(matrix[0][0], matrix[0][1], matrix[1][0], matrix[1][1], matrix[3], matrix[4])
