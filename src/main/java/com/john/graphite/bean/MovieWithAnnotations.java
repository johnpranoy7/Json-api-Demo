package com.john.graphite.bean;

import javax.persistence.Id;

import com.toedter.spring.hateoas.jsonapi.JsonApiRelationships;
import com.toedter.spring.hateoas.jsonapi.JsonApiType;

import lombok.Data;

@Data
public class MovieWithAnnotations {
	@Id
	private String myId;
	private String title;
	@JsonApiType
	private String type;
	@JsonApiRelationships("organization")
	private Organization org;
}