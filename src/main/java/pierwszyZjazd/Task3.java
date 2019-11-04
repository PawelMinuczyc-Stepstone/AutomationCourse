package pierwszyZjazd;

public class Task3 {

  //#3
//Program przyjmuje liczbę zmiennoprzecinkową, wylicza jej kwadrat i wyświetla wynik zaokrąglony do liczby całkowitej.
  int outcome = 0;

  public double computeSquareOfANumber(double numberToCompute) {
    outcome = (int) Math.pow(numberToCompute, numberToCompute);
    return outcome;
  }


}
