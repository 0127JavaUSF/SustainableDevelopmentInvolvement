package projects.SustainableDevelopmentProjects.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projects.SustainableDevelopmentProjects.model.EmployeeInvolvementProfile;

public interface EmployeeProfileRepository extends JpaRepository<EmployeeInvolvementProfile, Long> {
	
}
