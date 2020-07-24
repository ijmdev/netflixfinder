package com.sidrhelli.netflixfinder.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewReleasesDto {

  @SerializedName("COUNT")
  @Expose
  private String count;
  @SerializedName("ITEMS")
  @Expose
  private List<NetflixRelease> items = null;

  public NewReleasesDto() {}

  public NewReleasesDto(String count, List<NetflixRelease> items) {
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

  public List<NetflixRelease> getItems() {
    return items;
  }

  public void setItems(List<NetflixRelease> items) {
    this.items = items;
  }

  @Override
  public String toString() {
    return "NewReleasesDTO [count=" + count + ", items=" + items + "]";
  }

}

