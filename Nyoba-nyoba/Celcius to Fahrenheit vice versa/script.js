let celcius;
let fahrenheit;
let hasilCelcius;
let hasilFahrenheit;

document.getElementById("klik").onclick = function(){
    celcius = document.getElementById("celcius").value;
    fahrenheit = document.getElementById("fahrenheit").value;

    celcius = Number(celcius);
    fahrenheit = Number(fahrenheit);

if (celcius) {
    hasilCelcius = (celcius * 1.8) + 32;
    document.getElementById("hasilfahrenheit").textContent = hasilCelcius.toFixed(2) + " °F";
}
if (fahrenheit) {
    hasilFahrenheit = (fahrenheit -32) * 5 / 9;
    document.getElementById("hasilcelcius").textContent = hasilFahrenheit.toFixed(2) + " °C";
}
}

fahrenheit.onfocus = function() {
    celcius.value = "";
    hasilCelcius.textContent = "";
    hasilFahrenheit.textContent = "";
};

celcius.onfocus = function() {
    fahrenheit.value = "";
    hasilCelcius.textContent = "";
    hasilFahrenheit.textContent = "";
};
