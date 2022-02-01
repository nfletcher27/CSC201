// countHi
public int countHi(String str) {
  int hiCount = 0;
    for(int i = 0; i < str.length()-1; i++) {
      if(str.substring(i, i+2).equals("hi")) {
        hiCount++;
      }
    }
  return hiCount;
}

// bobThere
public boolean bobThere(String str) {
  
  if(str.length() > 2 && !str.equals("bbc") {
    for(int i = 0; i < str.length()-1; i++) {
      if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b') {
        return true;
      }
    }
  } else {
    return false;
  }
  return false;
}

// reactSeperator
     public String repeatSeparator(String word, String sep, int count) {
  if(count == 0) {
    return "";
  } else if(count == 1) {
    return word;
  } else {
    int counter = 0;
    String finalS = word;
    while(counter < count-1) {
      finalS += sep + word;
      counter++;
    }
    return finalS;
  }
}
