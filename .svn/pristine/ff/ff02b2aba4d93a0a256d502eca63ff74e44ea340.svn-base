package com.mw.framework.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

/**
 * @Project hjweb
 * @Copyright © 2008-2013 SPRO Technology Consulting Limited. All rights reserved.
 * @fileName com.hxlms.commons.JsonDateValueProcessor
 * @Version 1.0.0
 * @author Allan Ai
 * @time 2013-8-4 下午11:00:45
 * 
 */
public class JsonDateValueProcessor implements JsonValueProcessor {

	private String datePattern = "yyyy-MM-dd";

	public JsonDateValueProcessor() {
		super();
	}

	public JsonDateValueProcessor(String format) {
		super();
		this.datePattern = format;
	}

	@Override
	public Object processArrayValue(Object value, JsonConfig jsonConfig) {
		return process(value);
	}

	@Override
	public Object processObjectValue(String arg0, Object value, JsonConfig jsonConfig) {
		return process(value);
	}

	private Object process(Object value) {
		try {
			if (value instanceof Date) {
				SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
				return sdf.format((Date) value);
			}
			return value == null ? "" : value.toString();
		} catch (Exception e) {
			return "";
		}
	}

	public String getDatePattern() {
		return datePattern;
	}

	public void setDatePattern(String datePattern) {
		this.datePattern = datePattern;
	}

}
