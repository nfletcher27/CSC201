// doubleX
boolean doubleX(String str) {
  if(str.contains("x") && str.length() > 1) {
    int pos = str.indexOf("x");
    if(str.length() > pos+1) {
      if(str.charAt(pos+1) == 'x') {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  } else {
    return false;
  }
}

// countXX
int countXX(String str) {
  int xxCount = 0;
  for(int i = 0; i < str.length()-1; i++) {
    if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x') {
      xxCount++;
    } else {
      xxCount += 0;
    }
  }
  return xxCount;
}
