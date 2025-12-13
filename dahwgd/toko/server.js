const express = require('express');
const app = express();
const PORT = 3000;

let produk = [
    {nama: "Roti", harga: 4000},
    {nama: "Teh Susu", harga: 12000},
];

app.set("view engine", "ejs");

app.get("/", (req, res) => {
    res.render("index", {dataProduk: produk});
});

app.listen(PORT, () => {
    console.log(`Server Berjalan di http://localhost:${PORT}`);
})