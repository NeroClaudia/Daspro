print("===== Nama Mahasiswa =====")

jmlSiswa = int(input("Jumlah Mahasiswa: "))
data = []

for i in range(jmlSiswa):

    nama = input("Masukkan Nama Mahasiswa: ")
    print(f"Mahasiswa ke- {i+1}")
    data.append(nama)

print("Nama-nama Mahasiswa: ", " ".join(data))