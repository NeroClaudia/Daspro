names = []
studentIds = []
gpas = []
scholarshipTypes = []
parentIncomes = []
currentCount = 0

maxApplicant = int(input("Input Jumlah Pendaftar: "))
print()

def displayMenu():
    print("====================================")
    print("\tSCHOLARSHIP REGISTRATION")
    print("====================================")
    print("1. Add New Applicant");
    print("2. Show all Applicants");
    print("3. Show Applicants by Scholarship Type");
    print("4. ACalculate Average GPA per Scholarship Type");
    print("0. Exit");

def addNewApplicant():
    global currentCount
    if (currentCount >= maxApplicant):
        print("Pendaftaran Sudah Penuh")
        return
    
    print("=== Add New Applicant ===")
    name = input("Student Name: \t")
    studentId = input("Student ID: ")
    gpa = float(input("Your Last GPA: "))

    print("=== Choose Scholarship Type ===")
    print("1. Regular")
    print("2. Excellent")
    print("3. Research")
    scholarshipType = int(input("Input Your Scholarship Type: "))

    parentIncome = int(input("Input Your Parent Income (Max 2000000): "))

    names.append(name)
    studentIds.append(studentId)
    gpas.append(gpa)
    scholarshipTypes.append(scholarshipType)
    parentIncomes.append(parentIncome)

    currentCount += 1
    print(">> Applicant data has been added.")

def getScholarshipByName(type_num):
    if (type_num) == 1:
        return "Regular"
    elif (type_num) == 2:
        return "Excellent"
    elif (type_num) == 3:
        return "Research"
    else:
        return "Unknown"
    
def showAllApplicant():
    print("\n=== List of All Scholarship Applicants ===")
    print("No\tName\t\t\tStudent ID\t\tGPA\tType\t\tIncome")
    print("-------------------------------------------------------------------------")

    for i in range(currentCount):
        typeName = getScholarshipByName(scholarshipTypes[i])
        print(f"{i+1}\t{names[i]:<20}\t{studentIds[i]:<20}\t{gpas[i]:.1f}\t{typeName:<14}\t{parentIncomes[i]}")

def searchByScholarshipType():
    print("\n=== Search Applicants by Scholarship Type ===")
    print("1. Regular")
    print("2. Excellent")
    print("3. Research")
    searchType = int(input("Input Choice: "))

    print("\n=== Applicant for ", getScholarshipByName(searchType), "scholarship ===")
    print("No\tName\t\t\tStudent ID\t\tGPA\t\tIncome")
    print("-------------------------------------------------------------------------")

    count = 0
    for i in range(currentCount):
        if (scholarshipTypes[i] == searchType):
            count += 1
            print(f"{i+1}\t{names[i]:<20}\t{studentIds[i]:<20}\t{gpas[i]:.1f}\t{parentIncomes[i]}")

        if (count == 0):
            print("No Applicant Found")

def calculateAverageGpa():
    print("\n=== Average GPA per Scholarship Type ===")

    for type_num in range(1, 4):
        total = 0
        count = 0
        for i in range(currentCount):
            if (scholarshipTypes[i] == type_num):
                total += gpas[i]
                count += 1

        if (count == 0):
            print("No applicant for ", getScholarshipByName(type_num), "Scholarship")

        else:
            average = total / count
            print(f"Average GPA for {getScholarshipByName(type_num)} scholarship: {average:.1f}")


choice = -1
while (choice != 0):
    displayMenu()
    choice = int(input("Your Choice: "))

    if (choice == 1):
        addNewApplicant()
    elif (choice == 2):
        showAllApplicant()
    elif (choice == 3):
        searchByScholarshipType()
    elif (choice == 4):
        calculateAverageGpa()
    elif (choice == 0):
        print("Thank You")
    else:
        print("Invalid Choice")



