// Complete the angryProfessor function below.
function angryProfessor(k, a) {

  const onTime = a.reduce((count, item) => {return item <= 0 ? count+=1 : count}, 0);
  console.log(`Students on time: ${onTime}`);
  return onTime >= k ? "NO" : "YES";
}

console.log(angryProfessor(3, [-1,-3,4,3]));
console.log(angryProfessor(2, [0,-1,2,1]));
console.log(angryProfessor(5, [0,-1,2,1,10,-2,-3,12,-14,-2,-5,12,15,2,5]));
