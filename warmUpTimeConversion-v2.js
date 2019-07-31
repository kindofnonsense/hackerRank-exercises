function timeConversion(s) {
    /*
     * Write your code here.
     */
    let newTime = [];

    if (s[8]==='P'){
      for (let i=7; i>1; i--){
        newTime[i] = s[i]
      };
      if (parseInt(s[0],10) > 0){
       switch (parseInt(s[1],10)) {
         case 1: // 11h PM = 23h
          newTime[1] = parseInt(s[1], 10) + 2;
          newTime[0] = parseInt(s[0], 10) + 1;
          break;
        case 2: // 12h PM = 12h
          newTime[1] = parseInt(s[1], 10);
          newTime[0] = parseInt(s[0], 10);
          break
        default:
          newTime[1] = parseInt(s[1], 10) + 2;
          newTime[0] = parseInt(s[0], 10) + 1;
          break
        }
      } else {
            switch (parseInt(s[1],10)) {
              case 9: // 9h PM = 21h
               newTime[1] = parseInt(s[1], 10) + 2 - 10;
               newTime[0] = 2;
               break
              case 8: // 8h PM = 20h
               newTime[1] = parseInt(s[1], 10) + 2 - 10;
               newTime[0] = 2;
               break
             default:
               newTime[1] = parseInt(s[1], 10) + 2;
               newTime[0] = parseInt(s[0], 10) + 1;
               break
          }
        }
        // Here another exception just for 12AM = 0h
      } else if ((s[8]==='A')&&(parseInt(s[1],10) === 2)&&(parseInt(s[0],10) === 1)){
            for (let i=7; i>1; i--){newTime[i] = s[i];};
              newTime[1] = 0;
              newTime[0] = 0;
      } else {
            for (let i=7; i>=0; i--){newTime[i] = s[i];};
      }

    return newTime.join('');
};
// Some tests to the code
let arr = [
'00:23:59PM','00:23:59AM',
'01:23:59PM','01:23:59AM',
'02:23:59PM','02:23:59AM',
'03:42:23PM','03:42:23AM',
'04:59:29PM','04:59:29AM',
'05:59:29PM','05:59:29AM',
'06:59:29PM','06:59:29AM',
'07:59:29PM','07:59:29AM',
'08:59:29PM','08:59:29AM',
'09:59:29PM','09:59:29AM',
'10:59:29PM','10:59:29AM',
'11:43:59AM','11:43:59PM',
'12:53:29AM','12:53:29PM',
'12:59:59AM','12:59:59PM',
'11:59:29PM','11:59:29AM']

for (let j=0; j<arr.length; j++){
  console.log(timeConversion(arr[j]));
}
