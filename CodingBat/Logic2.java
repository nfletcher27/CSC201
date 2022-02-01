// LoneSum
public int loneSum(int a, int b, int c) {
  if(a == b && b == c) {
    return 0;
  } else if(a == b) {
    return c;
  } else if(b == c) {
    return a;
  } else if(a ==c) {
    return b;
  } else {
    return a + b + c;
  }
}

// luckySum
public int luckySum(int a, int b, int c) {
  if(a == 13) {
    return 0;
  } else if(b == 13) {
    return a;
  } else if(c == 13) {
    return a + b;
  } else {
    return a + b + c;
  }
}

// FixTeen
public int noTeenSum(int a, int b, int c) {
  return fixTeen(a) + fixTeen(b) + fixTeen(c);
}
public int fixTeen(int n) {
  if(n==13 || n==14 || n==17 || n==18 || n==19) {
    return 0;
  } else {
    return n;
  }
}

// blackJack
public int blackjack(int a, int b) {
  if(a > 21 && b > 21) {
    return 0;
  } else if (a > 21 || b > 21) {
    if(a > 21) {
      return b;
    } else {
      return a;
    }
  } else if (a > b) {
    return a;
  } else {
    return b;
  }
}

// roundSum
public int roundSum(int a, int b, int c) {
  return round10(a) + round10(b) + round10(c);
}
public int round10(int num) {
  if(num < 5) {
    return 0;
  } else if(num > 4 && num < 15) {
    return 10;
  } else if(num > 14 && num < 25) {
    return 20;
  } else if(num > 24 && num < 35) {
    return 30;
  } else if(num > 34 && num < 45) {
    return 40;
  } else {
    return 50;
  }
}
  
// makeBricks
public boolean makeBricks(int small, int big, int goal) {
  
  if(goal > big*5 + small) {
    return false;
  } else if(goal % 5 > small) {
    return false;
  } else {
    return true;
  }
  
}

