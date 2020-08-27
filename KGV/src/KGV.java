public class KGV {

    public static void main(String[] args) {
        int ersteZahl = eingabe();
        int zweiteZahl = eingabe();
        int ggT = verarbeitung(ersteZahl, zweiteZahl);
        ausgabe(ggT);
    }

    private static int eingabe() {
        scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl ein: ");
        return scanner.nextInt();
    }

    private static int verarbeitung(int ersteZahl, int zweiteZahl) {
        if (ersteZahl == 0)
            return zweiteZahl;
        while (zweiteZahl != 0) {
            if (ersteZahl > zweiteZahl) {
                ersteZahl -= zweiteZahl;
            } else {
                zweiteZahl -= ersteZahl;
            }
        }

        return ersteZahl;
    }


    private static void ausgabe(int ggt) {
        System.out.println("Der größte gemeinsame Teiler ist " + ggt);
    }

}

}
