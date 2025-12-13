from tabulate import tabulate

bikePrice = 1000000
discount = 0.05

month = ["Jan", "Feb", "Maret", "April"]
name = ["Sito", "Semi", "Risma", "Vero", "Barri"]

sales = [
    [2, 3, 4, 6],
    [3, 3, 3, 2],
    [4, 4, 5, 5],
    [1, 3, 3, 8],
    [2, 2, 2, 2],
]

hasil = [[0 for _ in range(len(sales[0]))] for _ in range(len(sales))]

for i in range(len(sales)):
    for j in range(len(sales[0])):
        hasil[i][j] = sales[i][j] * bikePrice

for i in range(len(sales)):
    hasil[i][1] = hasil[i][1] - (hasil[i][1] * discount)

totalPerBulan = [0 for _ in range(len(sales[0]))]

for j in range(len(sales[0])):
    total = 0
    for i in range(len(sales)):
        total += hasil[i][j]

totalPerBulan[j] = total

print("========== Monthly Sales =========")
print("Menu:")
print("1. Show Sales Summary")
print("2. Show Total Sales per Month")
print("3. Exit")

menu = input("Select Menu: ")

if (menu == 1):
    print(f":-10s", "    ")

