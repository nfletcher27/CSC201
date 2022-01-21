// monkeytrouble
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if(aSmile==true&&bSmile==true || aSmile==false&&bSmile==false) {
    return true;
  } else {
    return false;
  }
}

// parrotTrouble
public boolean parrotTrouble(boolean talking, int hour) {
  if(hour < 7 || hour > 20) {
    if(talking == true) {
      return true;
    } else {
      return false;
    }
  } else {
    return false;
  }
}

//posNeg
public boolean posNeg(int a, int b, boolean negative) {
  if(negative==false) {
    if(a < 0 && b > 0 || b < 0 && a > 0) {
      return true;
    } else {
      return false;
    }
  } else if(a < 0 && b < 0) {
    return true;
  } else {
    return false;
  }
}

//Stringtimes
public String stringTimes(String str, int n) {
 switch(n) {
   case 0:
     return "";
   case 1:
     return str;
   case 2:
     return str+str;
   case 3:
     return str+str+str;
   case 4:
     return str+str+str+str;
   case 5:
     return str+str+str+str+str;
   default:
   return str;
 }
}
