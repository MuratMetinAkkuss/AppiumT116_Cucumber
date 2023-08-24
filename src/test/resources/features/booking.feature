Feature:  Booking.com test
  @browser
  Scenario: Booking.com
  * Kullanici "https://www.booking.com" sayfasina gider
  * Cookies i kabul eder
  * sag ust uc cizgi menuye tiklar
  * para birimi bolumunde degisiklik yaparak "usd" secer
  * sag ust uc cizgi menuye tiklar
  * dil i "Türkçe" olarak degistirir
  * arama bolume "antalya" yazilir ve arama yapilir
  * gelen otel puanin 7 den yuksek oldugu dogrulanir
  * uygulama kapatilir