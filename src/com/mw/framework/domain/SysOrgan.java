/**
 *组织架构实体类
 */
package com.mw.framework.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;

import com.mw.framework.bean.impl.UUIDEntity;

@Entity
@Table(name = "SYS_ORGAN")
public class SysOrgan extends UUIDEntity implements Serializable {

	private static final long serialVersionUID = -1770402312221827459L;
	private String ctrlCode;
	private String remark;
	private Integer sortCode;
	private String name;
	private boolean leaf = false;
	private SysOrgan parent;
	private String pid;

	private Set<SysOrgan> children = new HashSet<SysOrgan>();

	public SysOrgan() {
		super();
	}

	public SysOrgan(Integer sortCode, String name) {
		super();
		this.sortCode = sortCode;
		this.name = name;
	}

	public SysOrgan(Integer sortCode, String name,boolean leaf ,SysOrgan parent) {
		super();
		this.sortCode = sortCode;
		this.name = name;
		this.parent = parent;
		this.leaf = leaf;
	}

	public SysOrgan(Integer sortCode, String name, SysOrgan parent,
			Set<SysOrgan> children) {
		super();
		this.sortCode = sortCode;
		this.name = name;
		this.parent = parent;
		this.children = children;
	}

	@Column(name = "CTRL_CODE", length = 32)
	public String getCtrlCode() {
		return ctrlCode;
	}

	public void setCtrlCode(String ctrlCode) {
		this.ctrlCode = ctrlCode;
	}

	@Column(name = "REMARK")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "SORT_CODE", nullable = false)
	public Integer getSortCode() {
		return sortCode;
	}

	public void setSortCode(Integer sortCode) {
		this.sortCode = sortCode;
	}

	@Column(name = "NAME", length = 100, nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "LEAF")
	@Type(type = "java.lang.Boolean")
	public boolean isLeaf() {
		return leaf;
	}

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}

	@OneToMany(mappedBy = "parent")
	@OrderBy(value = "sortCode ASC")
	public Set<SysOrgan> getChildren() {
		return children;
	}

	public void setChildren(Set<SysOrgan> children) {
		this.children = children;
	}

	@ManyToOne
	@JoinColumn(name = "pid")
	public SysOrgan getParent() {
		return parent;
	}

	public void setParent(SysOrgan parent) {
		this.parent = parent;
	}

	@Transient
	public String getPid() {
		if(pid==null && this.parent!=null){
			return this.parent.getId();
		}
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

}
