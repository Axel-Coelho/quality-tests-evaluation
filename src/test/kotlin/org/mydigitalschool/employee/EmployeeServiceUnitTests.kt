package org.mydigitalschool.employee

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mydigitalschool.employee.employee.Employee
import org.mydigitalschool.employee.employee.EmployeeService
val employees = listOf(
    Employee("John", 25),
    Employee("Ethan", 16),
    Employee("Sophia", 17),
    Employee("Daniel", 35),
    Employee("Mike", 28),
    Employee("Charles", 15),
    Employee("Nina", 24)
)

class EmployeeServiceUnitTests {

    val employeeService: EmployeeService = EmployeeService()

    @Test
    fun `obtenir la liste des employés majeurs, afin de savoir qui sera disponible le dimanche`() {
        //GIVEN
        //WHEN
        val actual = employeeService.findAdultes(employees)
        //THEN
        Assertions.assertEquals(listOf(
            Employee("John", 25),
            Employee("Daniel", 35),
            Employee("Mike", 28),
            Employee("Nina", 24) ), actual)
    }

    @Test
    fun `lister les employés par ordre alphabétique de leur nom, afin de les retrouver plus facilement`() {
        //GIVEN
        //WHEN
        val actual = employeeService.sortEmployees(employees)
        //THEN
        Assertions.assertEquals(listOf(
            Employee("Charles", 15),
            Employee("Daniel", 35),
            Employee("Ethan", 16),
            Employee("John", 25),
            Employee("Mike", 28),
            Employee("Nina", 24),
            Employee("Sophia", 17) ), actual)
    }

    @Test
    fun `obtenir la liste en majuscules des noms des employés afin de lire plus facilement`() {
        //GIVEN
        //WHEN
        val actual = employeeService.capitalizeNames(employees)
        //THEN
        Assertions.assertEquals(listOf(
            Employee("JOHN", 25),
            Employee("ETHAN", 16),
            Employee("SOPHIA", 17),
            Employee("DANIEL", 35),
            Employee("MIKE", 28),
            Employee("CHARLES", 15),
            Employee("NINA", 24) ), actual)
    }
}

