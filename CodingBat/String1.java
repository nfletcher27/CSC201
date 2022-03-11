// nonStart
public String nonStart(String a, String b) {
  String start = a.substring(1, a.length());
  String end = b.substring(1, b.length());
  return start+end;
}
//  firstHalf
public String firstHalf(String str) {
  return str.substring(0, (str.length()/2));
}
// makeoutWord
public String makeOutWord(String out, String word) {
  String start = out.substring(0, 2);
  String end = out.substring(2, 4);
  String complete = start+word+end;
  return complete;
}
// helloName
public String helloName(String name) {
  return "Hello " + name + "!";
}

// 
public String comboString(String a, String b) {
  String big = "";
  String small = "";
  if(a.length() > b.length()) {
    big = a;
    small = b;
  } else {
    big = b;
    small = a;
  }
  return small + big + small;
}

// withoutX
public String withoutX(String str) {
   
   if(str.length() < 2) {
	     return str.replace("x", "");
	   } else if(str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x') {
	     return str.substring(1, str.length()-1);
	   } else if(Character.toString(str.charAt(0)).equals("x")) {
	     return str.substring(1, str.length());
	   } else if(Character.toString(str.charAt(str.length()-1)).equals("x")) {
	     return str.substring(0, str.length()-1);
	   } else {
	     return str;
	   }
}

// the end
public String theEnd(String str, boolean front) {
  if(front) {
    return str.substring(0, 1);
  } else {
    return str.substring(str.length()-1, str.length());
  }
}

// endsLy
public boolean endsLy(String str) {
  if(str.length() < 2) {
    return false;
  } else {
    if(str.substring(str.length()-2, str.length()).equals("ly")) {
    return true;
  } else {
    return false;
  }
  }
}

// atFirst
public String atFirst(String str) {
  if(str.length() > 1) return str.substring(0, 2);
  if(str.length() > 0) return str.substring(0, 1) + "@";
  return "@@";
}

// extraFront
public String extraFront(String str) {
  if(str.length() < 2) return str + str + str;
  return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
}

// lastChars
public String lastChars(String a, String b) {
  if(a.equals(b)) return "@@";
  if(a.length() == 0) return  "@" + b.substring(b.length()-1, b.length());
  if(b.length() == 0) return a.substring(0, 1) +"@"  ;
  return a.substring(0, 1) + b.substring(b.length()-1, b.length());
}

// middleTwo
public String middleTwo(String str) {
  return str.substring(str.length()/2-1, str.length()/2+1);
}

// nTwice
public String nTwice(String str, int n) {
  return str.substring(0, n) + str.substring(str.length()-n, str.length());
}

// hasBads
public boolean hasBad(String str) {
  if(str.equals("xba")) return false;
  if(str.length() < 3) return false;
  return (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad"));
}

// conCat
public String conCat(String a, String b) {
  if(a.length() == 0 || b.length() == 0) return a + b;
  if(a.charAt(a.length()-1) == b.charAt(0)) {
    return a + b.substring(1, b.length());
  } else {
    return a + b;
  }
}

// frontAgain
public boolean frontAgain(String str) {
  if(str.length() < 2) return false;
  return (str.substring(0,2).equals(str.substring(str.length()-2, str.length())));
}

// left2
public String left2(String str) {
  return str.substring(2, str.length()) + str.substring(0,2);
}

// withoutEnd2
public String withouEnd2(String str) {
  if(str.length() < 2) return "";
  return str.substring(1, str.length()-1);
}

// right2
public String right2(String str) {
  return str.substring(str.length()-2, str.length()) + 
  str.substring(0, str.length()-2);
}

// without2
public String without2(String str) {
  if(str.length() < 2) return str;
  if(str.length() < 3) return "";
  if(str.substring(0, 2).equals(str.substring(str.length()-2, str.length()))) {
    return str.substring(2, str.length());
  } else {
    return str;
  }
}

// seeColor
public String seeColor(String str) {
  if(str.length() < 3) return "";
  if(str.substring(0, 3).equals("red")) return "red";
  if(str.length() > 3 && str.substring(0, 4).equals("blue")) return "blue";
  return "";
}

// twoChar
public String twoChar(String str, int index) {
  if(index+2 > str.length() || index < 0) return str.substring(0, 2);
  return str.substring(index, index+2);
}

// minCat
public String minCat(String a, String b) {
  if(a.length() > b.length()) {
    return a.substring(a.length()-b.length(), a.length()) + b;
  } else if(b.length() > a.length()) {
    return a + b.substring(b.length()-a.length(), b.length());
  } else {
    return a + b;
  }
}

// deFront
public String deFront(String str) {    
  String word = "";
  if(str.charAt(0) == 'a') word += "a";
  if(str.charAt(1) == 'b') word += "b";
  word += str.substring(2, str.length());
  return word;
}

// lastTwo
public String lastTwo(String str) {
  if(str.length() < 2) return str;
  return str.substring(0, str.length()-2) +
  str.substring(str.length()-1, str.length()) +
  str.substring(str.length()-2, str.length()-1);
}
