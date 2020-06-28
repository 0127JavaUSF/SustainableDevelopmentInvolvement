package projects.SustainableDevelopmentProjects.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import projects.SustainableDevelopmentProjects.model.SustainableDevelopmentProject;

@Entity
@Table(name="SD_Employee_Profile")
public class EmployeeProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SD_Employee_Id")
	private long id;
	
	@Column(name="SD_First_Name", length=80)
	@Size(max=80, message="First name should not be longer than 80 characters.")
	private String firstName;
	
	@Column(name="SD_Last_Name", length=80)
	@Size(max=80, message="Last name should not be longer than 80 characters.")
	private String lastName;
	
	@OneToOne()
	@JoinTable(name="SD_Employee_Project", joinColumns = {@JoinColumn(name="SD_Employee_Id")},
	inverseJoinColumns = {@JoinColumn(name="SD_Project_Id")})
	private SustainableDevelopmentProject project;
	
	
	
	
	

}
