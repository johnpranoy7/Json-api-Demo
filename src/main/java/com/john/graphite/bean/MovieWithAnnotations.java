package com.john.graphite.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class MovieWithAnnotations {
	@Id
	private String myId;
	private String title;
	private String type;
	@OneToOne
	private Organization org;
}