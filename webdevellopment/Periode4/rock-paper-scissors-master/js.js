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

     //CSS
         const cssRockOuterCircle = [{
             'background-color' : '#DB2E4D',
             'box-shadow' : 'inset 0px -10px 0 -4px #9D1634'
         }]
         const cssPaperOuterCircle = [{
             'background-color' : '#4664F4',
             'box-shadow' : 'inset 0px -10px 0 -4px #2A45C2'
         }]
         const cssScissorsOuterCircle = [{
             'background-color' : '#EB9F0E',
             'box-shadow' : 'inset 0px -10px 0 -4px #C76C1B'
         }]

     //SET MOVES ON SCREEN
        if(computerChoice == 'rock'){
            $('#rocks').css({'background-color' : '#DB2E4D',
                'box-shadow' : 'inset 0px -10px 0 -4px #9D1634'})
            $('#rocksIMG').attr('src', 'images/icon-rock.svg')
        } else if(computerChoice == 'paper'){
            $('#rocks').css({'background-color' : '#4664F4',
                'box-shadow' : 'inset 0px -10px 0 -4px #2A45C2'})
            $('#rocksIMG').attr('src', 'images/paper-rock.svg')
        } else if (computerChoice == 'scissors'){
            $('#rocks').css({'background-color' : '#EB9F0E',
                'box-shadow' : 'inset 0px -10px 0 -4px #C76C1B'})
            $('#rocksIMG').attr('src', 'images/scissors-rock.svg')
        }

     })

     $(`.outcomeContent`).on('click', function (){
         $('.outcomeDiv').hide()
         $(`.selectMoveContainer`).show()
         $('.resultDiv').hide()
     })
 })