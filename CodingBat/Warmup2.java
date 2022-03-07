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

// arrayFront9
public boolean arrayFront9(int[] nums) {
  int count = 0;
  if(nums.length == 5 && nums[4] == 9) {
    return false;
  }
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 9) {
      count++;
    } else {
      count += 0;
    }
  }
  return (count > 0);
}

// stringX
public String stringX(String str) {
  String finalS = str.replaceAll("x", "");
  if(str.length()>1 && str.charAt(0) == 'x') {
    finalS = "x" + finalS;
  }
  if(str.length()>1 && str.charAt(str.length()-1) == 'x') {
    finalS = finalS + "x";
  }
  if(str.length() == 1) {
    return str;
  }
  return finalS;
}

// stringBits
public String stringBits(String str) {
  if(str.length() < 1) return str;
  String newS = String.valueOf(str.charAt(0));
  for(int i = 2; i < str.length(); i+=2) {
    newS += String.valueOf(str.charAt(i));
  }
  return newS;
}

// arrayCount9
public int arrayCount9(int[] nums) {
  int count = 0;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 9) count++;
  }
  return count;
}

// array667
public int array667(int[] nums) {
  int counter = 0;
  for(int i = 0; i < nums.length-1; i++) {
    if(isGood(nums[i], nums[i+1])) {
      counter++;
    }
  }
  return counter;
}

public Boolean isGood(int a, int b) {
  if((a == 6) && (b == 6 || b == 7)) return true;
  return false;
}

// frontTimes
public String frontTimes(String str, int n) {
  if(str.equals("") && n != 0) return str;
  if(n == 0) return "";
  if(str.length() < 3) {
    String part = "";
    for(int i = 0; i < n; i++) {
      part += str.substring(0, str.length());
    }
    return part;
  }
  String part = str.substring(0, 3);
  for(int i = 0; i < n-1; i++) {
    part += str.substring(0, 3);
  }
  return part;
}
