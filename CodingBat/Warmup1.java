// Sleepin
public boolean sleepIn(boolean weekday, boolean vacation) {
  
 if(weekday == false || vacation == true) {
   return true;
 } else {
   return false;
 }
}

// Diff21
public int diff21(int n) {
  
  if(n > 21) {
    return Math.abs((n-21)*2);
  } else {
    return Math.abs(n-21);
  }
}

// backAround
public String backAround(String str) {
  return str.substring(str.length()-1, str.length()) + str +
  str.substring(str.length()-1, str.length());
}

// hasTeen
public boolean hasTeen(int a, int b, int c) {
  if((a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20)) {
    return true;
  } else {
    return false;
  }
}

// mixStart
public boolean mixStart(String str) {
  if(str.contains("ix")) {
    return true;
  } else {
    return false;
  }
}

// endUp
public String endUp(String str) {
  if(str.length() < 3) {
    return str.toUpperCase();
  } else {
    return str.substring(0, str.length()-3) + 
    str.substring(str.length()-3, str.length()).toUpperCase();
  }
}

// warmup1
public int close10(int a, int b) {
  if(a == b || Math.abs(a-10) == Math.abs(b-10)) {
    return 0;
  } else if(Math.abs(a-10) > Math.abs(b-10)) {
    return b;
  } else {
    return a;
  }
}
