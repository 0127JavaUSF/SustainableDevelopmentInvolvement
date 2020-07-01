package projects.SustainableDevelopmentProjects.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import projects.SustainableDevelopmentProjects.model.SustainableDevelopmentProject;
import projects.SustainableDevelopmentProjects.model.repository.SustainableDevelopmentProjectsRepository;
import projects.SustainableDevelopmentProjects.utilities.SortProjectsByName;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ProjectController {
	@Autowired SustainableDevelopmentProjectsRepository projectRepository;
	
	@GetMapping("/projects")
	public List<SustainableDevelopmentProject> getAllProject() {
		List<SustainableDevelopmentProject> results = projectRepository.findAll();
		results.sort(new SortProjectsByName());
		return results;
	}
	
	@PostMapping("/projects")
	public @ResponseBody ResponseEntity<SustainableDevelopmentProject> createProjectReference(@RequestBody SustainableDevelopmentProject project) {
		SustainableDevelopmentProject transactionResult = projectRepository.save(project);	
		return new ResponseEntity<SustainableDevelopmentProject>(transactionResult, HttpStatus.CREATED);
	}

}
