package com.mw.framework.bean;

import java.util.HashMap;

public class Message extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;

	private Object obj;
	private Boolean status;
	private String msg;
	private String errorMsg;
	private String errorCode;
	
	public Message(String msg) {
		super();
		this.msg = msg;
		this.status = true;
		super.put("msg", msg);
		super.put("status", true);
	}

	public Message(Object obj, String msg) {
		super();
		this.obj = obj;
		this.msg = msg;
		this.status = true;
		super.put("obj", obj);
		super.put("msg", msg);
		super.put("status", true);
	}

	public Message(String errorCode, String errorMsg) {
		super();
		this.errorMsg = errorMsg;
		this.errorCode = errorCode;
		this.status = false;
		super.put("errorMsg", errorMsg);
		super.put("errorCode", errorCode);
		super.put("status", false);
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public String toString() {
		return "Message [obj=" + obj + ", status=" + status + ", msg=" + msg
				+ ", errorMsg=" + errorMsg + ", errorCode=" + errorCode + "]";
	}
}
