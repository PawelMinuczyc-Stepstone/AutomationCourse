package pierwszyZjazd;

public class Task4 {

  //#4
//Wygeneruj pseudolosową liczbę całkowitą z przedziału <-10; 10> oraz zmiennoprzecinkową z przedziału (0; 1>. Wyświetl następujący wynik:
//a =
//b =
//a + b =
//a - b =
//a * b =
//a / b =
//pierwiastek(a) =
//pierwiastek(b) =
//
//Do wyliczenia pierwiastka skorzystaj z funkcji Math.sqrt()

  public int randomInteger(int minimum, int maximum) {
    int randomInteger = minimum + Double.valueOf(Math.random() * (maximum - minimum)).intValue();

    return randomInteger;
  }

  public void computeSomething(int a, int b) {

    System.out.println("a " + a);
    System.out.println("b " + b);
    System.out.println("a+b = " + (a + b));
    System.out.println("a-b =" + (a - b));
    System.out.println("a*b =" + (a * b));
    System.out.println("a/b =" + (a / b));
    System.out.println("pierwiastek(a) " + Math.sqrt(a));
    System.out.println("pierwiastek(b " + Math.sqrt(b));
  }

}

