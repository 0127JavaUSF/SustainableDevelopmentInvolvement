package projects.SustainableDevelopmentProjects.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import projects.SustainableDevelopmentProjects.model.SustainableDevelopmentGoal;
import projects.SustainableDevelopmentProjects.model.repository.SustainableDevelopmentGoalsRepository;
import projects.SustainableDevelopmentProjects.utilities.SortGoalsByName;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class GoalController {
	@Autowired SustainableDevelopmentGoalsRepository goalRepository;
	
	@GetMapping("/goals")
	public List<SustainableDevelopmentGoal> getAllGoals(){	
		List <SustainableDevelopmentGoal> goals = goalRepository.findAll();		
		goals.sort(new SortGoalsByName());		
		System.out.println(goals);
		return goals;
	}

}
