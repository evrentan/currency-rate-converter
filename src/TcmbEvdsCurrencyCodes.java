import java.util.List;

public enum TcmbEvdsCurrencyCodes {
    USD("TP.DK.USD.A"),
    EUR("TP.DK.EUR.A"),
    CHF("TP.DK.CHF.A"),
    GBP("TP.DK.GBP.A"),
    JPY("TP.DK.JPY.A");

    private final String code;

    TcmbEvdsCurrencyCodes(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static String getTcmbEvdsCurrencyCode(String currencyCode) {
        return TcmbEvdsCurrencyCodes.valueOf(currencyCode).getCode();
    }

    public static List<String> getCurrencyCodes() {
        return List.of(TcmbEvdsCurrencyCodes.USD.name(),
                TcmbEvdsCurrencyCodes.EUR.name(),
                TcmbEvdsCurrencyCodes.CHF.name(),
                TcmbEvdsCurrencyCodes.GBP.name(),
                TcmbEvdsCurrencyCodes.JPY.name()
        );
    }
}
