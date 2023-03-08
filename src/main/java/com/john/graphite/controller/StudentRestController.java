package com.john.graphite.controller;

import static com.toedter.spring.hateoas.jsonapi.JsonApiModelBuilder.jsonApiModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.john.graphite.bean.Employee;
import com.john.graphite.bean.Movie;
import com.john.graphite.bean.MovieWithAnnotations;
import com.john.graphite.bean.Organization;
import com.john.graphite.service.EmployeeService;
import com.toedter.spring.hateoas.jsonapi.JsonApiModelBuilder;

@RestController
public class StudentRestController {

	@Autowired
	private EmployeeService eService;

	@GetMapping("/employee")
	public List<Employee> getEmployees() {
		List<Employee> employees = eService.getEmployees();
		return employees;
	}

//	@GetMapping("/user")
//	public User getUser() {
//		User u = new User("1", "joe");
//		return u;
//	}

	@GetMapping("/user")
	public Movie getMovie() {
		Movie m = new Movie();
		m.setId("1");
		m.setTitle("asda");
		EntityModel.of(m);
		return m;
	}

	@GetMapping("/user1")
	public EntityModel<Movie> getMovie1() {
		Movie m = new Movie();
		m.setId("1");
		m.setTitle("abcd");
		return EntityModel.of(m);
	}

	@GetMapping("/user2")
	public RepresentationModel<?> getMovie2(@RequestParam(value = "include", required = false) String[] include) {
		MovieWithAnnotations m = new MovieWithAnnotations();
		m.setMyId("2");
		m.setTitle("lemon");
		m.setType("Horror");
		Organization o = new Organization();
		o.setOrgId(1l);
		o.setOrgName("johnComp");
		m.setOrg(o);
		final RepresentationModel<?> jsonApiModel = jsonApiModel().model(m).build();
		return jsonApiModel;
	}
}
