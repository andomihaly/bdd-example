function calculateAddition(){
    var number1 = document.getElementById("addition_number1").value;
    var number2 = document.getElementById("addition_number2").value;

    var xhttp = new XMLHttpRequest();
    xhttp.open("POST","/add",false);
    xhttp.onreadystatechange = calculateAddition_responseHandler

    xhttp.setRequestHeader("Content-Type", "application/json");
    xhttp.send(JSON.stringify({number1: number1, number2: number2}))
}

function calculateAddition_responseHandler() {
    if (this.readyState == 4 && this.status == 200) {
        document.getElementById("addition_result").innerText = this.responseText;
    }
}

function calculateMultiplication(){
    var number1 = document.getElementById("multiplication_number1").value;
    var number2 = document.getElementById("multiplication_number2").value;

    var xhttp = new XMLHttpRequest();
    xhttp.open("POST","/multiply",false);
    xhttp.onreadystatechange = calculateMultiplication_responseHandler

    xhttp.setRequestHeader("Content-Type", "application/json");
    xhttp.send(JSON.stringify({number1: number1, number2: number2}))
}

function calculateMultiplication_responseHandler() {
    if (this.readyState == 4 && this.status == 200) {
        document.getElementById("multiplication_result").innerText = this.responseText;
    }
}