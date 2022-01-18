// CaughtSpeeding
public int caughtSpeeding(int speed, boolean isBirthday) {
  
  while(isBirthday) {
    if(speed <= 65) {
    return 0;
  } else if(speed > 65 && speed < 86) {
    return 1;
  } else {
    return 2;
  }
  }
  
  if(speed <= 60) {
    return 0;
  } else if(speed > 60 && speed < 81) {
    return 1;
  } else {
    return 2;
  }
  
}

// CigarParty
public boolean cigarParty(int cigars, boolean isWeekend) {
  
  while(isWeekend) {
        if(cigars >= 40) {
          return true;
        } else {
          return false;
        }
  }
  
  if(cigars >= 40 && cigars <= 60) {
    return true;
  } else {
    return false;
  }
}

// Front3
public String front3(String str) {
  
  if(str.length() < 3) {
    return str + str + str;
  } else {
    return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
  }
}

// MakeoutWord
public String makeOutWord(String out, String word) {
  String start = out.substring(0, 2);
  String end = out.substring(2, 4);
  String complete = start+word+end;
  return complete;
}
