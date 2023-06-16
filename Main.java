package projetMonnaie;

public class Main {
    public static void main(String[] args) {
        Currency euro = new Euro(100);
        Currency dinars = new TNDinars(200);
        Currency dollars = new Dollars(300);

        System.out.println("Montant en Euro: " + euro.getAmount() + " " + euro.getSymbol());
        System.out.println("Montant en TNDinars: " + dinars.getAmount() + " " + dinars.getSymbol());
        System.out.println("Montant en Dollars: " + dollars.getAmount() + " " + dollars.getSymbol());

        // Conversion
        convertToCurrency(dinars, sourceCurrency -> new Euro(sourceCurrency.getAmount() * 0.31));
        convertToCurrency(dinars, sourceCurrency -> new Dollars(sourceCurrency.getAmount() * 0.36));
        convertToCurrency(dollars, sourceCurrency -> new Euro(sourceCurrency.getAmount() * 0.85));
    }

    public static void convertToCurrency(Currency sourceCurrency, CurrencyConverter converter) {
        Currency convertedCurrency = converter.convertCurrency(sourceCurrency);
        System.out.println("Le montant en " + sourceCurrency.getSymbol() + " est converti en " + convertedCurrency.getSymbol() +
                ": " + convertedCurrency.getAmount() + " " + convertedCurrency.getSymbol());
    }
}
