// Complete the birthday function below.
function birthday(s, d, m) {
  // Defining the variables:
  let sArray = s;       // Working with a local variable representing 's'.
  let totalOfParts = 0; // Initial value of the result
  let sum = 0;          // Initial value of the sum
  //let iPlusJ = 0;

  // loop inside 's' array:
  for (let i in sArray) {        // Using the for..in statement
    //console.log(`i = ${i}, representing ${sArray[i]}`);
    sum = 0;                    // 'sum' must reset everey loop
    //console.log(`i = ${i}`);
    //console.log(`s.length = ${sArray.length}`);
    if (i > sArray.length-m) {  // IF we are at the end of 's',
      sum = sArray[i];          // 'sum' will be only that last value.
    } else {
      for (let j=0; j<m; j++) { // loops to sum the 'm' itens of 's'
        //iPlusJ = Number(i) + j;
        //console.log(`iPlusJ = ${iPlusJ}`);
        sum += sArray[Number(i) + j];        // 'sum' adds 'm' itens of 's'
        //console.log(`the current item of 's' = ${sArray[Number(i) + j]}`);
        //console.log(`sum of loop ${j} = ${sum}`);
      };
    }

    //console.log(`sum = ${sum}`);
    if (sum == d) {             // IF sum is equal to 'd' then:
      //console.log(`this time total gets 1 more!`);
      totalOfParts++;           // totalOfParts adds one.
    };
  };

  // Return must print the total of ways that the chocolate can be portionated.
  return totalOfParts;
};
// TEST SAMPLES
// Sample Input 0
let s1 = [1,2,1,3,2];
let d1 = 3;
let m1 = 2;
console.log(birthday(s1,d1,m1));

// Sample Input 1
let s2 = [1,1,1,1,1,1];
let d2 = 3;
let m2 = 2;
console.log(birthday(s2,d2,m2));

// Sample Input 2
let s3 = [4];
let d3 = 4;
let m3 = 1;
console.log(birthday(s3,d3,m3));
