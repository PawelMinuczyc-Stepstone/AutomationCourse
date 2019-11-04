package drugiZjazd.psiaGra;

import java.util.Random;

public class Dog {

  Random rand = new Random();

  private String rasa;
  private String imie;
  private int wiek = (int) Math.random();
  private int waga;
  private int agresja;
  private int zwinnosc;
  private int punktyZycia;
  private String plec;
  private int atak;
  private int unik;

  private static final String SUKA = "Suka";
  private static final String PIES = "Pies";

  public Dog(String rasa, String imie, int wiek, int waga, int agresja, int zwinnosc,
             int punktyZycia,
             String plec) {
    this.rasa = rasa;
    this.imie = imie;
    this.wiek = wiek;
    this.waga = waga;
    this.agresja = agresja;
    this.zwinnosc = zwinnosc;
    this.punktyZycia = punktyZycia;
    this.plec = plec;
  }

  public Dog(String rasa, String imie, int wiek, int waga, int agresja, int zwinnosc,
             int punktyZycia) {
    this.rasa = rasa;
    this.imie = imie;
    this.wiek = wiek;
    this.waga = waga;
    this.agresja = agresja;
    this.zwinnosc = zwinnosc;
    this.punktyZycia = punktyZycia;
  }

  public int atak(int agresja, int zwinnosc, int punktyZycia, int waga, int wiek) {

    switch (plec) {
      case SUKA:
        atak = (agresja + zwinnosc + punktyZycia + waga) / wiek;
        atak = atak - 3;
        break;
      case PIES:
        atak = (agresja + zwinnosc + punktyZycia + waga) / wiek;
        break;
    }
    return this.atak;
  }

  public int unik(int wiek, int zwinnosc, int punktyZycia, int waga) {

    switch (plec) {
      case SUKA:
        unik = (zwinnosc + punktyZycia) - (wiek + waga);
        unik = unik + 4;
        break;
      case PIES:
        unik = (zwinnosc + punktyZycia) - (wiek + waga);
        break;
    }
    return unik;
  }

  private boolean czyJestTrafienieCzyUnik() {
    boolean czyAtakSieUdal = false;
    if (unik > atak) {
      czyAtakSieUdal = false;
    } else {
      czyAtakSieUdal = true;
    }
    return czyAtakSieUdal;
  }

}
