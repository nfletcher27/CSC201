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

// frontBack
public String frontBack(String str) {
  
  if(str.length() < 2) {
    return str;
  } else {
  char start = str.charAt(0);
  char end = str.charAt(str.length()-1);
  return Character.toString(end) + str.substring(1, str.length()-1) + 
  Character.toString(start);
  }
}

// or35
public boolean or35(int n) {
  if(n % 3 == 0 || n % 5 == 0) {
    return true;
  } else {
    return false;
  }
}

// stringSplosion
public String stringSplosion(String str) {
  StringBuilder sb = new StringBuilder();
  for(int i = 0; i < str.length()+1; i++) {
    sb.append(str.substring(0, i));
  }
  return sb.toString();
}
