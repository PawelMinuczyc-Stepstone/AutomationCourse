package drugiZjazd.pizgającePsy;

import static drugiZjazd.pizgającePsy.Dog.PIES;

import java.util.Random;

public class Main {

  public static void main(String Args[]) {

    Dog myszka = new Dog("kundelek", "Myszka", 2, 12, 3, 7, 90, PIES);

    Dog azor = new Dog("wilczur", "Azor", 4, 32, 4, 6, 70, PIES);

    Dog pies1;
    Dog pies2;

    if (getRandomBoolean()) {
      pies1 = myszka;
      pies2 = azor;
    } else {
      pies1 = azor;
      pies2 = myszka;
    }

    int atak;
    int unik;

    Dog piesTemp;

    do {
      if (!pies1.ifWillingToAtak()) {
        break;
      }
      System.out.println("Atakuje " + pies1.getImie());
      atak = pies1.atak();
      System.out.println("Moc ataku " + atak);
      unik = pies2.unik(atak);
      System.out.println("Moc uniku wynosi " + unik);
      if (atak > unik) {
        System.out.println(pies2.getImie() + " otrzymal cios, zostalo mu " + pies2.getPunktyZycia()
                           + " punktow zycia");
      } else {
        System.out.println(pies2.getImie() + " uniknal ciosu");
      }

      if (pies1.getPunktyZycia() <= 0 || pies2.getPunktyZycia() <= 0) {
        break;
      }

      piesTemp = pies1;
      pies1 = pies2;
      pies2 = piesTemp;

    }while(true);

    if (pies2.getPunktyZycia() <= 0) {
      System.out.println(pies2.getImie() + " otrzymal smiertelny cios i zdechl");
    } else {
      System.out.println("Nikt nie wygral, psy wrocily do budy");
    }

  }

  public static boolean getRandomBoolean() {
    Random random = new Random();
    return random.nextBoolean();
  }
}
