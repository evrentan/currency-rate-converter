import java.util.Scanner;

public class CurrencyRateConverter {

    public static void main(String[] args) {
        System.out.println("Enter the currency code (USD, EUR, CHF, GBP, JPY): ");

        Scanner scanner = new Scanner(System.in);
        String currencyCode = scanner.nextLine();
        scanner.close();

        CurrencyRateConverterService currencyRateConverterService = new CurrencyRateConverterServiceImpl();
        System.out.print(currencyRateConverterService.getCurrencyRate(currencyCode));
    }
}