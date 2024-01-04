var employees = [
    {
        "id": 11,
        "name": "Abhinav",
        "salary": 75000
    },
    {
        "id": 2131,
        "name": "Gaurav",
        "salary": 62000
    },
    {
        "id": 3012,
        "name": "Raj",
        "salary": 32000
    }
];
var salaryAbove40K = employees.filter(function (employee) { return employee.salary > 40000; });
console.log(salaryAbove40K); //Array will contain objects whose salary is greater than 40000.
var employeeList = [
    {
        "id": 4,
        "salary": 400
    },
    {
        "id": 3,
        "salary": 300
    },
    {
        "id": 1,
        "salary": 900
    }
];
var filterSalaryEmployee = employeeList.filter(function (emp) { return emp.salary > 350; });
console.log(filterSalaryEmployee);
