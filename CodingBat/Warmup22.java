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

// last2
public int last2(String str) {
  if(str.length() < 2) return 0;
  String st = str.substring(str.length()-2, str.length());
  int counter = 0;
  for(int i = 0; i < str.length()-1; i++) {
    if(str.substring(i, i+2).equals(st)) counter++;
  }
  if(counter < 1) return 0;
  return counter-1;
}
