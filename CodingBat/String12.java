// makeAbba
public String makeAbba(String a, String b) {
  return a+b+b+a;
}

// extraEnd
public String extraEnd(String str) {
  return str.substring(str.length()-2, str.length()) +
  str.substring(str.length()-2, str.length()) +
  str.substring(str.length()-2, str.length());
}

// makeTags
public String makeTags(String tag, String word) {
  return "<"+tag+">" + word + "</"+tag+">";
}

// firstTwo
public String firstTwo(String str) {
  if(str.length() > 2) {
    return str.substring(0, 2);
  } else {
    return str;
  }
}

// withoutEnd
public String withoutEnd(String str) {
  return str.substring(1, str.length()-1);
}

// withoutX2
public String withoutX2(String str) {
  if(str.length() > 2) {
    if(str.substring(0, 2).contains("x")) {
      return str.substring(0, 2).replace("x", "") + str.substring(2, str.length());
    } else {
      return str;
    }
  } else {
    return str.replace("x", "");
  }
}

// doubleChar
public String doubleChar(String str) {
  
  int total = str.length();
  char chr;
  StringBuilder finalS = new StringBuilder(total*2);
  for(int i = 0; i < total; i++) {
    chr = str.charAt(i);
    finalS.append(chr);
    finalS.append(chr);
  }
  return finalS.toString();
}
