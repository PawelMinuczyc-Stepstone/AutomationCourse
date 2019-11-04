import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderInitializer {

  public static BufferedReader initializeReader() {

    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    return bufferedReader;

  }


}
