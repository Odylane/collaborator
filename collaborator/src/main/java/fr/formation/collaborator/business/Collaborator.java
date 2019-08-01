package fr.formation.collaborator.business;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

// test n°2
// Test 3
public class Collaborator {

    private Long id;

    @Size(max = 10, message = "The field must be max {max} characters")
    private String internalId;

    @Size(max = 150, message = "The field must be max {max} characters")
    private String firstName, lastName;

    @Past
    private LocalDate birthDate;

    @PastOrPresent
    private LocalDate startDate;

    @Positive
    private double salary;

    @Future
    private LocalDate endDate;

    public LocalDate getEndDate() {
	return endDate;
    }

    public void setEndDate(LocalDate endDate) {
	this.endDate = endDate;
    }

    public Collaborator(String internalId, String firstName, String lastName,
	    LocalDate birthDate, LocalDate startDate, double salary,
	    LocalDate endDate) {
	this.internalId = internalId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.birthDate = birthDate;
	this.startDate = startDate;
	this.salary = salary;
	this.endDate = endDate;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getInternalId() {
	return internalId;
    }

    public void setInternalId(String internalId) {
	this.internalId = internalId;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
    }

    public LocalDate getStartDate() {
	return startDate;
    }

    public void setStartDate(LocalDate startDate) {
	this.startDate = startDate;
    }

    public double getSalary() {
	return salary;
    }

    public void setSalary(double salary) {
	this.salary = salary;
    }

    @Override
    public String toString() {
	return "Collaborator [id=" + id + ", internalId=" + internalId
		+ ", firstName=" + firstName + ", lastName=" + lastName
		+ ", birthDate=" + birthDate + ", startDate=" + startDate
		+ ", salary=" + salary + "]";
    }
}
