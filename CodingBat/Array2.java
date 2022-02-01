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
