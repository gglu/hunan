/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-30
 */
package com.soft.hunan.injury.entity.dic;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author liwencheng
 *
 */

@Entity
@Table(name="dic")
public class Dictionary implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8405936926653565642L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String code;
	
	@Column(name="type_code")
	private String typeCode;
	
	private String type;
	
	@Column(name="order_no")
	private short order;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public short getOrder() {
		return order;
	}

	public void setOrder(short order) {
		this.order = order;
	}
	
	
}
