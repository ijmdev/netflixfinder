package com.sidrhelli.netflixfinder.dto;

public enum Interval {
  LAST_WEEK("7", "Last week"), LAST_TWO_WEEKS("14", "Past two weeks"), LAST_MONTH("31",
      "Last month"), LAST_TWO_MONTHS("62", "Past two months"), LAST_YEAR("365", "Past_year");

  public final String urlParameter;
  public final String name;

  private Interval(String urlParameter, String name) {
    this.urlParameter = urlParameter;
    this.name = name;
  }


}
