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
@Table(name="user")
public class UserInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7285172169216026358L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String account;
	
	@Column(nullable=false)
	private String pwd;
	
	private String name;
	
	private Boolean locked;
	
	private String email;
	
	private String tel;
	
	@ManyToOne
	@JoinColumn(name="belong_org")
	private OrganizeInfo organize;
	
	@ManyToMany
	@JoinTable(name="user_role")
	private Set<RoleInfo> roles;
	
	@ManyToMany
	@JoinTable(name="user_res")
	private Set<ResourceInfo> resourcesInfos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public OrganizeInfo getOrganize() {
		return organize;
	}

	public void setOrganize(OrganizeInfo organize) {
		this.organize = organize;
	}

	public Set<RoleInfo> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleInfo> roles) {
		this.roles = roles;
	}

	public Set<ResourceInfo> getResourcesInfos() {
		return resourcesInfos;
	}

	public void setResourcesInfos(Set<ResourceInfo> resourcesInfos) {
		this.resourcesInfos = resourcesInfos;
	}
	
	
}
