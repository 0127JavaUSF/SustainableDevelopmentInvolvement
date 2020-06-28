package projects.SustainableDevelopmentProjects.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name="SD_SustainableDevelopmentProjects_73")
public class SustainableDevelopmentProject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SD_Project_Id")
	private long id;
	
	@Column(name="SD_Project_Name", length=255)
	@Size(max=255, message="Project name should be no longer than 255 characters.")
	private String name;
	
	@Column(name="SD_Project_Description", length=1000)
	@Size(max=1000, message="Project description should be no longer than 1,000 characters.")
	private String description;
	
	@Column(name="SD_Project_URL", length=100)
	@Size(max=100, message="Project URL should be no more than 100 characters.")
	private String url;
	
	@Column(name="SD_Project_Comments",length = 1000)
	@Size(max=1000, message="Comments should be no longer than 1,000 characters.")
	private String comments;
	
	@JoinColumn(name="Goal_Id", referencedColumnName = "SD_Goal_Id")	
	@Column(name="Goal_Id")
	private Long goal_Id;		
	
	public SustainableDevelopmentProject() {}

	public SustainableDevelopmentProject(long id,
			@Size(max = 255, message = "Project name should be no longer than 255 characters.") String name,
			@Size(max = 1000, message = "Project description should be no longer than 1,000 characters.") String description,
			@Size(max = 100, message = "Project URL should be no more than 100 characters.") String url,
			@Size(max = 1000, message = "Comments should be no longer than 1,000 characters.") String comments,
			Long goal_Id) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.url = url;
		this.comments = comments;
		this.goal_Id = goal_Id;
	}

	
	
	
}
