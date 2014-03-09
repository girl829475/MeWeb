/**
 *
 */
package com.mw.framework.util;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

/**
 * 
 * @Project MeWeb
 * @Copyright © 2008-2014 SPRO Technology Consulting Limited. All rights reserved.
 * @fileName com.mw.framework.util.UUIDGenerator.java
 * @Version 1.0.0
 * @author Allan Ai
 * @time 2014-3-6
 *
 */
public class UUIDGenerator implements IdentifierGenerator{

	 
	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1)
			throws HibernateException {
		return UUIDUtils.compressedUuid();
	}

}
