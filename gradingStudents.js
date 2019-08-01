/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

function gradingStudents(grades) {
    // Write your code here
    var INTEGER_ARRAY = [];
    grades.forEach(grade => { // For every grades do that:
      if (grade >= 38) {let dezena = Math.round(grade/10);
      console.log('This is dezena: ',dezena);
      let md = 10*dezena;
      console.log('This is md: ',md);
      let up = (20*dezena + 10)/2;
      console.log('This is up: ',up);
      let lb = (20*dezena - 10)/2;
      console.log('This is lb: ',lb);
      if ((md - grade) > 0 && (md - grade) < 3) {
        INTEGER_ARRAY.push(md);
        console.log('The grade ',grade,'was an MD CASE and rounded to: ',md);
      } else if ((up - grade) > 0 && (up - grade) < 3) {
        INTEGER_ARRAY.push(up);
        console.log('The grade',grade,'was an UP CASE and rounded to: ',up);
      } else if ((lb - grade) > 0 && (lb - grade) < 3) {
        INTEGER_ARRAY.push(grade);
        console.log('The grade',grade,'was an LB CASE and rounded to: ',lb);
      } else {
        INTEGER_ARRAY.push(grade);
        console.log('The grade ',grade,'was not modified.');
      }} else {
        INTEGER_ARRAY.push(grade);
        console.log('The grade ',grade,'is below 38, then it was not modified.');
      }
    });
    return INTEGER_ARRAY;
}

// Testing samples:
var grades = [75, 67, 38, 33];
console.log(gradingStudents(grades));
