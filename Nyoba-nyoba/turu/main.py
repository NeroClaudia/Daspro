import sympy as sp

# 1️⃣ Definisikan variabel dan fungsi
x = sp.Symbol('x')
f = 3*x**3 - 5*x**2 + 2*x - 7

# 2️⃣ Turunan pertama dan kedua
turunan_1 = sp.diff(f, x)
turunan_2 = sp.diff(f, x, 2)

# 3️⃣ Nilai turunan pertama saat x = 2
nilai_turunan_x2 = turunan_1.subs(x, 2)

# 4️⃣ Integral tak tentu
integral_f = sp.integrate(f, x)

# 5️⃣ Tampilkan hasil
print("f(x) =", f)
print("f'(x) =", turunan_1)
print("f''(x) =", turunan_2)
print("f'(2) =", nilai_turunan_x2)
print("∫f(x)dx =", integral_f)
