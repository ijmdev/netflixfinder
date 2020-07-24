$(document).ready(function() {
  
    $(window).scroll(function () {
      //  console.log($(window).scrollTop())
      if ($(window).scrollTop() > 280) {
        $('#menu').addClass('navbar-fixed');
      }
      if ($(window).scrollTop() < 281) {
        $('#menu').removeClass('navbar-fixed');

      }
    });
  });