/*
*  public static final String truncateSynopsis(String text) {
    StringBuilder sb = new StringBuilder();
    int maxLength = 100;
    if (null != text) {
      if (text.length() > maxLength) {
        String newString = text.substring(0, maxLength);
        String removedString = text.substring(maxLength, text.length());
        sb.append(newString);
        sb.append("<span id=\"dots\">...</span><span class=\"more\">");
        sb.append(removedString);
        sb.append("</span>");
        sb.append("<a href=\"#\" onclick=\"myFunction()\" id=\"myBtn\">Read more</a>" + "");
      }
    }
    return sb.toString();
  }
*/

function truncateSynopsis(text: string) {
    const maxLength: number = 100;
    const dots: string = "<span class=\"dots\">...</span><span class=\"more\">";
    const closingSpan: string = "</span>";
    const readMoreLink: string = "<a href=\"#\" class=\"read-more\">Read more</a>";
    let truncatedSynopsis = "";

    if (text != null) {
        let newText: string = text.substr(0, maxLength);
        let removedString: string = text.substr(maxLength + 1, text.length);
        truncatedSynopsis = newText + dots + removedString + closingSpan + readMoreLink;
    }
    return truncateSynopsis;
}
