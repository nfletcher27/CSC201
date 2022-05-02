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

// missingChar
public String missingChar(String str, int n) {
  return str.substring(0, n) + str.substring(n+1);
}

// startHi
public boolean startHi(String str) {
  if(str.length() >= 2) {
    if(str.substring(0, 2).equals("hi")) {
      return true;
    } else {
      return false;
    }
  } else {
    return false;
  }
}

// has271
public boolean has271(int[] nums) {
  if(nums.length >= 3) {
    for(int i = 0; i < nums.length-1; i++) {
      if(nums[i+1] == nums[i]+5 && (Math.abs(nums[i+2] - (nums[i]-1)) <= 2)) return true;
    }
    return false;
  }
  return false;
}
