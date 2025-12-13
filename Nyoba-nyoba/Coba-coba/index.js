const prompt = require(`prompt-sync`) ();
const Table = require(`cli-table3`)

console.log("========== INPUT STUDENT DATA =========");
const name = prompt("Input Name: ")
const nim = Number(prompt("Input NIM: "))

console.log("----- Course 1: Algorithms and Programming -----");

let midterm = Number(prompt("Input Midterm Score: "))
let finalSemester = Number(prompt("Input Final Semester Exam Score: "))
let assigment = Number(prompt("Input Assignment Score: "))

let finalScore1 = (midterm * 0.3) + (finalSemester * 0.4) + (assigment * 0.3)
console.log("----- Course 2: Data Structures -----");

let midterm2 = Number(prompt("Input Midterm Score: "))
let finalSemester2 = Number(prompt("Input Final Semester Exam Score: "))
let assigment2 = Number(prompt("Input Assignment Score: "))

let finalScore2 = (midterm2 * 0.3) + (finalSemester2 * 0.4) + (assigment2 * 0.3)

let average = (finalScore1 + finalScore2) / 2

let grade1, grade2
if (finalScore1 >= 80) grade1 = "A"
else if (finalScore1 >= 73) grade1 = "B+"
else if (finalScore1 >= 65) grade1 = "B"
else if (finalScore1 >= 60) grade1 = "C+"
else if (finalScore1 >= 50) grade1 = "C"
else if (finalScore1 >= 39) grade1 = "D"
else grade1 = "E"

if (finalScore2 >= 80) grade2 = "A"
else if (finalScore2 >= 73) grade2 = "B+"
else if (finalScore2 >= 65) grade2 = "B"
else if (finalScore2 >= 60) grade2 = "C+"
else if (finalScore2 >= 50) grade2 = "C"
else if (finalScore2 >= 39) grade2 = "D"
else grade2 = "E"

let status1, status2

status1 = (finalScore1 >= 60) ? "PASSED" : "NOT PASSED"
status2 = (finalScore2 >= 60) ? "PASSED" : "NOT PASSED"

let statusSemester = (average >= 70) ? "PASSED" : "NOT PASSED (Score < 70)"

console.log("================== ACADEMIC ASSESSMENT RESULTS ==================");
console.log(`Name: ${name}`);
console.log(`NIM: ${nim}`);
console.log(" ");

const table = new Table({
    head: ["Subject", "Midterm Test", "Final Exam", "Assignment", "Final Score", "Letter Grade", "Status"]
});

table.push(
    ["Programming Algorithm", midterm, finalSemester, assigment, finalScore1, grade1, status1],
    ["Data Structure", midterm2, finalSemester2, assigment2, finalScore2, grade2, status2]
);
console.log(table.toString());
console.log(`Average Final Score: ${average}`);
console.log(`Semester Status: ${statusSemester}`);