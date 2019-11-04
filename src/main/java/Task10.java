import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Napisz kalkulator, który wyświetli menu:
//
//1. dodawanie
//2. odejmowanie
//3. mnozenie
//4. dzielenie
//5. potegowanie
//
//Po wyborze liczby poprosi o dwie liczby i zwroci wynik. Upewnij sie, ze uzyles odpowiedniego typu danych.
public class Task10 {


  Scanner scanner = new Scanner(System.in);
  private Map<Integer, String> programs = new HashMap();
  private int calculationType;
  private double a;
  private double b;
  private double outcome;

  private static final int DODAWANIE = 1;
  private static final int ODEJMOWANIE = 2;
  private static final int MNOZENIE = 3;
  private static final int DZIELENIE = 4;
  private static final int POTEGOWANIE = 5;


  private void displayCalculationTypes() {

    programs.put(1, "1. dodawanie");
    programs.put(2, "2. odejmowanie");
    programs.put(3, "3. mnozenie");
    programs.put(4, "4. dzielenie");
    programs.put(5, "5. potegowanie");

    for (String s : programs.values()) {
      System.out.println(s);
    }
    System.out.println("Jakie operacje chcesz wykonac ?");
  }

  private void takeNumberFromKEyboard() {

    calculationType = scanner.nextInt();

  }

  private void takeTwoNumbersFromAUser() {

    if (calculationType == POTEGOWANIE) {
      System.out.println("podaj jedna liczbe");
      a = scanner.nextInt();
    } else {
      System.out.println("Podaj dwie liczby");

      a = scanner.nextInt();
      b = scanner.nextInt();
    }
  }

  private void displayChosenCalculationType() {
    switch (calculationType) {
      case 1:
        System.out.println(programs.get(DODAWANIE));
        break;
      case 2:
        System.out.println(programs.get(ODEJMOWANIE));
        break;
      case 3:
        System.out.println(programs.get(MNOZENIE));
        break;
      case 4:
        System.out.println(programs.get(DZIELENIE));
        break;
      case 5:
        System.out.println(programs.get(POTEGOWANIE));
        break;
      default:
        setUpCalculator();

    }
  }

  private void performCalculations() {
    if (calculationType == DODAWANIE) {
      outcome = a + b;
      System.out.println("wynik dodawania to " + outcome);

    } else if (calculationType == ODEJMOWANIE) {
      outcome = a - b;
      System.out.println("wynik odejmowania to " + outcome);
    } else if (calculationType == MNOZENIE) {
      outcome = a * b;
      System.out.println("wynik mnozenia to " + outcome);
    } else if (calculationType == DZIELENIE) {
      if (b != 0) {
        outcome = a / b;
        System.out.println("wynik dzielenie to " + outcome);
      } else {
        System.out.println(" nie mozna dzielic przez 0");
      }
    } else if (calculationType == POTEGOWANIE) {
      outcome = Math.pow(a, 2);
      System.out.println("wynik potegowanie to " + outcome);
    }
  }

  public void setUpCalculator() {

    displayCalculationTypes();
    takeNumberFromKEyboard();
    takeTwoNumbersFromAUser();
    displayChosenCalculationType();
    performCalculations();


  }
}

