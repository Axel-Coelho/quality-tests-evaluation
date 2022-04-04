package org.mydigitalschool.employee.employee

class EmployeeService {

    fun findAdultes(employee: List<Employee>): List<Employee>{
        return employee.filter {it.age>=18}
    }

    fun sortEmployees(employees: List<Employee>): List<Employee> {
        return employees.sortedBy { it.name }
    }

    fun capitalizeNames(employees: List<Employee>): List<Employee> {
        return employees.map { Employee(it.name.uppercase(), it.age) }
    }

    fun sortEmployeesDescending(employees: List<Employee>) {

    }

    fun findWithAgeBetween(low: Int, high: Int) {

    }

    fun autocomplete(prefix: String) {

    }

}