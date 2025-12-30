from tabulate import tabulate
data = []
diskon = 0
hargaTiket = 50000
while True:
    namaPelanggan = input("Nama Pelanggan: ")
    if namaPelanggan.lower() == "batal":
        print("Transaksi Dibatalkan")
        break
    
    try:
        jmlTiket = float(input("Jumlah Tiket: "))
    except ValueError:
        print("Input Invalid (Harus Angka)")
        continue
    
    if jmlTiket < 0:
        print("Input Tidak Valid (Angka tidak boleh negatif)")
        continue
    
    if jmlTiket > 4:
        diskon = 0.01
    elif (jmlTiket > 10):
        diskon = 0.15

    harga = jmlTiket * hargaTiket
    hargaDiskon = diskon * harga
    total = harga - hargaDiskon

    data.append((namaPelanggan, total))

    print(tabulate(data, headers=["Nama", "Total"], tablefmt="grid"))
    