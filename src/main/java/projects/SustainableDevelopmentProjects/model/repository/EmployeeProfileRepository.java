package projects.SustainableDevelopmentProjects.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projects.SustainableDevelopmentProjects.model.EmployeeProfile;

public interface EmployeeProfileRepository extends JpaRepository<EmployeeProfile, Long> {

}
