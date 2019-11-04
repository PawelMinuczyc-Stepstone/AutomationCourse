package pierwszyZjazd;

import java.io.IOException;

//Napisz program, który pobierze od użytkownika 3 zmienne -
// długości boków trójkąta i wypisze na ekranie jego obwód lub błąd, jeśli z
// podanych długości nie da się zbudować trójkąta
// (hint: suma dwóch dowolnych krawędzi musi być większa niż trzecia krawędź).
public class Task8 {

  private int a;
  private int b;
  private int c;

  public void formTraingle() {
    System.out.println("provide 3 sides of a triangle");
    takeInputFromUser();
    System.out.println(a + " " + b + " " + c);
    checkIfTriangleExists(a, b, c);

  }

  private void takeInputFromUser() {
    {
      try {
        a = Integer.parseInt(BufferReaderInitializer.initializeReader().readLine());
        b = Integer.parseInt(BufferReaderInitializer.initializeReader().readLine());
        c = Integer.parseInt(BufferReaderInitializer.initializeReader().readLine());
      } catch (IOException e) {
        e.printStackTrace();

      }
    }
  }

  private void checkIfTriangleExists(double a, double b, double c) {

    if (check(a, b, c) && check(b, c, a) && check(a, c, b)) {
      System.out.println("triangle can be built with sides " + a + ", " + b + ", " + c);
    } else {
      System.out.println("triangle CANNOT be built with sides " + a + ", " + b + ", " + c);

    }
  }

  private boolean check(double a, double b, double c) {

    if ((a + b) > c) {
      return true;
    } else {
      return false;
    }
  }
}
