
package com.sidrhelli.netflixfinder.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sidrhelli.netflixfinder.utils.Utils;

@Entity
@Table(name = "releases")
public class NetflixRelease {

  @SerializedName("netflixid")
  @Expose
  @Id
  private String netflixid;
  @SerializedName("title")
  @Expose
  private String title;
  @SerializedName("image")
  @Expose
  private String image;
  @SerializedName("synopsis")
  @Expose
  private String synopsis;
  @SerializedName("rating")
  @Expose
  private String rating;
  @SerializedName("type")
  @Expose
  private String type;
  @SerializedName("released")
  @Expose
  private String released;
  @SerializedName("runtime")
  @Expose
  private String runtime;
  @SerializedName("largeimage")
  @Expose
  private String largeimage;
  @SerializedName("unogsdate")
  @Expose
  private String unogsdate;
  @SerializedName("imdbid")
  @Expose
  private String imdbid;
  @SerializedName("download")
  @Expose
  private String download;

  public NetflixRelease() {}

  public NetflixRelease(String netflixid, String title, String image, String synopsis,
      String rating, String type, String released, String runtime, String largeimage,
      String unogsdate, String imdbid, String download) {
    super();
    this.netflixid = netflixid;
    this.title = title;
    this.image = image;
    this.synopsis = synopsis;
    this.rating = rating;
    this.type = type;
    this.released = released;
    this.runtime = runtime;
    this.largeimage = largeimage;
    this.unogsdate = unogsdate;
    this.imdbid = imdbid;
    this.download = download;
  }

  public String getNetflixid() {
    return netflixid;
  }

  public void setNetflixid(String netflixid) {
    this.netflixid = netflixid;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getSynopsis() {
    return Utils.truncateString(synopsis);
  }

  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
  }

  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getReleased() {
    return released;
  }

  public void setReleased(String released) {
    this.released = released;
  }

  public String getRuntime() {
    return Utils.formatMovieDuration(runtime);
  }

  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  public String getLargeimage() {
    return largeimage;
  }

  public void setLargeimage(String largeimage) {
    this.largeimage = largeimage;
  }

  public String getUnogsdate() {
    return unogsdate;
  }

  public void setUnogsdate(String unogsdate) {
    this.unogsdate = unogsdate;
  }

  public String getImdbid() {
    return imdbid;
  }

  public void setImdbid(String imdbid) {
    this.imdbid = imdbid;
  }

  public String getDownload() {
    return download;
  }

  public void setDownload(String download) {
    this.download = download;
  }


  @Override
  public String toString() {
    return "NewNetflixRelease [netflixid=" + netflixid + ", title=" + title + ", image=" + image
        + ", synopsis=" + synopsis + ", rating=" + rating + ", type=" + type + ", released="
        + released + ", runtime=" + runtime + ", largeimage=" + largeimage + ", unogsdate="
        + unogsdate + ", imdbid=" + imdbid + ", download=" + download + "]";
  }



}
