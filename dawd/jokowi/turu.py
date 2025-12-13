from tabulate import tabulate

print("===== INPUT STUDENT DATA =====")
name = input("Name: ")
nim = input("NIM: ")

print("--- Course 1: Algorithms and Programming ---")
midterm = float(input("Input Midterm Score: "))
finalSemester = float(input("Input Final Semester Exam Score: "))
assignment = float(input("Input Assignment Score: "))

finalScore1 = (midterm * 0.3) + (finalSemester * 0.4) + (assignment * 0.3)

print("--- Course 2: Data Structures ---")
midterm2 = float(input("Input Midterm Score: "))
finalSemester2 = float(input("Input Final Semester Exam Score: "))
assignment2 = float(input("Input Assignment Score: "))

finalScore2 = (midterm2 * 0.3) + (finalSemester2 * 0.4) + (assignment2 * 0.3)

average = (finalScore1 + finalScore2) / 2

if (finalScore1 > 80): grade1 = "A"
elif (finalScore1 >= 73): grade1 = "B+"
elif (finalScore1 >= 65): grade1 = "B"
elif (finalScore1 >= 60): grade1 = "C+"
elif (finalScore1 >= 50): grade1 = "C"
elif (finalScore1 >= 39): grade1 = "D"
else: print("E")

if (finalScore2 > 80): grade2 = "A"
elif (finalScore2 >= 73): grade2 = "B+"
elif (finalScore2 >= 65): grade2 = "B"
elif (finalScore2 >= 60): grade2 = "C+"
elif (finalScore2 >= 50): grade2 = "C"
elif (finalScore2 >= 39): grade2 = "D"
else: print("E")

status1 = "PASSED" if finalScore1 >= 60 else "NOT PASSED"
status2 = "PASSED" if finalScore2 >= 60 else "NOT PASSED"

statusSemester = "PASSED" if average >= 70 else "NOT PASSED"

print("================== ACADEMIC ASSESSMENT RESULTS ==================")

print("Name: "+ name)
print("NIM: " + nim)

data = [
    ["Programming Algorithm", midterm, finalSemester, assignment, finalScore1,grade1,status1 ],
    ["Data Structure", midterm2, finalSemester2, assignment2, finalScore2, grade2, status2],
]
headers = ["Subject", "Midterm Test", "Final Exam", "Assignment", "Final Score", "Letter Grade", "Status"]

print(tabulate(data, headers=headers, tablefmt="grid"))
print("Average Final Score: " + str(average))
print("Semester Status: " + statusSemester)
