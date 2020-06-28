package projects.SustainableDevelopmentProjects;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import projects.SustainableDevelopmentProjects.model.EmployeeProfile;
import projects.SustainableDevelopmentProjects.model.SustainableDevelopmentGoal;
import projects.SustainableDevelopmentProjects.model.SustainableDevelopmentProject;
import projects.SustainableDevelopmentProjects.model.repository.EmployeeProfileRepository;
import projects.SustainableDevelopmentProjects.model.repository.SustainableDevelopmentGoalsRepository;
import projects.SustainableDevelopmentProjects.model.repository.SustainableDevelopmentProjectsRepository;

@SpringBootApplication
public class SustainableDevelopmentProjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SustainableDevelopmentProjectsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner Goals_Initialization(SustainableDevelopmentGoalsRepository goalRepository) {
		return (args) -> {
			SustainableDevelopmentGoal goal1 = new SustainableDevelopmentGoal(1L, "No Poverty");
			SustainableDevelopmentGoal goal2 = new SustainableDevelopmentGoal(2L, "Zero Hunger");
			SustainableDevelopmentGoal goal3 = new SustainableDevelopmentGoal(3L, "Good Health and Well-Being");
			SustainableDevelopmentGoal goal4 = new SustainableDevelopmentGoal(4L, "Quality Education");
			SustainableDevelopmentGoal goal5 = new SustainableDevelopmentGoal(5L, "Gender Equality");
			SustainableDevelopmentGoal goal6 = new SustainableDevelopmentGoal(6L, "Clean Water and Sanitation");
			SustainableDevelopmentGoal goal7 = new SustainableDevelopmentGoal(7L, "Affordable and Clean Energy");
			SustainableDevelopmentGoal goal8 = new SustainableDevelopmentGoal(8L, "Decent Work and Economic Growth");
			SustainableDevelopmentGoal goal9 = new SustainableDevelopmentGoal(9L, "Industry, Innovation and Infrastructure");
			SustainableDevelopmentGoal goal10 = new SustainableDevelopmentGoal(10L, "Reduced Inequalities");
			SustainableDevelopmentGoal goal11 = new SustainableDevelopmentGoal(11L, "Sustainable Cities and Communities");
			SustainableDevelopmentGoal goal12 = new SustainableDevelopmentGoal(12L, "Responsible Consumption and Production");
			SustainableDevelopmentGoal goal13 = new SustainableDevelopmentGoal(13L, "Climate Action");
			SustainableDevelopmentGoal goal14 = new SustainableDevelopmentGoal(14L, "Life Below Water");
			SustainableDevelopmentGoal goal15 = new SustainableDevelopmentGoal(15L, "Life On Land");
			SustainableDevelopmentGoal goal16 = new SustainableDevelopmentGoal(16L, "Peace, Justice and Strong Institutions");
			SustainableDevelopmentGoal goal17 = new SustainableDevelopmentGoal(17L, "Partnerships for the Goals");
			goalRepository.save(goal1);
			goalRepository.save(goal2);
			goalRepository.save(goal3);
			goalRepository.save(goal4);
			goalRepository.save(goal5);
			goalRepository.save(goal6);
			goalRepository.save(goal7);
			goalRepository.save(goal8);
			goalRepository.save(goal9);
			goalRepository.save(goal10);
			goalRepository.save(goal11);
			goalRepository.save(goal12);
			goalRepository.save(goal13);
			goalRepository.save(goal14);
			goalRepository.save(goal15);
			goalRepository.save(goal16);
			goalRepository.save(goal17);
		};	
		
	}
	
	@Bean
	public CommandLineRunner Projects_Initialization(SustainableDevelopmentProjectsRepository projectsRepository) {
		return (args) ->{
			SustainableDevelopmentProject project1 = new SustainableDevelopmentProject(1L, "Zero Waste Items", "This project is created to provide an opportunity to store and find localisation information for every day items that are \"Zero Waste\", packaging included. In this context, \"Zero Waste\" means 100% made of materials recyclable or biodegradable.\n" + 
					"\n" + 
					"The Goal is to reduce the amount of waste reaching the landfills, in an intent to reach sustainable development.\n" + 
					"\n" + 
					"[NB: TODO: Need to put some light on the materials that are actually recycled locally, beyond the fact that the object has a recyclable logo.]", "https://github.com/jlmacle/ZeroWasteItems_Backend", "", 12L);
			projectsRepository.save(project1);
		};		
	}
	
	@Bean
	public CommandLineRunner Users_Initialization(EmployeeProfileRepository employeeProfileRepository) {
		
		return (args) -> {
			EmployeeProfile employeeProfile = new EmployeeProfile(1L, "JL", "M", 1L);
			employeeProfileRepository.save(employeeProfile);
		};
	
	}

}
