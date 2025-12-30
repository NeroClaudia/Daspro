const tampilMenu = () => {
    console.log("====================================");
    console.log("\tSCHOLARSHIP REGISTRATION");
    console.log("====================================");
    console.log("1. Add new applicant");
    console.log("2. Show all applicant");
    console.log("3. Show Applicants by Scholarship Type");
    console.log("4. Calculate Average GPA per Scholarship Type");
    console.log("0. Exit");
};
const menuPilihan = () => {
    const readline = require("readline");

    const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
    rl.question("Pilih Menu: ", (choice) => {
        const pilihan = Number(choice);
    
    
        switch (pilihan) {

            case 1:
                console.log("Halo");
                break;
            case 2:
                console.log("Niga");
                break;

            case 3:
                console.log("Asu");
                break;
                
            case 4:
                console.log("Kontol");
                break;

            case 0:
                console.log("Bajingan");
                break;

            default:
                console.log("Nero");
        };
        rl.close();
    });
};
tampilMenu();
menuPilihan();
