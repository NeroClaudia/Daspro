from tabulate import tabulate
hargaTiket = 50000
data = []

while True:
    namaPelanggan = input("Masukkan Nama: ")

    if namaPelanggan.lower() == "batal":
        print("Transaksi Selesai")
        break

    try:
        jmlTiket = float(input("Jumlah Tiket: "))
    except ValueError:
        print("Input Tidak Valid (Harus Angka)")
        continue

    if jmlTiket < 0:
        print("Input Tidak Valid (Angka tidak boleh negatif)")
        continue
    
    diskon = 0

    if jmlTiket > 10:
        diskon = 0.15
    elif jmlTiket >4:
        diskon = 0.1
 
    harga = hargaTiket * jmlTiket
    totDiskon = harga * diskon
    totHarga = harga - totDiskon

    decision = input("Lanjut? (Ya/Tidak) ")
    data.append([namaPelanggan, jmlTiket, totHarga])

    if (decision.lower() == "tidak"):
        break

headers = ["Nama", "Jumlah Tiket", "Total"]
print(tabulate(data, headers=headers, tablefmt="fancy_grid", colalign=("left", "center", "center")))
        


