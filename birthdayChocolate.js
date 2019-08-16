// Complete the birthday function below.
function birthday(s, d, m) {
  // Defining the variables:
  let totalOfParts = 0; // Initial value of the result
  let sum = 0;          // Initial value of the sum

  // loop inside 's' array:
  for (let i of s) {
    console.log(`i = ${i}`);
    sum = 0;                    // 'sum' must reset everey loop
    for (let j=0; j<m; j++) {   // loops to sum the 'm' itens of 's'
      console.log(`s.indexOf(i) = ${s.indexOf(i)}`);
      console.log(`s.length = ${s.length}`);
      if (s.indexOf(i) == s.length-1) {

        sum = i;
      } else {
        sum = sum + s[s.indexOf(i) + j]; // 'sum' adds 'm' itens of 's'
        console.log(`the current item of 's' = ${s[s.indexOf(i) + j]}`);
        console.log(`sum of loop ${j} = ${sum}`);
      }
    };
    console.log(`sum = ${sum}`);
    if (sum == d) {             // IF sum is equal to 'd' then:
      console.log(`this time total gets 1 more!`);
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
/*
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
*/
