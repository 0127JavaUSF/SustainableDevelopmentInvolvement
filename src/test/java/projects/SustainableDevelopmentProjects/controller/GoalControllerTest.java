package projects.SustainableDevelopmentProjects.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import projects.SustainableDevelopmentProjects.model.repository.SustainableDevelopmentGoalsRepository;

@WebMvcTest(GoalControllerTest.class)
class GoalControllerTest {
	@Autowired MockMvc mvc;
	
	@MockBean
	private SustainableDevelopmentGoalsRepository goalRepository;
	
	@Autowired
	private WebApplicationContext context;
	
	
	@Test
	void testGetAllGoals() {
		
		try {
			this.mvc = MockMvcBuilders.webAppContextSetup(context).build();
			this.mvc.perform(get("/goals").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk()) ;
		} catch (Exception e) {
			System.err.println("Exception in testGetAllGoals while doing mvc.perform.");
			e.printStackTrace();
		}
		
	}

}
