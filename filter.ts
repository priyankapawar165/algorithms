let employees = [
    {
        "id": 11,
        "name":"Abhinav",
        "salary":75000
    },
    {
        "id": 2131,
        "name":"Gaurav",
        "salary":62000
    },
    {
        "id": 3012,
        "name":"Raj",
        "salary":32000
    }];



let salaryAbove40K = employees.filter(employee => employee.salary > 40000)
console.log(salaryAbove40K) //Array will contain objects whose salary is greater than 40000.


let employeeList = [

    {
        "id":4,
        "salary": 400
    },
    {
        "id":3,
        "salary": 300
    },
    {
        "id": 1,
        "salary" : 900
    }
];


let filterSalaryEmployee = employeeList.filter(emp=> emp.salary > 350);

console.log(filterSalaryEmployee);


let studentList=[
    {
        "id":1,
        "age":17
    },
    {
        "id":2,
        "age":18
    },
    {
        "id":3,
        "age":21

    }
];
let filterAgeStudent= studentList.filter(student=>student.age>20);
console.log(filterAgeStudent);

let collegeRatingList=[
    {
        "name":"xyz",
        "rating":5

    },
    {
        "name":"abc",
        "rating":7
    },
    {
        "name":"stu",
        "rating":10

    },
    {
        "name":"qrt",
        "rating":9
    }
];
let filterCollegeRating=collegeRatingList.filter(college=>college.rating>5);
console.log(filterCollegeRating);

let mammalsList=[
    {
        "Age":20,
        "weight":100
    },
    {
        "Age":25,
        "weight":125
    },
    {
        "Age":30,
        "weight":130
    }
];
let filterMammalWeight=mammalsList.filter(mammals=>mammals.weight>123);
console.log(filterMammalWeight);

