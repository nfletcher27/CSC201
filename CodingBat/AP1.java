// scoresSpecial
public int scoresSpecial(int[] a, int[] b) {
  return findBiggest(a) + findBiggest(b);
}

// findBiggest
public int findBiggest(int[] n) {
  int biggest = 0;
  for(int i = 0; i < n.length; i++) {
    if(n[i] > biggest && n[i] % 10 == 0) {
      biggest = n[i];
    }
  }
  return biggest;
}
  
// scoresIncreasing
public boolean scoresIncreasing(int[] scores) {
  for(int i = 0; i < scores.length-1; i++) {
    if(scores[i+1] < scores[i]) return false;
  }
  return true;
}

// scoresClump
public boolean scoresClump(int[] scores) {
  for(int i = 0; i < scores.length-2; i++) {
    if(Math.abs(scores[i]-(scores[i+1])) <= 2 && Math.abs(scores[i]-(scores[i+2]))
    <= 2 && Math.abs((scores[i+1])-(scores[i+2])) <= 2) {
      return true;
    }
  }
  return false;
}
