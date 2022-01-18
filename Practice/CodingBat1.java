// Sumdouble
public int sumDouble(int a, int b) {
  if(a == b) {
    return (a+b)*2;
  } else  {
    return a+b;
  }
}

// Make10
public boolean makes10(int a, int b) {
  
  if(a == 10 || b == 10) {
    return true;
  } else if(a + b == 10) {
    return true;
  } else {
    return false;
  }
}

// notString
public String notString(String str) {
  
  		  if(str.length() >= 3) {
  		    String subst = str.substring(0, 3);
		        if(!subst.equals("not")) {
		        return "not" + " " + str;
		      } else {
		        return str;
		      }
		     
	  }
		  else {
		        return "not" + " " + str; 
  }
}
