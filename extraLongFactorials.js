// Complete the extraLongFactorials function below.
function extraLongFactorials(n) {
  let factorial = BigInt(1);
  /*
  // Method 1: Loop backwards from 'n' to zero:
  for (let i = n; i > 0; i--) {
    factorial *= i;     // factorial = i * (i-1) * (i-2) * ... *(1)
  };
  */
  // Method 2: Loop forward from zero to 'n':
  for (let j = BigInt(1); j <= n; j++) {
    factorial *= j;
  };

  // Returns the factorial of 'n'
  // return factorial;
  console.log(factorial.toString()) // Prints the factorial of 'n', and .toString() removes the final 'n' from the BigInt.

}
// TEST SAMPLES
// Example input 0:
let n0 = 30;
extraLongFactorials(n0);

// Sample Input 0:
let n1 = 25;
extraLongFactorials(n1);

// Sample Test case 1:
let n2 = 45;
extraLongFactorials(n2);
