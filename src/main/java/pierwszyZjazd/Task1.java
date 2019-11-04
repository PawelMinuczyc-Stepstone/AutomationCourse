package pierwszyZjazd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//#1
//Napisz program, który przyjmie od użytkownika ciąg znaków i wyświetli następujący wynik:

public class Task1 {

  public void writeFirtsAndLastChars() {

    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    System.out
        .println("provide at least 3 characters. I will output firs three and last three chars");

    String s = null;

    try {
      s = bufferedReader.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }

    if (s.length() >= 3) {
      String first3 = s.substring(0, 3);

      String last3;
      if (s == null || s.length() < 3) {
        last3 = s;
      } else {
        last3 = s.substring(s.length() - 3);
      }

      System.out.println(first3 + " " + last3);
    } else if (s.length() < 3) {
      System.out.println("you must provide at least 3 characters");
    }
  }
}
