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
	private Long goal_id;		
	
	public SustainableDevelopmentProject() {}

	public SustainableDevelopmentProject(long id,
			@Size(max = 255, message = "Project name should be no longer than 255 characters.") String name,
			@Size(max = 1000, message = "Project description should be no longer than 1,000 characters.") String description,
			@Size(max = 100, message = "Project URL should be no more than 100 characters.") String url,
			@Size(max = 1000, message = "Comments should be no longer than 1,000 characters.") String comments,
			Long goal_id) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.url = url;
		this.comments = comments;
		this.goal_id = goal_id;
	}

	@Override
	public String toString() {
		return "SustainableDevelopmentProject [id=" + id + ", name=" + name + ", description=" + description + ", url="
				+ url + ", comments=" + comments + ", goal_Id=" + goal_id + "]";
	}

	//Remember the getters and setters.
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Long getGoal_id() {
		return goal_id;
	}

	public void setGoal_id(Long goal_id) {
		this.goal_id = goal_id;
	}
	
	
	
	
}
