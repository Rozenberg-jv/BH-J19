package by.belhard.j19.lessons.lesson12.prep.try2.services;

import by.belhard.j19.lessons.lesson12.prep.try2.DBManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeesService {

	private static final String INSERT_NEW_USER_QUERY =
			"insert into employees value (null, ?, default, ?, ?);";


	public void addNewEmployee(String name, int salary, int specialtyId) throws SQLException {

		Connection connection = DBManager.getConnection();
		PreparedStatement statement = connection.prepareStatement(INSERT_NEW_USER_QUERY);
		statement.setString(1, name);
		statement.setInt(2, salary);
		statement.setInt(3, specialtyId);

		statement.execute();
	}

}
