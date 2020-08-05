package projects.SustainableDevelopmentProjects.utilities;

import java.util.Comparator;

import projects.SustainableDevelopmentProjects.model.SustainableDevelopmentGoal;

public class SortGoalsByName implements Comparator<SustainableDevelopmentGoal> {

	@Override
	public int compare(SustainableDevelopmentGoal o1, SustainableDevelopmentGoal o2) {
		return o1.getGoalName().compareTo(o2.getGoalName());
	}
	
	

}
