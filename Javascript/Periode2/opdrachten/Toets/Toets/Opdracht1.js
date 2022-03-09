document.querySelector('button').addEventListener("click", ()=>{
    let getal1 = parseInt(document.querySelector(`#input1`).value)
    let getal2 = parseInt(document.querySelector(`#input2`).value)

    if (getal1 == "NaN" || getal2 == "NaN"){
        document.querySelector(`p`).innerHTML = "Geen gelidge getallen ingevuld"
    } else {
        if (document.querySelector("select").value === "+"){
            const result = getal1 + getal2
            document.querySelector(`p`).innerHTML = `De uitkomst van ${getal1} + ${getal2} = ${result}`
        }
        if (document.querySelector("select").value === "-"){
            const result = getal1 - getal2
            document.querySelector(`p`).innerHTML = `De uitkomst van ${getal1} - ${getal2} = ${result}`
        }
        if (document.querySelector("select").value === "*"){
            const result = getal1 * getal2
            document.querySelector(`p`).innerHTML = `De uitkomst van ${getal1} * ${getal2} = ${result}`
        }
        if (document.querySelector("select").value === "/"){
            const result = getal1 / getal2
            document.querySelector(`p`).innerHTML = `De uitkomst van ${getal1} / ${getal2} = ${result}`

        }
    }

    // op een een of andere manier werkt de eerste if statement
    // niet die controleert of het geldige getallen zijn
    // het lijkt wel of die hele if statement word overgeslagen







})
