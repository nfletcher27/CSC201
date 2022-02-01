// oneTwo
public String oneTwo(String str) {
  // recursive using the first two substrings and repeating the same thing
  if(str.length() < 3) {
     return "";
  } else {
    return str.substring(1, 3) + str.substring(0, 1) + oneTwo(str.substring(3));
  }
}
