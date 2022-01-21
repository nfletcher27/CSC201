// nonStart
public String nonStart(String a, String b) {
  String start = a.substring(1, a.length());
  String end = b.substring(1, b.length());
  return start+end;
}
//  firstHalf
public String firstHalf(String str) {
  return str.substring(0, (str.length()/2));
}
// makeoutWord
public String makeOutWord(String out, String word) {
  String start = out.substring(0, 2);
  String end = out.substring(2, 4);
  String complete = start+word+end;
  return complete;
}
// helloName
public String helloName(String name) {
  return "Hello " + name + "!";
}
