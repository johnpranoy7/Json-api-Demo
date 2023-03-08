package com.john.graphite.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Organization  {
	@Id
	private long orgId;
	private String orgName;
}
