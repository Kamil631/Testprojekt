public class Rechner {
    public void addieren(int zahl1, int zahl2) {
        int summe = zahl1 + zahl2;
        System.out.println("summe = " + summe);
    }

    public void subtrahieren(int zahl1, int zahl2) {
        int differenz = zahl1 - zahl2;
        System.out.println("differenz = " + differenz);
    }

    public void multiplitzieren(int zahl1, int zahl2) {
        int produkt = zahl1 * zahl2;
        System.out.println("produkt = " + produkt);;
    }

    public void dividieren(int zahl1, int zahl2) {
        int quotient = zahl1 / zahl2;
        System.out.println("quotient = " + quotient);
    }

    public void modulo(int zahl1, int zahl2) {
        int rest = zahl1 % zahl2;
        System.out.println("rest = " + rest);
    }
}
