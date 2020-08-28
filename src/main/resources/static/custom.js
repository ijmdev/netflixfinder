
/**Infinite Scroll**/

$('.mvthumbnail-container').infiniteScroll({
    // options
    path: 'newreleases?p={{#}}',
    append: '.movietile',
    history: false,
    hideNav: '.scroll-nav',
    status: '.page-load-status',
  });


