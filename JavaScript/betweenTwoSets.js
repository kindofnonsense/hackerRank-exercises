/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

function getTotalX(a, b) {
    // Write your code here
    // Defining useful variables
    let numberOfInt = 0;
    let newBArray = [];
    let primeNumbers = [2,3,5,7,9,11,13,17,19,23]
    let bPrimeSelection = [];
    let consolidateBPrimeSelection = [];
    let consolidateDivisors = [];
    let bDivisors = [];
    let bCopy = [];
    let aBCompatible = [];

    // Putting b-array in right order
    function compareNumbers(a, b) {
      return a - b;
    };
    newBArray = b.sort(compareNumbers);
    // - verifiy if newBArray works:
    //console.log(newBArray);

    // * - * - * - * - * - AUXILIAR FUNCTIONS * - * - * - * - *
    // Function to:
    // - find an array of prime factors (resultArray)
    // - of the first item (number) of an array
    // Returns: an array of all prime factors of number
    function findPrimeFactors(number, resultArray){
      for(let i=0; i<primeNumbers.length; i++) {
        if (number%primeNumbers[i] == 0){
          //console.log(number);
          resultArray.push(primeNumbers[i]);
          //console.log(i);
        }
      }
      return resultArray;
    }; // * - * - * - * - * -
    // Function to find the divisors
    // Returns: an array of all divisors
    function findDivisorsOf(number, primeArray) {
      let rest = number;
      let divisors = [number];
      let prime = 0;
      for (let k=0; k < primeArray.length; k++) {
        console.log(number, prime);
        prime = primeArray[k];
        while (rest % prime == 0) {
          rest = rest/prime;
          if (rest > 1) {
            divisors.push(rest);
          };
          console.log(`For this prime: ${prime}, will be this rest: ${rest}`);
        }
      }
      return divisors;
    } // * - * - * - * - * -
    // Function FLAT() alternative. Got it from here: https://stackoverflow.com/questions/10865025/merge-flatten-an-array-of-arrays
    function flatten(arr) {
      return arr.reduce(function (flat, toFlatten) {
        return flat.concat(Array.isArray(toFlatten) ? flatten(toFlatten) : toFlatten);
      }, []);
    }; // * - * - * - * - * -
    // Function to remove duplicates. Goit it from here: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/reduce
    function removeDup(arr) {
      let resultArray = arr.reduce(function (accumulator, currentValue) {
        if (accumulator.indexOf(currentValue) === -1) {
          accumulator.push(currentValue);
        }
        return accumulator
      }, [])
      return resultArray;
    }; // * - * - * - * - * -

    // array of factors of b-array:
    for (let item of b) {
      let bAuxiliar = [];
      bAuxiliar = findPrimeFactors(item, bAuxiliar);
      consolidateBPrimeSelection.push(bAuxiliar);
      console.log(bAuxiliar);
    };
    // console.log(consolidateBPrimeSelection);
    // bPrimeSelection = consolidateBPrimeSelection.flat(); // flat() does not work yet!
    // So we create another function 'flatten' jsut to flat the array. Calling it here:
    bPrimeSelection = flatten(consolidateBPrimeSelection);
    // console.log(bPrimeSelection); // Verify if flatten function works
    let bPSDuplicRemoved = removeDup(bPrimeSelection); // Use 'removeDub'
    //console.log(bPSDuplicRemoved); // Verify if the duplicates of bPrimeSelection are removed
    // array of divisors of b:
    for (let item of b) {
      let divAuxiliar = [];
      divAuxiliar = findDivisorsOf(item, bPSDuplicRemoved);
      consolidateDivisors.push(divAuxiliar);
      console.log(divAuxiliar); // Show the divAuxiliar array at the time
    };
    let allBDivisors = flatten(consolidateDivisors); // Flat the consolidated result of the upper for instance
    bDivisors = removeDup(allBDivisors); // Use 'removeDub'


    // Verify if all bDivisors itens are divisible by 'a' itens:
    bCopy = bDivisors;
    for (let p=0; p<a.length; p++) {
      for (let m=0; m<bDivisors.length; m++) {
        console.log(`This iteration (${p},${m}), the bDivisors item is ${bDivisors[m]} and 'a' item is ${a[p]}. So (bDivisors % a) is ${bDivisors[m]%a[p]}`);
        if ((bDivisors[m] % a[p]) != 0) {
          bCopy = bCopy.filter(item => item != bDivisors[m])
          console.log(bCopy);
          //console.log(bCopy)
        }
      }
    };

    // The result will be the restant of the bDivisors, unless 'a' = [1]
    if (a.includes(1)) {
      aBCompatible = [1];
    } else {
      aBCompatible = bCopy;
    }

    // The final output is the number of multiples that fulfill the two constrains:
    numberOfInt = aBCompatible.length;
    console.log(bPrimeSelection, bDivisors, aBCompatible);
    console.log('* - * - * - * - * - * - * end of the system * - * - * - * - * - * - *');
    return numberOfInt;
}

// Sample testing
/*
let a1 = [2,4];
let b1 = [16,32,96];
console.log(getTotalX(a1, b1));

let a2 = [3,4];
let b2 = [24,48];
console.log(getTotalX(a2, b2));

let a3 = [1];
let b3 = [100];
console.log(getTotalX(a3, b3));
*/
let a4 = [2];
let b4 = [20,30,12];
console.log(getTotalX(a4, b4));
