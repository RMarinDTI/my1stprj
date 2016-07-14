/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package es.davinciti.liferay.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import es.davinciti.liferay.model.SageEmployee;
import es.davinciti.liferay.model.SageEmployeeModel;
import es.davinciti.liferay.model.SageEmployeeSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the SageEmployee service. Represents a row in the &quot;CMES_SageEmployee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link es.davinciti.liferay.model.SageEmployeeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SageEmployeeImpl}.
 * </p>
 *
 * @author Cmes
 * @see SageEmployeeImpl
 * @see es.davinciti.liferay.model.SageEmployee
 * @see es.davinciti.liferay.model.SageEmployeeModel
 * @generated
 */
@JSON(strict = true)
public class SageEmployeeModelImpl extends BaseModelImpl<SageEmployee>
	implements SageEmployeeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sage employee model instance should use the {@link es.davinciti.liferay.model.SageEmployee} interface instead.
	 */
	public static final String TABLE_NAME = "CMES_SageEmployee";
	public static final Object[][] TABLE_COLUMNS = {
			{ "sageEmployeeId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "employeeID", Types.VARCHAR },
			{ "applicationId", Types.VARCHAR },
			{ "companyId", Types.VARCHAR },
			{ "personId", Types.VARCHAR },
			{ "startDate", Types.VARCHAR },
			{ "endDate", Types.VARCHAR },
			{ "seniority", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table CMES_SageEmployee (sageEmployeeId LONG not null primary key,userId LONG,employeeID VARCHAR(75) null,applicationId VARCHAR(75) null,companyId VARCHAR(75) null,personId VARCHAR(75) null,startDate VARCHAR(75) null,endDate VARCHAR(75) null,seniority VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table CMES_SageEmployee";
	public static final String ORDER_BY_JPQL = " ORDER BY sageEmployee.sageEmployeeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMES_SageEmployee.sageEmployeeId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.es.davinciti.liferay.model.SageEmployee"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.es.davinciti.liferay.model.SageEmployee"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.es.davinciti.liferay.model.SageEmployee"),
			true);
	public static long EMPLOYEEID_COLUMN_BITMASK = 1L;
	public static long USERID_COLUMN_BITMASK = 2L;
	public static long SAGEEMPLOYEEID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static SageEmployee toModel(SageEmployeeSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		SageEmployee model = new SageEmployeeImpl();

		model.setSageEmployeeId(soapModel.getSageEmployeeId());
		model.setUserId(soapModel.getUserId());
		model.setEmployeeID(soapModel.getEmployeeID());
		model.setApplicationId(soapModel.getApplicationId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setPersonId(soapModel.getPersonId());
		model.setStartDate(soapModel.getStartDate());
		model.setEndDate(soapModel.getEndDate());
		model.setSeniority(soapModel.getSeniority());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<SageEmployee> toModels(SageEmployeeSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<SageEmployee> models = new ArrayList<SageEmployee>(soapModels.length);

		for (SageEmployeeSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.es.davinciti.liferay.model.SageEmployee"));

	public SageEmployeeModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sageEmployeeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSageEmployeeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sageEmployeeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SageEmployee.class;
	}

	@Override
	public String getModelClassName() {
		return SageEmployee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sageEmployeeId", getSageEmployeeId());
		attributes.put("userId", getUserId());
		attributes.put("employeeID", getEmployeeID());
		attributes.put("applicationId", getApplicationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("personId", getPersonId());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("seniority", getSeniority());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sageEmployeeId = (Long)attributes.get("sageEmployeeId");

		if (sageEmployeeId != null) {
			setSageEmployeeId(sageEmployeeId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String employeeID = (String)attributes.get("employeeID");

		if (employeeID != null) {
			setEmployeeID(employeeID);
		}

		String applicationId = (String)attributes.get("applicationId");

		if (applicationId != null) {
			setApplicationId(applicationId);
		}

		String companyId = (String)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String personId = (String)attributes.get("personId");

		if (personId != null) {
			setPersonId(personId);
		}

		String startDate = (String)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		String endDate = (String)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		String seniority = (String)attributes.get("seniority");

		if (seniority != null) {
			setSeniority(seniority);
		}
	}

	@JSON
	@Override
	public long getSageEmployeeId() {
		return _sageEmployeeId;
	}

	@Override
	public void setSageEmployeeId(long sageEmployeeId) {
		_sageEmployeeId = sageEmployeeId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	@Override
	public String getEmployeeID() {
		if (_employeeID == null) {
			return StringPool.BLANK;
		}
		else {
			return _employeeID;
		}
	}

	@Override
	public void setEmployeeID(String employeeID) {
		_columnBitmask |= EMPLOYEEID_COLUMN_BITMASK;

		if (_originalEmployeeID == null) {
			_originalEmployeeID = _employeeID;
		}

		_employeeID = employeeID;
	}

	public String getOriginalEmployeeID() {
		return GetterUtil.getString(_originalEmployeeID);
	}

	@JSON
	@Override
	public String getApplicationId() {
		if (_applicationId == null) {
			return StringPool.BLANK;
		}
		else {
			return _applicationId;
		}
	}

	@Override
	public void setApplicationId(String applicationId) {
		_applicationId = applicationId;
	}

	@JSON
	@Override
	public String getCompanyId() {
		if (_companyId == null) {
			return StringPool.BLANK;
		}
		else {
			return _companyId;
		}
	}

	@Override
	public void setCompanyId(String companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public String getPersonId() {
		if (_personId == null) {
			return StringPool.BLANK;
		}
		else {
			return _personId;
		}
	}

	@Override
	public void setPersonId(String personId) {
		_personId = personId;
	}

	@JSON
	@Override
	public String getStartDate() {
		if (_startDate == null) {
			return StringPool.BLANK;
		}
		else {
			return _startDate;
		}
	}

	@Override
	public void setStartDate(String startDate) {
		_startDate = startDate;
	}

	@JSON
	@Override
	public String getEndDate() {
		if (_endDate == null) {
			return StringPool.BLANK;
		}
		else {
			return _endDate;
		}
	}

	@Override
	public void setEndDate(String endDate) {
		_endDate = endDate;
	}

	@JSON
	@Override
	public String getSeniority() {
		if (_seniority == null) {
			return StringPool.BLANK;
		}
		else {
			return _seniority;
		}
	}

	@Override
	public void setSeniority(String seniority) {
		_seniority = seniority;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			SageEmployee.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SageEmployee toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SageEmployee)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SageEmployeeImpl sageEmployeeImpl = new SageEmployeeImpl();

		sageEmployeeImpl.setSageEmployeeId(getSageEmployeeId());
		sageEmployeeImpl.setUserId(getUserId());
		sageEmployeeImpl.setEmployeeID(getEmployeeID());
		sageEmployeeImpl.setApplicationId(getApplicationId());
		sageEmployeeImpl.setCompanyId(getCompanyId());
		sageEmployeeImpl.setPersonId(getPersonId());
		sageEmployeeImpl.setStartDate(getStartDate());
		sageEmployeeImpl.setEndDate(getEndDate());
		sageEmployeeImpl.setSeniority(getSeniority());

		sageEmployeeImpl.resetOriginalValues();

		return sageEmployeeImpl;
	}

	@Override
	public int compareTo(SageEmployee sageEmployee) {
		long primaryKey = sageEmployee.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SageEmployee)) {
			return false;
		}

		SageEmployee sageEmployee = (SageEmployee)obj;

		long primaryKey = sageEmployee.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		SageEmployeeModelImpl sageEmployeeModelImpl = this;

		sageEmployeeModelImpl._originalUserId = sageEmployeeModelImpl._userId;

		sageEmployeeModelImpl._setOriginalUserId = false;

		sageEmployeeModelImpl._originalEmployeeID = sageEmployeeModelImpl._employeeID;

		sageEmployeeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SageEmployee> toCacheModel() {
		SageEmployeeCacheModel sageEmployeeCacheModel = new SageEmployeeCacheModel();

		sageEmployeeCacheModel.sageEmployeeId = getSageEmployeeId();

		sageEmployeeCacheModel.userId = getUserId();

		sageEmployeeCacheModel.employeeID = getEmployeeID();

		String employeeID = sageEmployeeCacheModel.employeeID;

		if ((employeeID != null) && (employeeID.length() == 0)) {
			sageEmployeeCacheModel.employeeID = null;
		}

		sageEmployeeCacheModel.applicationId = getApplicationId();

		String applicationId = sageEmployeeCacheModel.applicationId;

		if ((applicationId != null) && (applicationId.length() == 0)) {
			sageEmployeeCacheModel.applicationId = null;
		}

		sageEmployeeCacheModel.companyId = getCompanyId();

		String companyId = sageEmployeeCacheModel.companyId;

		if ((companyId != null) && (companyId.length() == 0)) {
			sageEmployeeCacheModel.companyId = null;
		}

		sageEmployeeCacheModel.personId = getPersonId();

		String personId = sageEmployeeCacheModel.personId;

		if ((personId != null) && (personId.length() == 0)) {
			sageEmployeeCacheModel.personId = null;
		}

		sageEmployeeCacheModel.startDate = getStartDate();

		String startDate = sageEmployeeCacheModel.startDate;

		if ((startDate != null) && (startDate.length() == 0)) {
			sageEmployeeCacheModel.startDate = null;
		}

		sageEmployeeCacheModel.endDate = getEndDate();

		String endDate = sageEmployeeCacheModel.endDate;

		if ((endDate != null) && (endDate.length() == 0)) {
			sageEmployeeCacheModel.endDate = null;
		}

		sageEmployeeCacheModel.seniority = getSeniority();

		String seniority = sageEmployeeCacheModel.seniority;

		if ((seniority != null) && (seniority.length() == 0)) {
			sageEmployeeCacheModel.seniority = null;
		}

		return sageEmployeeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{sageEmployeeId=");
		sb.append(getSageEmployeeId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", employeeID=");
		sb.append(getEmployeeID());
		sb.append(", applicationId=");
		sb.append(getApplicationId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", personId=");
		sb.append(getPersonId());
		sb.append(", startDate=");
		sb.append(getStartDate());
		sb.append(", endDate=");
		sb.append(getEndDate());
		sb.append(", seniority=");
		sb.append(getSeniority());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.SageEmployee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sageEmployeeId</column-name><column-value><![CDATA[");
		sb.append(getSageEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeID</column-name><column-value><![CDATA[");
		sb.append(getEmployeeID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicationId</column-name><column-value><![CDATA[");
		sb.append(getApplicationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personId</column-name><column-value><![CDATA[");
		sb.append(getPersonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startDate</column-name><column-value><![CDATA[");
		sb.append(getStartDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endDate</column-name><column-value><![CDATA[");
		sb.append(getEndDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>seniority</column-name><column-value><![CDATA[");
		sb.append(getSeniority());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = SageEmployee.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			SageEmployee.class
		};
	private long _sageEmployeeId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _employeeID;
	private String _originalEmployeeID;
	private String _applicationId;
	private String _companyId;
	private String _personId;
	private String _startDate;
	private String _endDate;
	private String _seniority;
	private long _columnBitmask;
	private SageEmployee _escapedModel;
}