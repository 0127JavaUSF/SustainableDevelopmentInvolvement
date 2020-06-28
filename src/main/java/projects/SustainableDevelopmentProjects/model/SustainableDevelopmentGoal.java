package projects.SustainableDevelopmentProjects.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="SD_SustainableDevelopmentGoals_762")
public class SustainableDevelopmentGoal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SD_Goal_Id")
	private long id;
	
	@Column(name="SD_Goal_Name", length=100)
	@Size(max=100, message="Goal name should be no longer than 100 characters.")	
	private String goalName;
		
	public SustainableDevelopmentGoal() {}

	public SustainableDevelopmentGoal(long id, String goalName) {
		super();
		this.id = id;
		this.goalName = goalName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGoalName() {
		return goalName;
	}

	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}

	@Override
	public String toString() {
		return "SustainableDevelopmentGoals [id=" + id + ", goalName=" + goalName + "]";
	}
	
	
	
	

}
