package projects.SustainableDevelopmentProjects.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SustainableDevelopmentGoals_762")
public class SustainableDevelopmentGoals {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Goal_Name")
	private String goalName;

	public SustainableDevelopmentGoals(long id, String goalName) {
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
