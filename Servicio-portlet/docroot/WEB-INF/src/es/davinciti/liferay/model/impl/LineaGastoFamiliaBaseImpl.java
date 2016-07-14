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

import com.liferay.portal.kernel.exception.SystemException;

import es.davinciti.liferay.model.LineaGastoFamilia;
import es.davinciti.liferay.service.LineaGastoFamiliaLocalServiceUtil;

/**
 * The extended model base implementation for the LineaGastoFamilia service. Represents a row in the &quot;CMES_LineaGastoFamilia&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LineaGastoFamiliaImpl}.
 * </p>
 *
 * @author Cmes
 * @see LineaGastoFamiliaImpl
 * @see es.davinciti.liferay.model.LineaGastoFamilia
 * @generated
 */
public abstract class LineaGastoFamiliaBaseImpl
	extends LineaGastoFamiliaModelImpl implements LineaGastoFamilia {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a linea gasto familia model instance should use the {@link LineaGastoFamilia} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LineaGastoFamiliaLocalServiceUtil.addLineaGastoFamilia(this);
		}
		else {
			LineaGastoFamiliaLocalServiceUtil.updateLineaGastoFamilia(this);
		}
	}
}