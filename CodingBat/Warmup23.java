// NearAHundred
public boolean nearHundred(int n) {
  if(n > 0) {
    if(Math.abs(n) > 189 && Math.abs(n) < 211) {
      return true;
    } else if(Math.abs(n) > 89 && Math.abs(n) < 111) {
      return true;
    } else {
      return false;
    }
  } else {
    return false;
  }
}

// missingChar
public String missingChar(String str, int n) {
  return str.substring(0, n) + str.substring(n+1);
}

// startHi
public boolean startHi(String str) {
  if(str.length() >= 2) {
    if(str.substring(0, 2).equals("hi")) {
      return true;
    } else {
      return false;
    }
  } else {
    return false;
  }
}
