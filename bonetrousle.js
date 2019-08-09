/*
 * Complete the bonetrousle function below.
 */
function bonetrousle(n, k, b) {
    /*
     * Write your code here.
     */
     // Max. number of disponible sticks calculation
     let maxSticks = 0;
     for (let i=0; i<=k; i++) {
       maxSticks += i;
     };
     // Verification if it is possible to find a solution
     if (n > maxSticks) {
       // If n > total of sticks, it's not possible
       return -1; //
     } else {
       // Define a random number to first guess
       let randomNumber = Math.random();
       let randomBox = Math.floor(randomNumber*k);
       // Auxiliar randomizer
       if (randomNumber > 0.5) {
         var auxRandomizer = 1;
         //console.log(`Random auxliar was: ${auxRandomizer}`);
       } else {
         var auxRandomizer = 0;
         //console.log(`Random auxliar was: ${auxRandomizer}`);
       }
       // Define an array of boxes that meet the criterea
       let boxes = [];
       boxes[0] = randomBox;
       let boxesSum = boxes[0];
       // While boxesSum is lower than 'n',
       //while (boxesSum <= n) {
         for (let j=1; j<b-1; j++) {
           boxes[j] = Math.floor(randomNumber*Math.abs(k-j))
           boxesSum += boxes[j];
         }
         boxes[b-1] = n - boxesSum;
  //     };
       return boxes;
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
