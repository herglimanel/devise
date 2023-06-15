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
        convertToCurrency(dinars, new EuroConverter());
        convertToCurrency(dinars, new DollarsConverter());
        convertToCurrency(dollars, new EuroConverter());
    }

    public static void convertToCurrency(Currency sourceCurrency, CurrencyConverter converter) {
        Currency convertedCurrency = converter.convertCurrency(sourceCurrency);
        System.out.println("Le montant en " + sourceCurrency.getSymbol() + " est converti en " + convertedCurrency.getSymbol() +
                ": " + convertedCurrency.getAmount() + " " + convertedCurrency.getSymbol());
    }
}
