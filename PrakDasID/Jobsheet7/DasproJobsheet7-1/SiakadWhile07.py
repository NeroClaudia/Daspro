i = 0
jml = int(input("Jumlah Mahasiswa: "))

while (i < jml):
    nilai = int(input(f"Masukkan Nilai Mahasiswa ke- {i + 1}: "))

    if nilai < 0 or nilai > 100:
        print("Nilai Tidak Valid. Masukkan Lagi Nilai Yang Valid")
        continue

    if nilai > 80 and nilai <= 100:
        print(f"Nilai mahasiswa ke-{i + 1} adalah A")
        print("Bagus, pertahankan nilainya!")
    elif nilai > 73 and nilai <= 80:
        print(f"Nilai mahasiswa ke-{i + 1} adalah B+")
    elif nilai > 65 and nilai <= 73:
        print(f"Nilai mahasiswa ke-{i + 1} adalah B")
    elif nilai > 60 and nilai <= 65:
        print(f"Nilai mahasiswa ke-{i + 1} adalah C+")
    elif nilai > 50 and nilai <= 60:
        print(f"Nilai mahasiswa ke-{i + 1} adalah C")
    elif nilai > 39 and nilai <= 50:
        print(f"Nilai mahasiswa ke-{i + 1} adalah D")
    else:
        print(f"Nilai mahasiswa ke-{i + 1} adalah E")

    i += 1
