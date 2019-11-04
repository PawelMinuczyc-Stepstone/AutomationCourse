import java.io.IOException;
import java.util.stream.IntStream;

public class Task6 {

  //2
  //Napisz program, który sprawdzi, czy wprowadzony tekst jest palindromem.
  // Spacje na początku i na końcu tekstu powinny być zignorwane.

  String text;

  public void checkifMyStringisAPalindrome() {
    System.out.println("provide a palindrome and i will check it");
    {
      try {
        text = BufferReaderInitializer.initializeReader().readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }

      if (isPalindromeUsingIntStream(text) == true) {
        System.out.println("text is a palindrome");
      } else {
        System.out.println("text is not a palindrome");
      }
    }
  }


  public boolean isPalindromeUsingIntStream(String text) {
    String temp = text.replaceAll("\\s+", "").toLowerCase();
    return IntStream.range(0, temp.length() / 2)
        .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
  }

}
