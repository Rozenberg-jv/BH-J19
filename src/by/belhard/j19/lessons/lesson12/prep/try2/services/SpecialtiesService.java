package by.belhard.j19.lessons.lesson12.prep.try2.services;

import by.belhard.j19.lessons.lesson12.prep.try2.DBManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.NoSuchElementException;

public class SpecialtiesService {

	private static final String GET_ID_BY_SPECIALTY_QUERY =
			"select id from specialties where specialty = ?";

	public int getIdBySpecialty(String specialty) throws SQLException {

		PreparedStatement preparedStatement =
				DBManager.getConnection().prepareStatement(GET_ID_BY_SPECIALTY_QUERY);

		preparedStatement.setString(1, specialty);

		ResultSet resultSet = preparedStatement.executeQuery();

		if (!resultSet.next())
			throw new NoSuchElementException("specialty with name " + specialty);

		return resultSet.getInt("id");
	}
}
