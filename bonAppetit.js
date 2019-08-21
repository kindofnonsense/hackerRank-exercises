// Complete the bonAppetit function below.
function bonAppetit(bill, k, b) {
  // Declaring variables:
  let overcharge = 0;
  let sum = 0;

  // Sum of all 'bill' elements minus k:
  for (let item in bill) {
    if (item != k) {
      sum += bill[item];
      // console.log(`Item = ${item}, bill[k] = ${bill[k]} and sum = ${sum}`);
    };
  }
  // The real value of the splitted bill:
  let splittedBill = sum / 2;

  // Must return 'bon appetit' if the bill was splitted correctly
  if (splittedBill == b) {
    console.log('Bon Appetit');
  } else {
    overcharge = b - splittedBill;
    console.log(overcharge);
  };
}
// TEST SAMPLES:
// Exemple Input 0:
let bill0 = [2,4,6];
let k0 = 2;
let b0 = 6;
bonAppetit(bill0, k0, b0);

// Sample Input 0:
let bill1 = [3,10,2,9];
let k1 = 1;
let b1 = 12;
bonAppetit(bill1, k1, b1);

// Sample Input 1:
let bill2 = [3,10,2,9];
let k2 = 1;
let b2 = 7;
bonAppetit(bill2, k2, b2);
