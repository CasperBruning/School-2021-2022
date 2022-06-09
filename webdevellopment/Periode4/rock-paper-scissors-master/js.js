 $(document).ready(function (){
     $('.outcomeDiv').hide()
     $(`.firstRow div p`).show()
     $('.resultDiv').hide()

     $(`.selectMoveContainer .outerCircle`).on('click', function(){
     //GET PLAYER MOVE
         const playerChoice = $(this).attr('id')
     //MAKE COMPUTER MOVE
         const choices = ['rock', 'paper', 'scissors'];
         const randInt = Math.floor(Math.random() * (3));
         const computerChoice = choices[randInt]

     //CHECK FOR OUTCOME
         let outcome = '';

         if (computerChoice == playerChoice){
             outcome = 'DRAW'
         } else if(playerChoice == 'paper' && computerChoice == 'scissors' || playerChoice == 'rock' && computerChoice == 'paper' || playerChoice == 'scissors' && computerChoice == 'rock'){
             outcome = 'YOU LOSE'
         } else if(playerChoice == 'paper' && computerChoice == 'rock' || playerChoice == 'rock' && computerChoice == 'scissors' || playerChoice == 'scissors' && computerChoice == 'paper'){
             outcome = 'YOU WIN'
             const score = $(`.scoreDiv:last-child`).text
         }
         console.log('PLAYER: ' + playerChoice + ' COMPUTER: '+ computerChoice + " OUTCOME: " + outcome)

         $(`.outcomeContentH1`).text(outcome)
         $('.outcomeDiv').show()
         $(`.selectMoveContainer`).hide()
         $('.resultDiv').show()

     })
     $(`.outcomeContent`).on('click', function (){
         $('.outcomeDiv').hide()
         $(`.selectMoveContainer`).show()
         $('.resultDiv').hide()
     })




 })