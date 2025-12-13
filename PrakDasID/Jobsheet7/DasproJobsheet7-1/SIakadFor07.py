highest = 0
lowest = 100

for i in range(10):
    grade = float(input(f"Enter the grade of the {i+1} Student: "))

    if grade > highest:
        highest = grade

    if grade < lowest:
        lowest = grade

print(f"The Highest Grade: {highest}")
print(f"The Lowest Grade: {lowest}")
