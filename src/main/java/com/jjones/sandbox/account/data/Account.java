package com.jjones.sandbox.account.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account extends GuidBaseEntity{
	
	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "type", length = 30)
	private String type;
	
}
