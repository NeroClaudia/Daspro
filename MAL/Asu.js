console.log("=====Menu Makanan=====");
console.log("1. Soto");
console.log("2. Ayam Kampus");
console.log("3. Penis Kuda");
console.log("4. Kecoak Goreng");
console.log("5. Testis Bakar");

const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Pilih normor (1-5) ", function(nomor){

if (nomor === "1") {
    console.log("30 Ribu");

}else if (nomor === "2") {
    console.log("20 Ribu");

}else if (nomor === "3") {
    console.log("400 Ribu");

}else if (nomor === "4") {
    console.log("200 Ribu");

}else if (nomor === "5") {
    console.log("500 Ribu");

}else {
    console.log("Goblok");
}

rl.close();
});




