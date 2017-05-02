package com.jjones.sandbox.account.data;

import javax.persistence.Column;

public class Group extends GuidBaseEntity {
	

	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "type", length = 30)
	private String type;

}
