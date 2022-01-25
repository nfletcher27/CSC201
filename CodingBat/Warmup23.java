// NearAHundred
public boolean nearHundred(int n) {
  if(n > 0) {
    if(Math.abs(n) > 189 && Math.abs(n) < 211) {
      return true;
    } else if(Math.abs(n) > 89 && Math.abs(n) < 111) {
      return true;
    } else {
      return false;
    }
  } else {
    return false;
  }
}
