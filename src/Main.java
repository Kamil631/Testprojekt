public class Main {
    static int ersteZahl = 10;
    static int zweiteZahl;

    public static void main(String[] args) {
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
    }
}





