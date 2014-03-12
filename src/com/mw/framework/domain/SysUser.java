package com.mw.framework.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.mw.framework.bean.impl.UUIDEntity;

@Entity
@Table(name = "SYS_USER")
public class SysUser extends UUIDEntity implements Serializable {

	private static final long serialVersionUID = 1836109006108297063L;

	private String loginNo;

	private String userName;

	private String password;

	private String userType;

	private Set<SysOrgan> organes = new HashSet<SysOrgan>();

	private Integer sex;

	private String userNo;

	public SysUser() {
		super();
	}

	public SysUser(String loginNo, String userName, String password,
			Integer sex, String userNo) {
		super();
		this.loginNo = loginNo;
		this.userName = userName;
		this.password = password;
		this.sex = sex;
		this.userNo = userNo;
	}

	@Column(name = "LOGIN_NO", length = 30)
	public String getLoginNo() {
		return loginNo;
	}

	public void setLoginNo(String loginNo) {
		this.loginNo = loginNo;
	}

	@Column(name = "USER_NAME", length = 30)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "USER_TYPE", length = 30)
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Column(name = "SEX", length = 1)
	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@Column(name = "USER_NO", length = 30)
	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	@Column(name = "PASSWORD", length = 30)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@ManyToMany(targetEntity = SysOrgan.class, cascade = { CascadeType.MERGE,
			CascadeType.PERSIST })
	@JoinTable(name = "sys_user_organ", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "organ_id") })
	public Set<SysOrgan> getOrganes() {
		return organes;
	}

	public void setOrganes(Set<SysOrgan> organes) {
		this.organes = organes;
	}
}
