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

import projects.SustainableDevelopmentProjects.model.EmployeeInvolvementProfile;
import projects.SustainableDevelopmentProjects.model.repository.EmployeeInvolvementProfileRepository;
import projects.SustainableDevelopmentProjects.utilities.SortInvolvementProfileByName;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class EmployeeController {
	@Autowired EmployeeInvolvementProfileRepository employeeInvolvementProfileRepository;
	
	@PostMapping("/employees")
	public @ResponseBody ResponseEntity<EmployeeInvolvementProfile> 
		createNewEmployeeInvolvementProfile(@RequestBody EmployeeInvolvementProfile involvementProfile){
		EmployeeInvolvementProfile transactionResult = employeeInvolvementProfileRepository.save(involvementProfile);
		return new ResponseEntity<EmployeeInvolvementProfile>(transactionResult, HttpStatus.CREATED);
	}
	
	@GetMapping("/employees")
	public List<EmployeeInvolvementProfile> listAllEmployeeInvolvement(){
		List<EmployeeInvolvementProfile> results = employeeInvolvementProfileRepository.findAll();
		results.sort(new SortInvolvementProfileByName());
		System.out.println(results);
		return results;
	}
		

}
