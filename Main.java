import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //problem 1
    String sentence = "peter piper picked a pack of pickle peppers purposefully put in a plain pair";
    int  count = 0;
    for (int i = 0; i < sentence.length()-1; i++) {
      String pair = sentence.substring(i, i + 2);
      if (pair.equals("pa") || pair.equals("pe") || pair.equals("pi") || pair.equals("po") || pair.equals("pu")) {
        count++;
      }
    }
    System.out.println(count);

    //problem 2
    String sentence2 = "Omae wa Baka lol lol hahaha";
    String lowersentence2 = sentence2.toLowerCase();
    String replace = "";

    for (int i = 0; i < lowersentence2.length(); i++) {
      String letter = lowersentence2.substring(i, i + 1);
      if (letter.equals("o") || letter.equals("e") || letter.equals("t") || letter.equals("a") || letter.equals("i")) {
        
      } else 
      replace += letter;
    }
    System.out.println(replace);


    //problem 3

    String s1 = "balloon";
    String s2 = "atrophy";
    String output = "";

    if (s1.length() == s2.length()) {
      for (int i = s2.length() - 1; i >= 0; i--) {
        String L1 = s1.substring(i, i+1);
        String L2 = s2.substring(i, i+1);
        output += (L2 + L1);
      }
    }
  }

  
}
