public class CurrencyRateConverterServiceImpl implements CurrencyRateConverterService {

    @Override
    public String getCurrencyRate(String currencyCode) {

        try {
            TcmbEvdsUtils.checkCurrencyCode(currencyCode);
        } catch (RuntimeException exception) {
            return exception.getMessage();
        }

        final String tcmbEvdsCurrencyCode;

        try {
            tcmbEvdsCurrencyCode = TcmbEvdsCurrencyCodes.getTcmbEvdsCurrencyCode(currencyCode);
        } catch (RuntimeException exception) {
            return exception.getMessage();
        }

        final TcmbEvdsResponse tcmbEvdsResponse;

        try {
            tcmbEvdsResponse = ApiUtils.getTcmbEvdsCurrencyValue(tcmbEvdsCurrencyCode);
        } catch (RuntimeException exception) {
            return exception.getMessage();
        }

        return this.getCurrencyValue(currencyCode, tcmbEvdsResponse);
    }

    private String getCurrencyValue(final String currencyCode, final TcmbEvdsResponse tcmbEvdsResponse) {
        return switch (currencyCode) {
            case "USD" -> tcmbEvdsResponse.getItems().get(0).getTP_DK_USD_A();
            case "EUR" -> tcmbEvdsResponse.getItems().get(0).getTP_DK_EUR_A();
            case "CHF" -> tcmbEvdsResponse.getItems().get(0).getTP_DK_CHF_A();
            case "GBP" -> tcmbEvdsResponse.getItems().get(0).getTP_DK_GBP_A();
            case "JPY" -> tcmbEvdsResponse.getItems().get(0).getTP_DK_JPY_A();
            default -> Constants.INVALID_CURRENCY_CODE;
        };
    }
}
