
/**Infinite Scroll**/

$('.card-container').infiniteScroll({
    // options
    path: 'newreleases?p={{#}}',
    append: '.moviecard',
    history: false,
    hideNav: '.scroll-nav',
    status: '.page-load-status',
  });


