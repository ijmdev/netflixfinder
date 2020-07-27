package com.sidrhelli.netflixfinder.utils;

public class Utils {

  private Utils() {

  }

  public static final String truncateSynopsis(String text) {
    StringBuilder sb = new StringBuilder();
    int maxLength = 100;
    if (null != text) {
      if (text.length() > maxLength) {
        String newString = text.substring(0, maxLength);
        String removedString = text.substring(maxLength, text.length());
        sb.append(newString);
        sb.append("<span id=\"dots\">...</span><span id=\"more\">");
        sb.append(removedString);
        sb.append("</span>");
        sb.append("<a href=\"#\" onclick=\"myFunction()\" id=\"myBtn\">Read more</a>" + "");
      }
    }

    return sb.toString();
  }

  public static final String formatMovieDuration(String duration) {


    String newDuration = "";
    if (null != duration) {
      if (0 > duration.length())
        throw new IllegalArgumentException("Invalid duration.");

      if (duration.length() > 3) {
        String h = "";
        String m = "";
        char[] array = duration.toCharArray();
        for (int i = 0; i < array.length - 1; i++) {
          if (i == 0) {
            h = String.valueOf(array[0]);
          }
          if (i == 2) {
            m = String.valueOf(array[2]);
          }
          if (i == 3) {
            m = m.concat(String.valueOf(array[3]));
          }
        }
        int hours = Integer.valueOf(h);
        int minutes = Integer.valueOf(m);

        newDuration = String.valueOf((hours * 60) + minutes);
        return newDuration += " min";
      } else {
        newDuration = duration.replace("m", " min");
      }

    }
    return newDuration;
  }
}
