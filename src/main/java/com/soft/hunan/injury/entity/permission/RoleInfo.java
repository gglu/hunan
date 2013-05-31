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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * @author liwencheng
 * 
 */
@Entity
@Table(name="role")
public class RoleInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3676098400782067540L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="role_code",nullable=false)
	private String roleCode;
	
	@Column(name="role_name",nullable=false)
	private String roleName;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name="role_res")
	private Set<ResourceInfo> resourcesInfos;
	
	private Boolean locked;
	
	@Transient
	private transient boolean checked;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public Set<ResourceInfo> getResourcesInfos() {
		return resourcesInfos;
	}

	public void setResourcesInfos(Set<ResourceInfo> resourcesInfos) {
		this.resourcesInfos = resourcesInfos;
	}
	
	//===============================
	
	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int result = 17;
		result = 37*result + (int) (id == null?17:id^id>>>32);
		if(roleName != null){
			result = 37*result + roleName.hashCode();
		}
		if(roleCode != null){
			result = 37*result + roleCode.hashCode();
		}
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj)
			return true;
		
		if(!(obj instanceof RoleInfo))
			return false;
		
		RoleInfo role = (RoleInfo) obj;
		try {
			boolean flag = this.id  == role.id &&
					this.roleName.equals(role.roleName) && this.roleCode.equals(role.roleCode);
			return flag;
		} catch (NullPointerException e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return roleName;
	}
}
