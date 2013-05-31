/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-27
 */
package com.soft.hunan.injury.entity.permission;

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
@Table(name="resource")
public class ResourceInfo implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1098634487068100065L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="res_name",nullable=false)
	private String resourceName;
	
	@Column(name="res_type",nullable=false)
	private String resourceType;
	
	@Column(name="res_url")
	private String resourceUrl;
	
	private Boolean locked;
	
	@Column(name="res_class")
	private String resourceClass;
	
	@Column(name="res_method")
	private String resourceMethod;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRessourceName() {
		return resourceName;
	}

	public void setRessourceName(String ressourceName) {
		this.resourceName = ressourceName;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public String getResourceClass() {
		return resourceClass;
	}

	public void setResourceClass(String resourceClass) {
		this.resourceClass = resourceClass;
	}

	public String getResourceMethod() {
		return resourceMethod;
	}

	public void setResourceMethod(String resourceMethod) {
		this.resourceMethod = resourceMethod;
	}
	
	
	//=============================
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int result = 17;
		result = 37*result + (int) (id == null?17:id^id>>>32);
		if(resourceName != null){
			result = 37*result + resourceName.hashCode();
		}
		if(resourceUrl != null){
			result = 37*result + resourceUrl.hashCode();
		}
		if(resourceClass != null){
			result = 37*result + resourceClass.hashCode();
		}
		if(resourceMethod != null){
			result = 37*result + resourceMethod.hashCode();
		}
		if(resourceType != null){
			result = 37*result + resourceType.hashCode();
		}
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj)
			return true;
		
		if(!(obj instanceof ResourceInfo))
			return false;
		
		ResourceInfo resource = (ResourceInfo) obj;
		try {
			boolean flag = this.id  == resource.id &&
					this.resourceName.equals(resource.resourceName) && this.resourceType == resource.resourceType ;
			if(resourceUrl != null)
				flag &= resourceUrl.equals(resource.resourceUrl);
			if(resourceClass != null)
				flag &= resourceClass.equals(resource.resourceClass);
			if(resourceMethod != null)
				flag &= resourceMethod.equals(resource.resourceMethod);
			return flag;
		} catch (NullPointerException e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return resourceName;
	}
	
}
