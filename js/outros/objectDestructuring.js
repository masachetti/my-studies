function getApprovedStudents(students, finalMean){
    let meanCalculation = ({score1, score2, score3}) => (score1+score2+score3)/3;
    let approvedStudents = [];
    for (const student of students) {
        let scoreMean = meanCalculation(student).toPrecision(2);
        if (scoreMean >= finalMean){
            student.scoreMean = scoreMean 
            approvedStudents.push(student);
        }
    }
    return approvedStudents;
}

var createStudent = function (name, score1, score2, score3) {return {name:name, score1:score1, score2:score2, score3:score3}};
var student1 = createStudent('Maria', 9, 8, 7);
var student2 = createStudent('João', 5, 6, 10);
var student3 = createStudent('Igor', 3, 4, 5);
var student4 = createStudent('Fabio', 9, 10, 8);
var student5 = createStudent('Elena', 7, 7, 7);
var student6 = createStudent('Bia', 10, 8, 4);

var arrayOfStudents = [student1, student2, student3, student4, student5, student6];
console.log(arrayOfStudents);
console.log(getApprovedStudents(arrayOfStudents, 8));


