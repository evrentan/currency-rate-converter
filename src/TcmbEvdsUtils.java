import java.text.SimpleDateFormat;
import java.util.Date;

public class TcmbEvdsUtils {

    public static void checkCurrencyCode(String currencyCode) {
        if (!TcmbEvdsCurrencyCodes.getCurrencyCodes().contains(currencyCode)) {
            throw new RuntimeException(Constants.INVALID_CURRENCY_CODE);
        }
    }

    public static String generateTcmbEvdsUri(String currencyCode) {
        final String series = Constants.TCMB_EVDS_URI_SERIES.concat(currencyCode);

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        final String todayDate = formatter.format(new Date());

        final String startDate = Constants.TCMB_EVDS_URI_START_DATE.concat(todayDate);
        final String endDate = Constants.TCMB_EVDS_URI_END_DATE.concat(todayDate);

        final String type = Constants.TCMB_EVDS_URI_TYPE.concat("json");

        final String key = Constants.TCMB_EVDS_URI_KEY.concat(Constants.TCMB_EVDS_API_KEY);

        return Constants.TCMB_EVDS_URI.concat(series).concat(startDate).concat(endDate).concat(type).concat(key);
    }
}
