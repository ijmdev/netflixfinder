
function truncateSynopsis(text) {
    var maxLength = 100;
    var dots = "<span class=\"dots\">...</span><span class=\"more\">";
    var closingSpan = "</span>";
    var readMoreLink = "<a href=\"#\" class=\"read-more\">Read more</a>";
    var truncatedSynopsis = "";
    if (text != null) {
        var newText = text.substr(0, maxLength);
        var removedString = text.substr(maxLength + 1, text.length);
        truncatedSynopsis = newText + dots + removedString + closingSpan + readMoreLink;
    }
    return truncateSynopsis;
}

