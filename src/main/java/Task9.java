//    Napisz program, który narysuje polowke choinki z tyloma rzedami, ile wprowadzi uzytkownik.

//    Przerób zadanie #5 tak, aby można było rysować choinkę wielokrotnie bez ponownego
//    uruchamiania programu oraz po wprowadzeniu liczby ujemnej, choinka rysowała się do góry nogami.


import java.io.IOException;

public class Task9 {

  private int stars;
  private int number = 0;

  private int takeNumberOfStars() throws IOException {
    number = Integer.parseInt(BufferReaderInitializer.initializeReader().readLine());
    return number;
  }




  public void drawANormalChristmasTree() {

    for (int i = 0; i < number; i++) {

      for (int k = 0; k < (2 * i + 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public void startDrawingChristmassTree() throws IOException {

    stars = takeNumberOfStars();

    if (number >= 0) {
      drawANormalChristmasTree();
    } else if (number < 0) {
      drawaReversedChristmasTree();
    }
  }

  public void dupa() {
    int x, y;
    for (y = 5; y >= 1; y--) { //reverse here
      for (x = 0; x < 5 - y; x++) {
        System.out.print(' ');
      }
      for (x = (2 - y); x < (2 - y) + (2 * y - 1); x++) {
        System.out.print('*');
      }
      System.out.print('\n');
    }
  }

  private void drawaReversedChristmasTree() {

    for (int i = number; i >= 1; i--) {

      for (int k = 0; k < number -i ; k++) {
        System.out.print(' ');
      }
    }

  }
}
