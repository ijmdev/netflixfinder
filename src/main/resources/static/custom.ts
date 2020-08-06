
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

$(() => {
    console.log("Hello World!");
});