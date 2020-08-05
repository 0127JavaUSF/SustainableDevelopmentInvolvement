package projects.SustainableDevelopmentProjects.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="SD_Employee_Profile")
public class EmployeeInvolvementProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SD_Employee_Id")
	@NotNull
	private long id;
	
	@Column(name="SD_First_Name", length=80)
	@Size(max=80, message="First name should not be longer than 80 characters.")
	private String firstName;
	
	@Column(name="SD_Last_Name", length=80)
	@Size(max=80, message="Last name should not be longer than 80 characters.")
	private String lastName;
//	
	@JoinColumn(name="project_id", referencedColumnName = "SD_Project_Id")
	@Column(name="project_id")
	@NotNull
	private Long projectId;
	
	public EmployeeInvolvementProfile(long id,
			@Size(max = 80, message = "First name should not be longer than 80 characters.") String firstName,
			@Size(max = 80, message = "Last name should not be longer than 80 characters.") String lastName,
			Long project_Id) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.projectId = project_Id;
	}


	public EmployeeInvolvementProfile() {}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Long getProjectId() {
		return projectId;
	}


	public void setProjectId(Long project_Id) {
		this.projectId = project_Id;
	}


	@Override
	public String toString() {
		return "EmployeeInvolvementProfile [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", projectId=" + projectId + "]";
	}
	
	
	

}
