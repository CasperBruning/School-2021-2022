$(document).ready(function () {
    //weergeven of verbergen hamburger menu
    $(`#hamburger-button`).on("click", function (){
        $(`#main-menu`).slideToggle();
    })
})