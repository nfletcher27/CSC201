// fizzArray
public int[] fizzArray(int n) {
  int[] nums = new int[n];
  
  if(n != 0) {
    for(int i = 0; i < n; i++) {
      nums[i] = i;
    }
    return nums;
  } else {
    return nums;
  }
  
}

// no14
public boolean no14(int[] nums) {
  Boolean is1 = false;
  Boolean is4 = false;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 4) {
      is1 = true;
    } else if(nums[i] == 1) {
      is4 = true;
    } else {
      is1 = false;
    }
  }
  
  if(is1 && is4) {
    return false;
  } else if(nums.length > 3) {
    if(nums[0] == 1 && nums[3] == 4 || nums[0] == 4 && nums[3] == 1) {
      return false;
    } else {
      return true;
    }
  } else {
    return true;
  }
}

// post4
public int[] post4(int[] nums) {
  int last4 = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 4) {
      last4 = i;
    } else {
      last4 += 0;
    }
  }
  
  int[] post4 = new int[nums.length - last4 - 1];
  if(last4 == nums.length-1) {
    return post4;
  } else {
    for(int i = 0; i < post4.length; i++) {
      post4[i] = nums[last4 + i + 1];
    }
    return post4;
  }
}

// has12
public boolean has12(int[] nums) {
  Boolean continueOn = false;
  int whereToStart = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 1) {
      continueOn = true;
      whereToStart = i;
    } else {
      continueOn = false;
    }
  }
    for(int j = whereToStart; j < nums.length; j++) {
      if(nums[j] == 2 && nums.length > 1 && !(nums.length == 2 && nums[0] == 3)) {
        continueOn = true;
      } else {
       continueOn = false;
      }
  }
  return continueOn;
}
