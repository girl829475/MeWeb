package com.mw.framework.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.mw.framework.bean.impl.UUIDEntity;

@Entity
@Table(name = "SYS_DATA_DIC")
public class SysDataDic extends UUIDEntity implements Serializable {
	private static final long serialVersionUID = -8285796236121424636L;

	@NotEmpty(message = "{dataDic.keyVal.null}")
	@Length(min = 2, max = 22, message = "{dataDic.keyVal.length.illegal}")
	@Pattern(regexp = "[a-zA-Z0-9]{2,22}", message = "{dataDic.keyVal.illegal}")
	private String keyVal;

	@NotNull(message = "{dataDic.pid.null}")
	private String pid;

	private String type;
	private String descZhCn;
	private String descZhTw;
	private String descEnUs;

	public SysDataDic() {
		super();
	}

	public SysDataDic(String keyVal, String pid, String type, String descZhCn,
			String descZhTw, String descEnUs) {
		super();
		this.keyVal = keyVal;
		this.pid = pid;
		this.type = type;
		this.descZhCn = descZhCn;
		this.descZhTw = descZhTw;
		this.descEnUs = descEnUs;
	}

	@Column(name = "KEY_VAL",length=22)
	public String getKeyVal() {
		return keyVal;
	}

	public void setKeyVal(String keyVal) {
		this.keyVal = keyVal;
	}

	@Column(name = "PID",length=22)
	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	@Column(name = "TYPE",length=4)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "DESC_ZH_CN")
	public String getDescZhCn() {
		return descZhCn;
	}

	public void setDescZhCn(String descZhCn) {
		this.descZhCn = descZhCn;
	}

	@Column(name = "DESC_ZH_TW")
	public String getDescZhTw() {
		return descZhTw;
	}

	public void setDescZhTw(String descZhTw) {
		this.descZhTw = descZhTw;
	}

	@Column(name = "DESC_EN_US")
	public String getDescEnUs() {
		return descEnUs;
	}

	public void setDescEnUs(String descEnUs) {
		this.descEnUs = descEnUs;
	}

	@Override
	public String toString() {
		return "DataDic [id=" + id + ", keyVal=" + keyVal + ", pid=" + pid
				+ ", type=" + type + ", descZhCn=" + descZhCn + ", descZhTw="
				+ descZhTw + ", descEnUs=" + descEnUs + "]";
	}

}
