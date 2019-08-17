// Complete the dayOfProgrammer function below.
function dayOfProgrammer(year) {
  // Variables:
  let firstEightMonths = 31+28+31+30+31+30+31+31;
  let programmerDay = 256;
  //console.log(`year % 4 = ${year%4}, year % 100 = ${year%100} and year % 400 = ${year%400}`);

  // Verify if its a leap year:
  if ((year % 4 == 0) & (year % 100 != 0)) {
    console.log(`First condition applied: year % 4 = ${year%4} and year % 100 = ${year%100}`);
    firstEightMonths += 1;  // The leap year adds one day to the count.
  } else if (year % 400 == 0) {
    firstEightMonths += 1
    console.log('Second condition applied');
  }

  // Determine day and month
  let resultDay = programmerDay - firstEightMonths;
  let resultMonth = '09';
  let resultDate = `${resultDay}.${resultMonth}.${year}`;

  return resultDate
};
// TEST SAMPLES:
/*
// Exemple 1984
let year0 = 1984;
console.log(dayOfProgrammer(year0));

// Sample Input 0
let year1 = 2017;
console.log(dayOfProgrammer(year1));

// Sample Input 1
let year2 = 2016;
console.log(dayOfProgrammer(year2));

// Sample Input 2
let year3 = 1800;
console.log(dayOfProgrammer(year3));

// Sample Input 52
let year4 = 2100;
console.log(dayOfProgrammer(year4));
*/
// Sample Input 48
let year5 = 1700;
console.log(dayOfProgrammer(year5));
