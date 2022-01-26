// sum2
public int sum2(int[] nums) {
  if(nums.length < 2) {
    if(nums.length < 1) {
      return 0;
    } else {
    return nums[0];
    }
  } else {
    return nums[0] + nums[1];
  }
}

// makePi
public int[] makePi() {
  int[] pi = {3, 1, 4};
  return pi;
}

// reverse3
public int[] reverse3(int[] nums) {
  int first = nums[0];
  int middle = nums[1];
  int last = nums[2];
  nums[0] = last;
  nums[1] = middle;
  nums[2] = first;
  return nums;
}

// commonEnd
public boolean commonEnd(int[] a, int[] b) {
  if(a[0] == b[0] || a[a.length-1] == b[b.length-1]) {
    return true;
  } else {
    return false;
  }
}

// firstLast6
public boolean firstLast6(int[] nums) {
  if(nums[0] == 6 || nums[nums.length-1] == 6) {
    return true;
  } else {
    return false;
  }
}

// has23
public boolean has23(int[] nums) {
  if(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
    return true;
  } else {
    return false;
  }
}
