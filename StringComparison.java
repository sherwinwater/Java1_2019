public class StringComparison {
  public static void main(String[] args) {

    System.out.println("***** compareTo *****");
    System.out.println("apple".compareTo("applE"));
    System.out.println("A".compareTo("a"));
    System.out.println("a".compareTo(" "));

    System.out.println("***** isDigit *****");
    System.out.println(Character.isDigit('a'));
    System.out.println(Character.isDigit('5'));
    System.out.println(Character.isDigit(' '));

    System.out.println("***** isLetter *****");
    System.out.println(Character.isLetter('a'));
    System.out.println(Character.isLetter('5'));
    System.out.println(Character.isLetter(' '));

    System.out.println("***** isLetterOrDigit *****");
    System.out.println(Character.isLetterOrDigit('a'));
    System.out.println(Character.isLetterOrDigit('5'));
    System.out.println(Character.isLetterOrDigit(' '));

    System.out.println("***** isSpaceChar *****");
    System.out.println(Character.isSpaceChar('a'));
    System.out.println(Character.isSpaceChar('5'));
    System.out.println(Character.isSpaceChar(' '));
    System.out.println(Character.isSpaceChar('\n'));
    System.out.println(Character.isSpaceChar('\t'));

    System.out.println("***** isWhitespace *****");
    System.out.println(Character.isWhitespace('c'));
    System.out.println(Character.isWhitespace(' '));
    System.out.println(Character.isWhitespace('\n'));
    System.out.println(Character.isWhitespace('\t'));

    //eliminates leading and trailing space
    System.out.println("***** trim() *****");
    String s = " apple      banana  ";
    System.out.println(s.trim());
    s = " orange is the new";
    System.out.println(s.trim());

    System.out.println("***** replace() *****");
    s = "Java is a lot of fun";
    System.out.println(s.replace('o', '*'));
    System.out.println(s.replace('a', '-'));

    System.out.println("***** replaceAll() *****");
    s = "Java is a lot of fun";
    System.out.println(s.replaceAll("o", "*"));
    System.out.println(s.replaceAll("a", "-"));

    System.out.println("***** matches *****");
    System.out.println("abc".matches("ab(.*)"));
    System.out.println("a".matches("A"));
    System.out.println("a".matches("a"));

    System.out.println("***** indexOf *****");//first index of
    s = "Java is a lot of fun";
    System.out.println(s.indexOf("a"));
    System.out.println(s.indexOf("A"));
    System.out.println(s.indexOf(" "));

    System.out.println("***** lastIndexOf *****");//last index
    s = "Java is a lot of fun";
    System.out.println(s.lastIndexOf("a"));
    System.out.println(s.lastIndexOf("A"));//-1
    System.out.println(s.lastIndexOf(" "));

    System.out.println("***** split *****");
    for(String i : s.split(" "))
    System.out.println(i);

    System.out.println("***** String Array *****");
    char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
    String helloString = new String(helloArray);
    System.out.println(helloString);

    // transfer string to char
    String ss = "hello world!";
    char[] c = new char[ss.length()];
    for (int i = 0; i < ss.length(); ++i){
      c[i] = ss.charAt(i);
    }
    for (char i : c){
      System.out.print(i);
    }
  }
}
