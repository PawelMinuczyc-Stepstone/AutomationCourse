package drugiZjazd.imionaAlfabetycznie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Names {

  //Zad.2.
  //Stwórz program, który będzie dodawał
  // do listy wprowadzone w konsoli imiona,
  // a po wprowadzeniu tekstu "koniec" wypisze
  // wszystkie imiona alfabetycznie.
  private String name;
  private final String koniec = "koniec";

  InputStreamReader inputStreamReader = new InputStreamReader(System.in);
  BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

  List<String> namesList = new ArrayList();


  private String provideName() {
    String name = null;
    try {
      name = bufferedReader.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return name;
  }

  public void addNameToAList() {

    name = provideName();
    if (!name.contains("koniec")) {
      namesList.add(name);
    }
  }

  public void reverseNames() {

    do {
      addNameToAList();
    } while (!name.contains("koniec"));

    java.util.Collections.sort(namesList);

    Iterator iterator = namesList.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }

}






