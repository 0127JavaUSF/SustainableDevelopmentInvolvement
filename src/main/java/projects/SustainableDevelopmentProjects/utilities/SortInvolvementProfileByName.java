package projects.SustainableDevelopmentProjects.utilities;

import java.util.Comparator;

import projects.SustainableDevelopmentProjects.model.EmployeeInvolvementProfile;

public class SortInvolvementProfileByName implements Comparator<EmployeeInvolvementProfile>{

	@Override
	public int compare(EmployeeInvolvementProfile profile0, EmployeeInvolvementProfile profile1) {
		return profile0.getLastName().compareTo(profile1.getLastName());
	}

}
