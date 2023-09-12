# Currency Rate Converter

This is a basic project that converts the below currencies to Turkish Lira and vice versa.

Currency List:
- USD
- EUR
- GBP
- CHF
- JPY

This project is written in Java 17.

This project is using [TCMB][tcmb-homepage]'s (The Central Bank of the Republic of Türkiye) [Exchange Rates API][exchange-rates-api-uri] to get the currency rates.

> **Important**
> 
> Do not forget to add/update your TCMB API Key to the TCMB_EVDS_API_KEY constant value within the [Constants][constants-file] file.

## How to Contribute

For the contributor covenant to this project, please check the Code of Conduct file.

[![Contributor Covenant][contributor-covenant]](CODE_OF_CONDUCT.md)

[tcmb-homepage]: https://www.tcmb.gov.tr/
[exchange-rates-api-uri]: https://evds2.tcmb.gov.tr/help/videos/EVDS_Web_Servis_Kullanim_Kilavuzu.pdf
[contributor-covenant]: https://img.shields.io/badge/Contributor%20Covenant-2.1-4baaaa.svg
[constants-file]: src/Constants.java