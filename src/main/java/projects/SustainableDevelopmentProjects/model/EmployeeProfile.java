package projects.SustainableDevelopmentProjects.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Size;

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
	
	@JoinColumn(name="project_id", referencedColumnName = "SD_Project_Id")
	@Column(name="project_id")
	private Long project_Id;
	
	public EmployeeProfile(long id,
			@Size(max = 80, message = "First name should not be longer than 80 characters.") String firstName,
			@Size(max = 80, message = "Last name should not be longer than 80 characters.") String lastName,
			Long project_Id) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.project_Id = project_Id;
	}


	public EmployeeProfile() {}
	
	
	

}
