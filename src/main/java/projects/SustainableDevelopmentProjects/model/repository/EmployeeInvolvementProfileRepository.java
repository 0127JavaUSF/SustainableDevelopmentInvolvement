package projects.SustainableDevelopmentProjects.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import projects.SustainableDevelopmentProjects.model.EmployeeInvolvementProfile;

public interface EmployeeInvolvementProfileRepository extends JpaRepository<EmployeeInvolvementProfile, Long> {
	List<EmployeeInvolvementProfile> findByOrderByLastNameAsc();
}
