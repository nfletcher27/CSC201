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
