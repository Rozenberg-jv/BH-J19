package by.belhard.j19.lessons.lesson12.prep.try2.entities;

import java.util.Date;

public class Employee {

    private int id;

    private String name;

    private Date startDate;

    private int salary;

    private Specialty specialty;

    public Employee(int id, String name, Date startDate, int salary, Specialty specialty) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.salary = salary;
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", salary=" + salary +
                ", specialty=" + specialty +
                '}';
    }
}
