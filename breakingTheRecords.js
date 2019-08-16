// Complete the breakingRecords function below.
function breakingRecords(scores) {
  // Defing variables
  let result = [0,0]; // Initial value for result array
  let highest = scores[0];  // Inicial value for the highest score record
  let lowest = scores[0];   // Inicial value for the lowest score record

  // loop inside scores array
  for (let score of scores) {
    // console.log(score);  // Show the actual score in the loop
    if (score > highest) {  // IF the score is higher than highest record:
      highest = score;      // it becomes the new highest record and,
      result[0] ++;         // add one to the 'times the highest record changed'
    } else if(score < lowest) {
                            // ELSE IF the score is lower than the lowest record:
      lowest = score;       // it becomes the new lowest record and,
      result[1] ++;         // add one th the 'times the lowest record changed'
    }
  };

  // The return must be the number of times that:
  // result[0] = highest score has been breaked,
  // result[1] = lowest score has been breaked.
  return result;
};

// TEST SAMPLES:
// Sample Input 0
var score1 = [10,5,20,20,4,5,2,25,1];
console.log(breakingRecords(score1));

// Sample Input 1
var score2 = [3,4,21,36,10,28,35,5,24,42];
console.log(breakingRecords(score2));
