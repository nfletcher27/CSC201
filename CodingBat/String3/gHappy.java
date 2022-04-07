// String 3 CodingBat Solutions

// gHappy (this is so bad so many edge cases I couldn't figure out ugh)
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
