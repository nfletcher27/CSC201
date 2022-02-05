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
