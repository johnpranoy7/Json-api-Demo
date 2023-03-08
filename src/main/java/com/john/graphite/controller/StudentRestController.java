package com.john.graphite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.john.graphite.bean.Movie;
import com.john.graphite.bean.MovieWithAnnotations;
import com.john.graphite.bean.Organization;
import com.john.graphite.service.MovieService;

@RestController
public class StudentRestController {

	@Autowired
	private MovieService mService;

//	@GetMapping("/user")
//	public User getUser() {
//		User u = new User("1", "joe");
//		return u;
//	}

	@GetMapping("/example")
	public ResponseEntity<MovieWithAnnotations> getMovie2() {
		MovieWithAnnotations m = new MovieWithAnnotations();
		m.setMyId("2");
		m.setTitle("lemon");
		m.setType("Horror");
		Organization o = new Organization();
		o.setOrgId(1l);
		o.setOrgName("johnComp");
		m.setOrg(o);
		return ResponseEntity.ok(m);
	}
}
