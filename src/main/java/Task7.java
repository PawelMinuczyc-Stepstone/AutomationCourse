//#3
//Napisz program dla praliki, który wyświetli poniższe menu:
//1. pranie wstepne
//2. pranie
//3. plukanie
//4. wirowanie
//5. suszenie
//
//a następnie, po wprowadzeniu przez użytkownika odpowiedniej liczby - wypisze wybrany program.
// Jeśli użytkownik wprowadzi złą liczbę - program poinformuje go o tym i poprosi o ponowne wprowadzenie.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task7 {

  Scanner scanner = new Scanner(System.in);
  private Map<Integer, String> programs = new HashMap();
  private int number;

  private void displayPrograms() {

    programs.put(1, "1. pranie wstepne");
    programs.put(2, "2. pranie");
    programs.put(3, "3. plukanie");
    programs.put(4, "4. wirowanie");
    programs.put(5, "5. suszenie");

    for (String s : programs.values()) {
      System.out.println(s);
    }
    System.out.println("What program do you want to pick?");
  }

  private void takeNumberFromKEyboard() {

    number = scanner.nextInt();

  }

  private void displayChosenProgram() {
    switch (number) {
      case 1:
        System.out.println(programs.get(1));
        break;
      case 2:
        System.out.println(programs.get(2));
        break;
      case 3:
        System.out.println(programs.get(3));
        break;
      case 4:
        System.out.println(programs.get(4));
        break;
      case 5:
        System.out.println(programs.get(5));
        break;
      default:
        SetUpWashMachine();

    }

  }


  public void SetUpWashMachine() {

    displayPrograms();
    takeNumberFromKEyboard();
    displayChosenProgram();

  }
}
