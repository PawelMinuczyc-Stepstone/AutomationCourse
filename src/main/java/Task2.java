import java.io.IOException;

public class Task2 extends BufferReaderInitializer {
//#2
//Program przyjmuje ciąg znaków i wyświetla wynik wielkimi literami.

  public void stringToUppercase() {

    System.out.println("Provide some text i will convert it to uppercase");

    String someString = null;
    try {
      someString = initializeReader().readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println(someString.toUpperCase());
  }


}
