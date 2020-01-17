package by.belhard.j19.lessons.lesson11;

import by.belhard.j19.lessons.lesson11.jdbcExample.services.EmployeesService;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        EmployeesService employeesService = new EmployeesService();

        employeesService.addNewEmployee("Victor", 5000, 1);


    }
}
