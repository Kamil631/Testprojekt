public class Main {
    static int ersteZahl = 10;
    static int zweiteZahl = 4;

    public static void main(String[] args) {
        Rechner rechner = new Rechner();
        rechner.addieren(ersteZahl, zweiteZahl);
        rechner.addieren(553, -423);
        rechner.subtrahieren(ersteZahl, zweiteZahl);
        rechner.multiplitzieren(ersteZahl, zweiteZahl);
        rechner.dividieren(ersteZahl, zweiteZahl);
        rechner.modulo(ersteZahl, zweiteZahl);
    }
}





