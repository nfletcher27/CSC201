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

// wordsCount
public int wordsCount(String[] words, int len) {
  int counter = 0;
  for(int i = 0; i < words.length; i++) {
    if(words[i].toString().length() == len) counter++;
  }
  return counter;
}

// wordsWithout
public String[] wordsWithout(String[] words, String target) {
  int counter = 0;
  for(int i = 0; i < words.length; i++) {
    if(words[i].equals(target)) counter++;
  }
  ArrayList<String> without = new ArrayList<String>();
  for(int i = 0; i < words.length; i++) {
    if(!words[i].equals(target)) without.add(words[i]);
  }
  return without.toArray(new String[words.length-counter]);
}

// matchUp
public int matchUp(String[] a, String[] b) {
  int count = 0;
  for(int i = 0; i < a.length; i++) {
    if(!a[i].equals("") && !b[i].equals("") && a[i].charAt(0) == b[i].charAt(0)) count++;
  }
  return count;
}

// wordsWithoutList
public List wordsWithoutList(String[] words, int len) {
  ArrayList<String> without = new ArrayList<String>();
  for(int i = 0; i < words.length; i++) {
    if(words[i].length() != len) without.add(words[i]);
  }
  return without;
}
