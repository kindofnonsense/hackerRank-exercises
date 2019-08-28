/*
 * Complete the bonetrousle function below.
 */
function bonetrousle(n, k, b) {
    /*
     * Write your code here.
     */

     /*
     let maxSticks = 0; // Calculate if the store has the necessary number of boxes
     for (let i=0; i<=k; i++){
       maxSticks += i;
     };
     console.log('maxSticks: ',maxSticks);
     */

     let maxBoxesToBuy = []; // Calculate the boxes that can be bought
     let maxBoxCombination = 0
     for (let j=0; j<b; j++){
       maxBoxesToBuy.push(k-j);
       maxBoxCombination += k-j;
     };
     //console.log('maxBoxesToBuy: ',maxBoxesToBuy);
     //console.log('maxBoxCombination: ',maxBoxCombination);
     if (n > maxBoxCombination){
       // If the number of sticks to buy (n) is higher than the maxBoxCombination, it will return -1
       return -1;
     } else {
       let randomCombination = [];
       for (let i=0; i=b; i++){
         randomCombination.push(k-i);
       }
       const reducer = (accumulator, currentValue) => accumulator + currentValue;
       while (randomCombination.reduce(reducer) > n){
         if (randomCombination[0]>0 && b<2) {randomCombination[0]--;
         } else if (randomCombination[1]>0 && b<3) {randomCombination[1]--;
         } else if (randomCombination[2]>0 && b<4) {randomCombination[2]--;
         } else {randomCombination[3]--;}
       };
       //let rCMax = 0;
       //let limit = 0;

       return 2;
     }
   };
// Testing inputs
var test1 = [12,8,3];
var test2 = [10,3,3];
var test3 = [9,10,2];

bonetrousle(test1[0], test1[1], test1[2]);
bonetrousle(test2[0], test2[1], test2[2]);
bonetrousle(test3[0], test3[1], test3[2]);

console.log(bonetrousle(test1[0], test1[1], test1[2]), bonetrousle(test2[0], test2[1], test2[2]), bonetrousle(test3[0], test3[1], test3[2]));
