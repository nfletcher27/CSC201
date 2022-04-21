// String3

// gHappy
public boolean gHappy(String str) {
  if(str.length()==0) return true;
  if(str.length() < 2) return false;
  if(str.charAt(0)==str.charAt(1) && str.charAt(0)=='g') return true;
  if(str.charAt(str.length()-1)=='g'&&str.charAt(str.length()-2)!='g') return false;
  for(int i = 0; i < str.length()-1; i++) {
    if(String.valueOf(str.charAt(i)).toLowerCase().equals("g")) {
      if(str.charAt(i-1)!='g' && str.charAt(i+1)!='g') return false;
    }
  }
  return true;
}

// maxBlock
public int maxBlock(String str) {
  int currTotal = 1;
  int maxTotal = 0;
  char currChar = '0';
 
  for(int i = 0; i < str.length()-1; i++) {
    currChar = str.charAt(i);
    if(str.charAt(i+1) == currChar) currTotal++;
    if(currTotal > maxTotal) maxTotal = currTotal;
    if(str.charAt(i+1) != currChar) {
      currTotal = 1;
    }
  }
  return maxTotal;
}
