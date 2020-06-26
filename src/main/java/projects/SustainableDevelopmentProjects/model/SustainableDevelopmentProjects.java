package projects.SustainableDevelopmentProjects.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;

@Entity
public class SustainableDevelopmentProjects {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="SD_Project_Name", length=255)
	@Max(value=255, message="Project name should be no longer than 255 characters.")
	private String name;
	
	@Column(name="SD_Project_Description", length=1000)
	@Max(value=1000, message="Project description should be no longer than 1,000 characters.")
	private String description;
	
	@Column(name="SD_Project_URL", length=100)
	@Max(value=100, message="Project URL should be no more than 100 characters.")
	private String url;
	
	@Column(name="SD_Project_Comments",length = 1000)
	@Max(value=1000, message="Comments should be no longer than 1,000 characters.")
	private String comments;

}
