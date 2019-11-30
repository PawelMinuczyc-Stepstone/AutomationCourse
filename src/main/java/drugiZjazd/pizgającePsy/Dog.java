package drugiZjazd.pizgającePsy;

import java.util.Random;

public class Dog {

  private Random rand = new Random();

  private int agresja;
  private int zwinnosc;
  private int punktyZycia;
  private String plec;
  private int wiek;
  private int waga;

  private String rasa;
  private String imie;

  private int atakCount = 10;

  public static final String SUKA = "Suka";
  public static final String PIES = "Pies";

  public String getImie() {
    return this.imie;
  }

  public void setWiek() {
    this.wiek = (int)Math.floor(Math.random() * 11);
  }

  public void setWaga() {
    this.waga = (int)Math.floor(Math.random() * 61);
  }

  public void setAgresja() {
    this.agresja = (int)Math.floor(Math.random() * 11);
  }

  public void setZwinnosc(int min, int max) {
    this.zwinnosc = (int)Math.floor(Math.random() * 11);
  }

  public int getWiek() {
    return wiek;
  }

  public int getWaga() {
    return waga;
  }

  public int getAgresja() {
    return agresja;
  }

  public int getZwinnosc() {
    return zwinnosc;
  }

  public int getPunktyZycia() {
    return punktyZycia;
  }

  public boolean ifWillingToAtak() {
    return this.atakCount > 0;
  }

  public Dog(String rasa, String imie, String plec) {

    this.rasa = rasa;
    this.imie = imie;
    this.plec = plec;
    setWiek();

  }

  public Dog(String rasa, String imie, int wiek, int waga, int agresja, int zwinnosc,
             int punktyZycia, String plec) {
    this.rasa = rasa;
    this.imie = imie;
    this.wiek = wiek;
    this.waga = waga;
    this.agresja = agresja;
    this.zwinnosc = zwinnosc;
    this.punktyZycia = punktyZycia;
    this.plec = plec;
  }

  public int atak() {

    atakCount = atakCount - 1;
    switch (plec) {
      case SUKA:
        return (int) ((agresja + zwinnosc + punktyZycia + waga) / wiek) - 3;
      case PIES:
        return (int) ((agresja + zwinnosc + punktyZycia + waga) / wiek);
    }
    return 0;
  }

  public int unik(int atak) {

    int unik = 0;
    switch (plec) {
      case SUKA:
        unik = (this.zwinnosc + this.punktyZycia) - (this.wiek + this.waga) + 4;
        break;
      case PIES:
        unik = (zwinnosc + punktyZycia) - (wiek + waga);
        break;
    }
    if (atak > unik) {
      this.punktyZycia = this.punktyZycia - atak;
    }
    return unik;
  }

}
