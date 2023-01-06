package main;

public class Main {
  public static void main(String[] args) {
    //    Hero型変数hにインスタンスを代入
    Hero h = new Hero();

    h.name = "Okada";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生みだした!");

    h.sit(5);
    h.slip();
    h.sit(25);
    h.run();
  }
}
