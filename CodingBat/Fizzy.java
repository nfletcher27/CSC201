// fizzString
public String fizzString(String str) {
  if(str.startsWith("f") && str.endsWith("b")) {
    return "FizzBuzz";
  } else if(str.startsWith("f")) {
    return "Fizz";
  } else if(str.endsWith("b")) {
    return "Buzz";
  } else {
    return str;
  }
}

// fizzString2
public String fizzString2(int n) {
  if(n % 3 == 0 && n % 5 == 0) {
    return "FizzBuzz!";
  } else if(n % 3 == 0 && n % 5 != 0) {
    return "Fizz!";
  } else if (n % 3 != 0 && n % 5 == 0) {
    return "Buzz!";
  } else {
    return n + "!";
  }
}

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
