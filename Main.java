package projetMonnaie;

public class Main {
    public static void main(String[] args) {
        Euro euro = new Euro(100);
        TNDinars dinars = new TNDinars(200);
        Dollars dollars = new Dollars(300);

        System.out.println("Mentant en  Euro: " + euro.getAmount() + " " + euro.getSymbol());
        System.out.println("Mentant en TNDinars: " + dinars.getAmount() + " " + dinars.getSymbol());
        System.out.println("Mentant en Dollars: " + dollars.getAmount() + " " + dollars.getSymbol());

        // la conversion
        convertDinarsToEuro(dinars);
        convertDinarsToDollars(dinars);
        convertDollarsToEuro(dollars);
    }

    public static void convertDinarsToEuro(TNDinars dinars) {
        double euroAmount = dinars.getAmount() * 0.31; // Conversion  TND en Euro
        Euro euro = new Euro(euroAmount);
        System.out.println("le mentant en TNDinars est converti en Euro: " + euro.getAmount() + " " + euro.getSymbol());
    }

    public static void convertDinarsToDollars(TNDinars dinars) {
        double dollarsAmount = dinars.getAmount() * 0.36; // Conversion   TND en Dollars
        Dollars dollars = new Dollars(dollarsAmount);
        System.out.println("le mentant en TNDinars est converti en  Dollars: " + dollars.getAmount() + " " + dollars.getSymbol());
    }

    public static void convertDollarsToEuro(Dollars dollars) {
        double euroAmount = dollars.getAmount() * 0.85; // Conversion   Dollars en Euro
        Euro euro = new Euro(euroAmount);
        System.out.println("le mentant en  Dollars est converti en Euro: " + euro.getAmount() + " " + euro.getSymbol());
    }
}