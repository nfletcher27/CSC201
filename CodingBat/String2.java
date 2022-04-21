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

// xyzThere
public boolean xyzThere(String str) {
  
  str = " " + str;
  for(int i = 1; i < str.length()-2; i++) {
    if(str.substring(i, i+3).equals("xyz") &&
    !str.substring(i-1, i).equals("."))
    return true;
  }
  return false;
}
     
// catDog
public Boolean catDog(String str) {
  int catCount = 0;
  int dogCount = 0;
  for(int i = 0; i < str.length()-2; i++) {
    if(str.substring(i, i+3).equals("dog")) {
      dogCount++;
    } else if(str.substring(i, i+3).equals("cat")) {
      catCount++;
    } else {
      catCount += 0;
    }
  }
  
  if(catCount == dogCount) {
    return true;
  } else {
    return false;
  }
}

// 
public String repeatFront(String str, int n) {
  String ret = "";
  for(int i = n; i > 0; i--) {
    ret += str.substring(0, i);
  }
  return ret;
}

// xyBalance
public boolean xyBalance(String str) {
  if(str.contains("x") && !str.contains("y")) return false;
  if(!str.contains("x")) return true;
  int xPos = 0;
  int yPos = 0;
  for(int i = 0; i < str.length(); i++) {
    if(str.charAt(i) == 'x') xPos = i;
    if(str.charAt(i) == 'y') yPos = i;
  }
  if(yPos > xPos) return true;
  return false;
}
     
// prefixAgain
public boolean prefixAgain(String str, int n) {
  if (str.length() == 2 && str.charAt(0) == str.charAt(1)) return true;
  if (str.length() < 2) return false;
  for(int i = 1; i < str.length()-n; i++) {
    if(str.substring(0, n).equals(str.substring(i, i+n))) return true;
  }
  return false;
}

// sameStarChar
public boolean sameStarChar(String str) {
  for(int i = 0; i < str.length(); i++) {
    if(str.charAt(i) == ('*')) {
      if(i == 0 || i == str.length()-1) continue;
      if(str.charAt(i-1) != str.charAt(i+1)) return false;
    }
  }
  return true;
}
