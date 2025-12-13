console.log("===Menu Makanan===");
console.log("1. Soto");
console.log("2. Ikan Bakar");
console.log("3. Ayam Kampus");
console.log("4. Babi Guling");
console.log("5. Penis Kuda");

const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Pilih nomor (1-5)", function(nomor){
    
    if (nomor === "1") {
        console.log("30 Ribu");
    }else if (nomor === "2") {
        console.log("40 Ribu");
    }else if (nomor === "3") {
        console.log("50 Ribu");
    }else if (nomor === "4") {
        console.log("100 Ribu");
    }else if (nomor === "5") {
        console.log("500 Ribu");
    }else {
        console.log("Tidak ada dalam menu");
    }
    rl.close();
})