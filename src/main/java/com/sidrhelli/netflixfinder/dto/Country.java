package com.sidrhelli.netflixfinder.dto;

import java.util.HashMap;
import java.util.Map;

public enum Country {

  ARGENTINA("ar", "Argentina"), AUSTRALIA("au", "Australia"), BELGIUM("be", "Belgium"), BRAZIL("br",
      "Brazil"), CANADA("ca", "Canada"), CZECH_REPUBLIC("cz", "Czech Republic"), FRANCE("fr",
          "France"), GERMANY("de", "Germany"), GREECE("gr", "Greece"), HONG_KONG("hk",
              "Hong Kong"), HUNGARY("hu", "Hungary"), ICELAND("is", "Iceland"), INDIA("in",
                  "India"), ISRAEL("il", "Israel"), ITALY("it", "Italy"), JAPAN("jp",
                      "Japan"), LITHUANIA("lt", "Lithuania"), MEXICO("mx", "Mexico"), NETHERLANDS(
                          "nl", "Netherlands"), POLAND("pl", "Poland"), PORTUGAL("pt",
                              "Portugal"), RUSSIA("ru", "Russia"), SINGAPORE("sg",
                                  "Singapore"), SLOVAKIA("sk", "Slovakia"), SOUTH_AFRICA("za",
                                      "South Africa"), SOUTH_KOREA("kr", "South Korea"), SPAIN("es",
                                          "Spain"), SWEDEN("se", "Sweden"), SWITZERLAND("ch",
                                              "Switzerland"), THAILAND("th",
                                                  "Thailand"), UNITED_KINGDOM("gb",
                                                      "United Kingdom"), UNITED_STATES("us",
                                                          "United States");


  private static final Map<String, Country> BY_CODE = new HashMap<>();
  private static final Map<String, Country> BY_NAME = new HashMap<>();

  static {
    for (Country c : values()) {
      BY_CODE.put(c.countryCode, c);
      BY_NAME.put(c.countryName, c);
    }
  }

  public final String countryCode;
  public final String countryName;

  private Country(String countryCode, String countryName) {
    this.countryCode = countryCode;
    this.countryName = countryName;

  }

  public static Country getCountryCode(String code) {
    return BY_CODE.get(code);
  }

  public static Country getCountryName(String name) {
    return BY_NAME.get(name);
  }



}
