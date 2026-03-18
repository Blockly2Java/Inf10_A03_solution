/**
Erstelle dein Programm über Blockly und
klicke auf 'Play', um es auszuführen!
*/

public class Taschenrechner {
    /**
     * Das Hauptprogramm (main-Methode):
     * Alles, was ausgeführt werden soll,
     * muss in diese Methode eingefügt werden.
     * Objekte erstellen, Methoden aufrufen, ...
     *
     * Das Hauptprogramm wird automatisch
     * gestartet, wenn du auf 'Play' drückst.
     */
    public static void main() {
        System.out.println(addieren(1, 2));
        System.out.println(subtrahieren(1, 2));
        System.out.println(multiplizieren(1, 2));
        System.out.println(dividieren(1, 2));
        System.out.println(mittelwert(1, 2));
    }

    public static double addieren(double z1, double z2) {
        return z1 + z2;
    }

    public static double subtrahieren(double z1, double z2) {
        return z1 - z2;
    }

    public static double multiplizieren(double z1, double z2) {
        return z1 * z2;
    }

    public static double dividieren(double z1, double z2) {
        return z1 / z2;
    }

    public static double mittelwert(double z1, double z2) {
        double summe = z1 + z2;
        return summe / 2;
    }
    public static double potenzieren(double z1, double z2) {
        return Math.pow(z1, z2);
    }

}