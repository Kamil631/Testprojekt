import java.awt.geom.Point2D;

public class Main {

    int ersteZahl = 10;
    int zweiteZahl = 0;

    public static void main(String[] args) {
        Main main = new Main();
        main.start();

    }

    public void start(){
        Rechner rechner = new Rechner();
        Rechner2 rechner2 = new Rechner2();

        double ergebnis;

        ergebnis = rechner2.multiplizieren(5.4, 2.9);
        System.out.println("ergebnis = " + ergebnis);
        ergebnis = rechner2.multiplizieren(ersteZahl, 2.9);
        System.out.println("ergebnis = " + ergebnis);

        int zahl = 1;

        System.out.println("zahl = " + zahl);
        zahl = 5;
        System.out.println("zahl = " + zahl);
        zahl = 10;
        System.out.println("zahl = " + zahl);

        System.out.println("ersteZahl = " + ersteZahl);
        ersteZahl = 2000;
        System.out.println("ersteZahl = " + ersteZahl);

        System.out.println("zweiteZahl = " + zweiteZahl);
        zweiteZahl = 2000;
        System.out.println("zweiteZahl = " + zweiteZahl);

        rechner.addieren(ersteZahl, zweiteZahl);
        rechner.addieren(553, -423);
        rechner.subtrahieren(ersteZahl, zweiteZahl);
        rechner.multiplitzieren(ersteZahl, zweiteZahl);
        rechner.dividieren(ersteZahl, zweiteZahl);
        rechner.modulo(ersteZahl, zweiteZahl);

        Punkt punkt1 = new Punkt();
        punkt1.setX(10);
        punkt1.setY(20);

        Punkt punkt2 = new Punkt();
        punkt2.setX(3);
        punkt2.setY(5);

        Punkt punkt3 = new Punkt();
        punkt3.setX(331);
        punkt3.setY(52);
        punkt1.setY(-10);

        punkt1.print();
        punkt2.print();
    }
}





