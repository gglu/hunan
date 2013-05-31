/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-27
 */
package com.soft.hunan.injury.entity.permission;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author liwencheng
 * 
 */

@Entity
@Table(name = "organize")
public class OrganizeInfo implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 480800961968055545L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="org_name",nullable=false)
	private String organizeName;
	
	@Column(name="org_code",nullable=false)
	private String organizeCode;
	
	private Boolean locked;
	
	@ManyToOne
	@JoinColumn(name="parent_org")
	private OrganizeInfo parentOrg;
	
	@ManyToMany
	@JoinTable(name="org_res")
	private Set<ResourceInfo> resourcesInfos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrganizeName() {
		return organizeName;
	}

	public void setOrganizeName(String organizeName) {
		this.organizeName = organizeName;
	}

	public String getOrganizeCode() {
		return organizeCode;
	}

	public void setOrganizeCode(String organizeCode) {
		this.organizeCode = organizeCode;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public OrganizeInfo getParentOrg() {
		return parentOrg;
	}

	public void setParentOrg(OrganizeInfo parentOrg) {
		this.parentOrg = parentOrg;
	}

	public Set<ResourceInfo> getResourcesInfos() {
		return resourcesInfos;
	}

	public void setResourcesInfos(Set<ResourceInfo> resourcesInfos) {
		this.resourcesInfos = resourcesInfos;
	}
	
	
	
	
}
