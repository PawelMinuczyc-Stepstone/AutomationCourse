package pierwszyZjazd;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

  //#1
//Napisz program, w którym użytkownik wprowadzi hasło, a następnie, jeśli hasło składa się
// z co najmniej 7 znaków i znaku specjalnego, zostanie wypisane od tyłu.
  StringBuilder stringBuilder = new StringBuilder();

  public boolean containsSpecialCharacter(String s) {
    return (s == null) ? false : s.matches("[^A-Za-z0-9 ]");
  }

  public void reversePassword() {

    System.out
        .println("Provide password. It must contain special "
                 + "sign and must be longer than 7 chars");

    String password = null;
    try {
      password = BufferReaderInitializer.initializeReader().readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }

    Pattern pattern = Pattern.compile("[^A-Za-z0-9 ]");
    Matcher matcher = pattern.matcher(password);
    boolean hasSpecialChars = matcher.find();

    if (password.length() >= 7 && hasSpecialChars == true) {
      String reversedPass = stringBuilder.append(password).reverse().toString();
      System.out.println("podaje haslo od tylu");
      System.out.println(reversedPass);
    } else {
      System.out.println("haslo nie posiada wymaganej dlugosci "
                         + "lub nie posiada znaku specjalnego");
    }
  }

}

