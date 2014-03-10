package com.mw.framework.bean.impl;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.mw.framework.bean.IBaseObj;

/**
 * 统一定义基类.注意针对那些id不是自动生成的已有类而做。属历史遗留问题。属特别处理。以后的统一用IdEntity。调用的地方统一用IBaseObj
 */
//JPA Entity基类的标识
@MappedSuperclass
public abstract class BaseEntity implements IBaseObj {
	private static final long serialVersionUID = 7200292975335350461L;
	protected String createUser;
	protected Date createTime;
	protected String updateUser;
	protected Date updateTime;
	protected String rowStatus = ROW_STATUS_YES;

 
	@Column(name = "CREATE_USER", length = 20, updatable = false)
	public String getCreateUser() {
		return createUser;
	}
 
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

 
	@Column(name = "CREATE_TIME", updatable = false,columnDefinition="TIMESTAMP")
	public Date getCreateTime() {
		return createTime;
	}

 
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

 
	@Column(name = "UPDATE_USER", length = 20)
	public String getUpdateUser() {
		return updateUser;
	}

 
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
 
	@Column(name = "UPDATE_TIME",columnDefinition="TIMESTAMP")
	public Date getUpdateTime() {
		return updateTime;
	}

 
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
 
	@Column(name = "ROW_STATUS", length = 1)
	public String getRowStatus() {
		return rowStatus;
	}
 
	public void setRowStatus(String rowStatus) {
		this.rowStatus = rowStatus;
	}

}
