package fr.formation.collaborator.business;

import java.time.LocalDate;

import javax.validation.constraints.Future;

import org.springframework.lang.NonNull;

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
