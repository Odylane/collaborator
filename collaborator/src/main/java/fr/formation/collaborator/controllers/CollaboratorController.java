package fr.formation.collaborator.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.collaborator.business.Collaborator;
import fr.formation.collaborator.business.CollaboratorPatch;

@RestController
@RequestMapping("/collaborators")
public class CollaboratorController {

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createCollab(@RequestBody @Valid Collaborator collaborator) {
	System.out.println(collaborator);
    }

    @GetMapping("/{id}")
    public Collaborator collaborator(@PathVariable("id") String id) {
	Collaborator getCollab = new Collaborator("A123456789", "Michel",
		"Dupont", LocalDate.of(1975, 04, 12),
		LocalDate.of(2016, 03, 04), 250000, null);
	return getCollab;
    }

    @GetMapping()
    public List<Collaborator> getAll(@RequestParam("page") int page,
	    @RequestParam("size") int size) {
	List<Collaborator> collabs = new ArrayList<>();
	Collaborator collab1 = new Collaborator("Ag89", "Mel", "Dupovvvnt",
		LocalDate.of(1973, 04, 12), LocalDate.of(2010, 03, 04), 250000,
		null);
	collabs.add(collab1);
	Collaborator collab2 = new Collaborator("Ag89", "Mel", "Dvnt",
		LocalDate.of(1977, 04, 12), LocalDate.of(2005, 03, 06), 20000,
		null);
	collabs.add(collab2);
	return collabs;
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String id,
	    @RequestBody Collaborator collaborator) {
	System.out.println(collaborator);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
	System.out.println("User " + id + " deleted");
    }

    @PatchMapping("/{id}/enddate")
    public void patch(@Valid @PathVariable("id") String id,
	    @RequestBody CollaboratorPatch collabPatch) {
	System.out.println(collabPatch.getEndDate());
    }
}
