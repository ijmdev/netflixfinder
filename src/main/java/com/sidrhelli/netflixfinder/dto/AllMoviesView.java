package com.sidrhelli.netflixfinder.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import jdk.nashorn.internal.ir.annotations.Immutable;

@Entity
@Table(name = "all_movies")
@Immutable
public class AllMoviesView {


  @Id
  @Column(name = "netflixid")
  private String netflixId;
  @Column
  @Lob
  private String image;
  @Column
  @Lob
  private String largeimage;
  @Column
  private String rating;
  @Column
  private String released;
  @Column
  private String runtime;
  @Column
  private String synopsis;
  @Column
  private String title;
  @Column
  private String type;
  @Column
  private String unogsdate;


  public AllMoviesView() {}


  public String getNetflixId() {
    return netflixId;
  }


  public void setNetflixId(String netflixId) {
    this.netflixId = netflixId;
  }


  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public String getLargeimage() {
    return largeimage;
  }


  public void setLargeimage(String largeimage) {
    this.largeimage = largeimage;
  }


  public String getRating() {
    return rating;
  }


  public void setRating(String rating) {
    this.rating = rating;
  }


  public String getReleased() {
    return released;
  }


  public void setReleased(String released) {
    this.released = released;
  }


  public String getRuntime() {
    return runtime;
  }


  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }


  public String getSynopsis() {
    return synopsis;
  }


  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
  }


  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public String getUnogsdate() {
    return unogsdate;
  }


  public void setUnogsdate(String unogsdate) {
    this.unogsdate = unogsdate;
  }


  @Override
  public String toString() {
    return "AllMoviesView [netflixId=" + netflixId + ", image=" + image + ", largeimage=" + largeimage + ", rating=" + rating + ", released=" + released + ", runtime=" + runtime + ", synopsis="
        + synopsis + ", title=" + title + ", type=" + type + ", unogsdate=" + unogsdate + "]";
  }



}
