package projects.SustainableDevelopmentProjects.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import projects.SustainableDevelopmentProjects.model.SustainableDevelopmentGoal;
import projects.SustainableDevelopmentProjects.model.repository.SustainableDevelopmentGoalsRepository;

@RestController
public class GoalController {
	@Autowired SustainableDevelopmentGoalsRepository goalRepository;
	
	@GetMapping("/goals")
	public List<SustainableDevelopmentGoal> getAllGoals(){		
		return goalRepository.findAll();
	}

}
