package fr.formation.collaborator.business;

import java.time.LocalDate;

import javax.validation.constraints.Future;

import org.springframework.lang.NonNull;

// Test Tomas pull
//test
//Tu dois pull avant de push Catherine !!!!!!
public class CollaboratorPatch {

    @Future
    @NonNull
    private LocalDate endDate;

    public LocalDate getEndDate() {
	return endDate;
    }

    public void setEndDate(LocalDate endDate) {
	this.endDate = endDate;
    }
}
