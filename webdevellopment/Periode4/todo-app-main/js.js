$(document).ready(function() {
    let colorswitch = 'lightmodeTodoall';
    $(".todoadd").on("keypress", function(e)
    {
        console.log(e.which)
      
         if(e.which === 13){
            console.log("hallo")
            let value = $('input').val();
            $(".todos").append("<div class='Thetodo'></div>");
            $(".Thetodo").last().append("<div class='selectierondje'></div>");
            $(".Thetodo").last().append("<div class='todo'>"+value+"</div>");
            $(".Thetodo").last().append("<div class='delete'></div>");
            $(".Thetodo").addClass(colorswitch)

          
            
        }

    })
   
     $('.todos').on("click",'.selectierondje' ,function()
            {
                console.log("hallo")
                $(this).toggleClass("vinkjedark")
                // $(this" .todo").toggleClass("toggleline")
            })
    $('.todos').on("click",'.delete', function()
    {

    })

    $(".modeswitch").on("click", function(){
        console.log(colorswitch)
        if(colorswitch === "darkmodeTodoall") {colorswitch = 'lightmodeTodoall';}
        else {colorswitch = 'darkmodeTodoall';}

        $(".header").toggleClass("darkmodeheader")
        $(".todoadd").toggleClass("darkmodeTodoall")
        $(".input").toggleClass("darkmodeTodoall")
        $("body").toggleClass("darkmode")
        $(".modeswitch").toggleClass("darksun")

        if(colorswitch == 'darkmodeTodoall'){ $(".Thetodo").addClass("darkmodeTodoall")}
        else{  $(".Thetodo").removeClass("darkmodeTodoall") }
       




    })



    

})