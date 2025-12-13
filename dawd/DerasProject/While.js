let grade, total, i = 1
const prompt = require('prompt-sync')

total = prompt("Enter the number of student: ")

while (i < total) {
    grade = prompt(`Enter the grade of the ${i+1}student: `)

    if (grade < 0 || grade > 100) {
        console.log("Invalid grade. Re-enter a valid grade!");
        continue
    }
    if (grade > 80 && grade <= 100) {
        console.log("The grade of the " + (i+1) + " student is A");
        console.log("Good, keep the grade");
    }else if (grade > 73 && grade <= 100) {
        console.log("The grade of the " + (i+1) + " student is B+");
    }else if (grade > 65 && grade <= 100) {
        console.log("The grade of the " + (i+1) + " student is B");
    }else if (grade > 60 && grade <= 100) {
        console.log("The grade of the " + (i+1) + " student is C+");
    }else if (grade > 50 && grade <= 100) {
        console.log("The grade of the " + (i+1) + " student is C");
    }else if (grade > 39 && grad <= 100) {
        console.log("The grade of the " + (i+1) + " student is D");
    }else {
        console.log("The grade of the " + (i+1) + " student is E");
    }
    i++
}