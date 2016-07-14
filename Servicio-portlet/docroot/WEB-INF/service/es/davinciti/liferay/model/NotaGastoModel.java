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

package es.davinciti.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the NotaGasto service. Represents a row in the &quot;CMES_NotaGasto&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link es.davinciti.liferay.model.impl.NotaGastoImpl}.
 * </p>
 *
 * @author Cmes
 * @see NotaGasto
 * @see es.davinciti.liferay.model.impl.NotaGastoImpl
 * @see es.davinciti.liferay.model.impl.NotaGastoModelImpl
 * @generated
 */
public interface NotaGastoModel extends BaseModel<NotaGasto> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a nota gasto model instance should use the {@link NotaGasto} interface instead.
	 */

	/**
	 * Returns the primary key of this nota gasto.
	 *
	 * @return the primary key of this nota gasto
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this nota gasto.
	 *
	 * @param primaryKey the primary key of this nota gasto
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the notagasto ID of this nota gasto.
	 *
	 * @return the notagasto ID of this nota gasto
	 */
	public long getNotagastoId();

	/**
	 * Sets the notagasto ID of this nota gasto.
	 *
	 * @param notagastoId the notagasto ID of this nota gasto
	 */
	public void setNotagastoId(long notagastoId);

	/**
	 * Returns the company ID of this nota gasto.
	 *
	 * @return the company ID of this nota gasto
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this nota gasto.
	 *
	 * @param companyId the company ID of this nota gasto
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this nota gasto.
	 *
	 * @return the user ID of this nota gasto
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this nota gasto.
	 *
	 * @param userId the user ID of this nota gasto
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this nota gasto.
	 *
	 * @return the user uuid of this nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this nota gasto.
	 *
	 * @param userUuid the user uuid of this nota gasto
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the description of this nota gasto.
	 *
	 * @return the description of this nota gasto
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this nota gasto.
	 *
	 * @param description the description of this nota gasto
	 */
	public void setDescription(String description);

	/**
	 * Returns the start date of this nota gasto.
	 *
	 * @return the start date of this nota gasto
	 */
	@AutoEscape
	public String getStartDate();

	/**
	 * Sets the start date of this nota gasto.
	 *
	 * @param startDate the start date of this nota gasto
	 */
	public void setStartDate(String startDate);

	/**
	 * Returns the end date of this nota gasto.
	 *
	 * @return the end date of this nota gasto
	 */
	@AutoEscape
	public String getEndDate();

	/**
	 * Sets the end date of this nota gasto.
	 *
	 * @param endDate the end date of this nota gasto
	 */
	public void setEndDate(String endDate);

	/**
	 * Returns the comments of this nota gasto.
	 *
	 * @return the comments of this nota gasto
	 */
	@AutoEscape
	public String getComments();

	/**
	 * Sets the comments of this nota gasto.
	 *
	 * @param comments the comments of this nota gasto
	 */
	public void setComments(String comments);

	/**
	 * Returns the status of this nota gasto.
	 *
	 * @return the status of this nota gasto
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this nota gasto.
	 *
	 * @param status the status of this nota gasto
	 */
	public void setStatus(String status);

	/**
	 * Returns the amount of this nota gasto.
	 *
	 * @return the amount of this nota gasto
	 */
	@AutoEscape
	public String getAmount();

	/**
	 * Sets the amount of this nota gasto.
	 *
	 * @param amount the amount of this nota gasto
	 */
	public void setAmount(String amount);

	/**
	 * Returns the create date of this nota gasto.
	 *
	 * @return the create date of this nota gasto
	 */
	@AutoEscape
	public String getCreateDate();

	/**
	 * Sets the create date of this nota gasto.
	 *
	 * @param createDate the create date of this nota gasto
	 */
	public void setCreateDate(String createDate);

	/**
	 * Returns the update date of this nota gasto.
	 *
	 * @return the update date of this nota gasto
	 */
	@AutoEscape
	public String getUpdateDate();

	/**
	 * Sets the update date of this nota gasto.
	 *
	 * @param updateDate the update date of this nota gasto
	 */
	public void setUpdateDate(String updateDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(es.davinciti.liferay.model.NotaGasto notaGasto);

	@Override
	public int hashCode();

	@Override
	public CacheModel<es.davinciti.liferay.model.NotaGasto> toCacheModel();

	@Override
	public es.davinciti.liferay.model.NotaGasto toEscapedModel();

	@Override
	public es.davinciti.liferay.model.NotaGasto toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}