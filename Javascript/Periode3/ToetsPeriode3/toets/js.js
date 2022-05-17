$(document).ready(function () {
    $('button').on("click", function () {
        let dice1 = Math.floor(Math.random() * 6) + 1;
        let dice2 = Math.floor(Math.random() * 6) + 1;

        $(`.dice1`).html(dice1);
        $(`.dice2`).html(dice2);

        if (dice1 === dice2){
            $(`.result h3`).html("Je hebt gewonnen!").css("color", "green").animate({
                fontSize: "100px",
                color: "green"
            }, "1s", "swing")
        } else {
            $(`.result h3`).html("Helaas, probeer het nog eens").css("font-size", "20px").css("color", "black")
        }
    })

    $(document).on("keydown", function (event){
        let keycode = (event.keyCode ? event.keyCode : event.which);

        if (keycode == 32){
            let dice1 = Math.floor(Math.random() * 6) + 1;
            let dice2 = Math.floor(Math.random() * 6) + 1;

            $(`.dice1`).html(dice1);
            $(`.dice2`).html(dice2);

            if (dice1 === dice2){
                $(`.result h3`).html("Je hebt gewonnen!").css("color", "green").animate({
                    fontSize: "100px",
                    color: "green"
                }, "1s", "swing")
            } else {
                $(`.result h3`).html("Helaas, probeer het nog eens").css("font-size", "20px").css("color", "black")
            }
        }
    })
})