$(document).ready(function () {
    $('#menu-link-item-home').click(function (event) {
        $('#menu-link-home').addClass('link-menu-active');
        $('#menu-link-blog').removeClass('link-menu-active');
        $('#menu-link-contact').removeClass('link-menu-active');
    });

    $('#menu-link-item-blog').click(function (event) {
        $('#menu-link-blog').addClass('link-menu-active');
        $('#menu-link-home').removeClass('link-menu-active');
        $('#menu-link-contact').removeClass('link-menu-active');
    });

    $('#menu-link-item-contact').click(function (event) {
        $('#menu-link-contact').addClass('link-menu-active');
        $('#menu-link-home').removeClass('link-menu-active');
        $('#menu-link-blog').removeClass('link-menu-active');
    })
});