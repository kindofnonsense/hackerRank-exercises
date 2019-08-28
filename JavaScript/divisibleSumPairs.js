// Complete the divisibleSumPairs function below.
function divisibleSumPairs(n, k, ar) {
  let validPairs = 0;
  let sumPair;

  // Loop inside ar array
  for (let i in ar) {
    // Now looping to form the pairs
    for (let j = i; j < ar.length; j++) {
      sumPair = 0;              // To make the sum always zero before form the pair.
      sumPair = ar[i] + ar[j]   // Then the sum is equal to ar[i] + ar[j]
      // console.log(`The sum of the pair(${ar[i]},${ar[j]}) = ${sumPair}`);
      // If the sum of the pair is equal to 'k', then we have a valid pair.
      if ((i < j) & (sumPair % k == 0)) {       // When the sum meets the criterea:
        validPairs++;    // Got one valid anwser!
      };
    }
  }
  // The return must be the pairs that meet the critera
  return validPairs;
}
// TEST SAMPLES
// Exemple 0:
let ar0 = [1,2,3,4,5,6];
let k0 = 5;
let n0 = ar0.length;
console.log(divisibleSumPairs(n0, k0, ar0));

// Sample Input 0:
let ar1 = [1,3,2,6,1,2];
let k1 = 3;
let n1 = ar1.length;
console.log(divisibleSumPairs(n1, k1, ar1));
