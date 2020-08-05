package projects.SustainableDevelopmentProjects.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import projects.SustainableDevelopmentProjects.model.EmployeeInvolvementProfile;
import projects.SustainableDevelopmentProjects.model.SustainableDevelopmentProject;
import projects.SustainableDevelopmentProjects.model.repository.SustainableDevelopmentProjectsRepository;
import projects.SustainableDevelopmentProjects.utilities.SortProjectsByName;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ProjectController {
	@Autowired SustainableDevelopmentProjectsRepository projectRepository;
	
	@GetMapping("/projects")
	public List<SustainableDevelopmentProject> getAllProjects() {
		List<SustainableDevelopmentProject> results = projectRepository.findAll();
		results.sort(new SortProjectsByName());
		
		return results;
	}
	
	@GetMapping("/projects/{id}")
	public Optional<SustainableDevelopmentProject> getProjectById(@PathVariable("id") long id) {
		return projectRepository.findById(1L);
	}
		
	@PostMapping("/projects")
	public @ResponseBody ResponseEntity<SustainableDevelopmentProject> createProjectReference(@RequestBody SustainableDevelopmentProject project) {
		System.out.println(project.toString());
		SustainableDevelopmentProject transactionResult = projectRepository.save(project);	
		return new ResponseEntity<SustainableDevelopmentProject>(transactionResult, HttpStatus.CREATED);
	}
	
	

}
