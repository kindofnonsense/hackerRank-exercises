// Complete the sockMerchant function below.
function sockMerchant(n, ar) {
  let matchingPairs = 0;
  let sumEquals = 0;
  let unique = [];

  for (let item of ar) {
    if (!unique.includes(item)) {
      unique.push(item);
    }
  }

  for (let i in unique) {
    sumEquals = 0
    for (let j in ar) {
        
        //console.log(`then unique[i] = ${unique[i]} and ar[j] = ${ar[j]}`);
        if (unique[i] == ar[j]) {
          sumEquals += 1;
          //console.log(`SumEquals = ${sumEquals}`)
        }
    }
      if (sumEquals % 2 == 0){
        matchingPairs += sumEquals/2;
      } else {
        matchingPairs += Math.trunc(sumEquals/2);
      }
    //console.log(`matchingPairs = ${matchingPairs}`)
  }   
  
  // Return must be the number of matching colors pairs:
  return matchingPairs;
}


// SAMPLE TESTS
// Sample Input 0:
let n0
let ar0 = [10,20,20,10,10,30,50,10,20];
console.log(sockMerchant(n0,ar0));
