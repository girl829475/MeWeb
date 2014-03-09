package com.mw.framework.bean;

import java.util.Date;

/**此接口物实际意义，是辅助接口
 * 所有自定义实体原则上要实现此接口。这样可以在底层的时候可以用BaseObj取到实际对象的基本属性。
 * @author luoliuqiang
 *
 */
public interface IBaseObj {
	public static final String ROW_STATUS_YES = "1";
	public static final String ROW_STATUS_NO = "0";

	public abstract String getId();

	public abstract String getCreateUser();

	public abstract void setCreateUser(String createUser);

	public abstract Date getCreateTime();

	public abstract void setCreateTime(Date createTime);

	public abstract String getUpdateUser();

	public abstract void setUpdateUser(String updateUser);

	public abstract Date getUpdateTime();

	public abstract void setUpdateTime(Date updateTime);

	public abstract String getRowStatus();

	public abstract void setRowStatus(String rowStatus);

}