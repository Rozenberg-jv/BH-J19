package by.belhard.j19.lessons.lesson12.prep.try2;

import by.belhard.j19.lessons.lesson12.prep.try2.services.IOService;
import by.belhard.j19.lessons.lesson12.prep.try2.services.SpecialtiesService;
import by.belhard.j19.lessons.lesson12.prep.try2.services.EmployeesService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.NoSuchElementException;

public class MainMenu {

	private final IOService ioService;
	private final EmployeesService employeesService;
	private final SpecialtiesService specialtiesService;

	public MainMenu() {

		this.ioService = new IOService();
		this.employeesService = new EmployeesService();
		this.specialtiesService = new SpecialtiesService();
	}

	public void start() {

		String mainInput = "";

		do {
			try {
				ioService.printMainMenu();
				mainInput = ioService.getInputString();

				switch (mainInput) {
				case "1":
					System.out.println("Enter name");
					String name = ioService.getInputString();
					System.out.println("Enter salary");
					int salary = ioService.getInputInt();
					System.out.println("Enter specialty");
					String specialty = ioService.getInputString();
					int specialtyId = specialtiesService.getIdBySpecialty(specialty);
					employeesService.addNewEmployee(name, salary, specialtyId);
					break;
				case "2":
					break;
				case "3":
					break;
				case "e":
					break;
				default:
					System.out.println("Wrong input");
				}

			} catch (NoSuchElementException e) {
				System.err.println("There is no such entity: " + e.getMessage());
			} catch (IOException | NumberFormatException | SQLException e) {
				System.err.println("Error: " + e.getMessage());
			}
		} while (!mainInput.equals("e"));
	}

}
