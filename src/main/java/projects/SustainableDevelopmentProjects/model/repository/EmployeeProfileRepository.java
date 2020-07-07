package projects.SustainableDevelopmentProjects.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projects.SustainableDevelopmentProjects.model.EmployeeInvolvementProfile;

public interface EmployeeProfileRepository extends JpaRepository<EmployeeInvolvementProfile, Long> {
	/*
	@Query(value="SELECT ep.project_id , ep.sd_first_name , ep.sd_last_name, sdp.sd_project_name, sdg.sd_goal_name FROM sd_employee_profile ep  \r\n" + 
			"INNER JOIN sd_sustainable_development_projects_73 sdp ON ep.project_id = sdp.sd_project_id \r\n" + 
			"INNER JOIN sd_sustainable_development_goals_762 sdg ON sdg.sd_goal_id = sdp.goal_id;", nativeQuery = true)
	
*/
}
