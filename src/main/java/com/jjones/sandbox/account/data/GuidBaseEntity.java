/**
 * 
 */
package com.jjones.sandbox.account.data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author jajones
 *
 */
@MappedSuperclass
public class GuidBaseEntity {
	
	@Id
	@Column(name = "id", length = 40)
	private String id;	
	
}
