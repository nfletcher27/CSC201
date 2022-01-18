// Sleepin
public boolean sleepIn(boolean weekday, boolean vacation) {
  
 if(weekday == false || vacation == true) {
   return true;
 } else {
   return false;
 }
}

// Diff21
public int diff21(int n) {
  
  if(n > 21) {
    return Math.abs((n-21)*2);
  } else {
    return Math.abs(n-21);
  }
}
