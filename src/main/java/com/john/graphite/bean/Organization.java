package com.john.graphite.bean;

import javax.persistence.Id;

import org.springframework.stereotype.Component;

import com.toedter.spring.hateoas.jsonapi.JsonApiType;

import lombok.Data;

@Data
@Component
public class Organization  {
	@Id
	private long orgId;
	@JsonApiType
	private String orgName;
}
