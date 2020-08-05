package projects.SustainableDevelopmentProjects.utilities;

import java.util.Comparator;

import projects.SustainableDevelopmentProjects.model.SustainableDevelopmentProject;

public class SortProjectsByName implements Comparator<SustainableDevelopmentProject>{

	@Override
	public int compare(SustainableDevelopmentProject o1, SustainableDevelopmentProject o2) {
		return o1.getName().compareTo(o2.getName());
	}
	

}
