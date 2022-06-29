$(document).ready(function (){
    $(`.hamburgerMenu`).hide()
    $(`.hamburgerCloseIcon`).hide()

    $('.hamburgerIconDiv').on('click', function (){
        $(`.hamburgerMenu`).slideToggle();
        $(`.hamburgerCloseIcon`).toggle();
        $(`.hamburgerIcon`).toggle();
        $(`.newsletterPopup`).remove();

    })

    $(`.popupClose`).on('click', function (){
        $(`.newsletterPopup`).remove()
        console.log("test")
    })
})