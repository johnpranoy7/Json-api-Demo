package com.john.graphite.bean;

import lombok.Data;

@Data
public class Employee {
	private int employeeId;
	private String name;
	private Organization org;
	private Address address;


}
