package com.sidrhelli.netflixfinder.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllCountriesDto {

  @SerializedName("COUNT")
  @Expose
  private String count;
  @SerializedName("ITEMS")
  @Expose
  private List<List<String>> items = null;

  public AllCountriesDto() {}

  public AllCountriesDto(String count, List<List<String>> items) {
    super();
    this.count = count;
    this.items = items;
  }

  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }

  public List<List<String>> getItems() {
    return items;
  }

  public void setItems(List<List<String>> items) {
    this.items = items;
  }



}
