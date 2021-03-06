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

package es.davinciti.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LineaGastoProyectoLocalService}.
 *
 * @author Cmes
 * @see LineaGastoProyectoLocalService
 * @generated
 */
public class LineaGastoProyectoLocalServiceWrapper
	implements LineaGastoProyectoLocalService,
		ServiceWrapper<LineaGastoProyectoLocalService> {
	public LineaGastoProyectoLocalServiceWrapper(
		LineaGastoProyectoLocalService lineaGastoProyectoLocalService) {
		_lineaGastoProyectoLocalService = lineaGastoProyectoLocalService;
	}

	/**
	* Adds the linea gasto proyecto to the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoProyecto the linea gasto proyecto
	* @return the linea gasto proyecto that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoProyecto addLineaGastoProyecto(
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.addLineaGastoProyecto(lineaGastoProyecto);
	}

	/**
	* Creates a new linea gasto proyecto with the primary key. Does not add the linea gasto proyecto to the database.
	*
	* @param proyectoId the primary key for the new linea gasto proyecto
	* @return the new linea gasto proyecto
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoProyecto createLineaGastoProyecto(
		long proyectoId) {
		return _lineaGastoProyectoLocalService.createLineaGastoProyecto(proyectoId);
	}

	/**
	* Deletes the linea gasto proyecto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param proyectoId the primary key of the linea gasto proyecto
	* @return the linea gasto proyecto that was removed
	* @throws PortalException if a linea gasto proyecto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoProyecto deleteLineaGastoProyecto(
		long proyectoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.deleteLineaGastoProyecto(proyectoId);
	}

	/**
	* Deletes the linea gasto proyecto from the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoProyecto the linea gasto proyecto
	* @return the linea gasto proyecto that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoProyecto deleteLineaGastoProyecto(
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.deleteLineaGastoProyecto(lineaGastoProyecto);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _lineaGastoProyectoLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoProyectoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoProyectoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.davinciti.liferay.model.LineaGastoProyecto fetchLineaGastoProyecto(
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.fetchLineaGastoProyecto(proyectoId);
	}

	/**
	* Returns the linea gasto proyecto with the primary key.
	*
	* @param proyectoId the primary key of the linea gasto proyecto
	* @return the linea gasto proyecto
	* @throws PortalException if a linea gasto proyecto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoProyecto getLineaGastoProyecto(
		long proyectoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.getLineaGastoProyecto(proyectoId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the linea gasto proyectos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoProyectoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linea gasto proyectos
	* @param end the upper bound of the range of linea gasto proyectos (not inclusive)
	* @return the range of linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.getLineaGastoProyectos(start, end);
	}

	/**
	* Returns the number of linea gasto proyectos.
	*
	* @return the number of linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoProyectosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.getLineaGastoProyectosCount();
	}

	/**
	* Updates the linea gasto proyecto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoProyecto the linea gasto proyecto
	* @return the linea gasto proyecto that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoProyecto updateLineaGastoProyecto(
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.updateLineaGastoProyecto(lineaGastoProyecto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoClienteLineaGastoProyecto(long clienteId,
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.addLineaGastoClienteLineaGastoProyecto(clienteId,
			proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoClienteLineaGastoProyecto(long clienteId,
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.addLineaGastoClienteLineaGastoProyecto(clienteId,
			lineaGastoProyecto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoClienteLineaGastoProyectos(long clienteId,
		long[] proyectoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.addLineaGastoClienteLineaGastoProyectos(clienteId,
			proyectoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoClienteLineaGastoProyectos(long clienteId,
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> LineaGastoProyectos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.addLineaGastoClienteLineaGastoProyectos(clienteId,
			LineaGastoProyectos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearLineaGastoClienteLineaGastoProyectos(long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.clearLineaGastoClienteLineaGastoProyectos(clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoClienteLineaGastoProyecto(long clienteId,
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.deleteLineaGastoClienteLineaGastoProyecto(clienteId,
			proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoClienteLineaGastoProyecto(long clienteId,
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.deleteLineaGastoClienteLineaGastoProyecto(clienteId,
			lineaGastoProyecto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoClienteLineaGastoProyectos(long clienteId,
		long[] proyectoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.deleteLineaGastoClienteLineaGastoProyectos(clienteId,
			proyectoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoClienteLineaGastoProyectos(long clienteId,
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> LineaGastoProyectos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.deleteLineaGastoClienteLineaGastoProyectos(clienteId,
			LineaGastoProyectos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoClienteLineaGastoProyectos(
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.getLineaGastoClienteLineaGastoProyectos(clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoClienteLineaGastoProyectos(
		long clienteId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.getLineaGastoClienteLineaGastoProyectos(clienteId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoClienteLineaGastoProyectos(
		long clienteId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.getLineaGastoClienteLineaGastoProyectos(clienteId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoClienteLineaGastoProyectosCount(long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.getLineaGastoClienteLineaGastoProyectosCount(clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoClienteLineaGastoProyecto(long clienteId,
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.hasLineaGastoClienteLineaGastoProyecto(clienteId,
			proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoClienteLineaGastoProyectos(long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.hasLineaGastoClienteLineaGastoProyectos(clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setLineaGastoClienteLineaGastoProyectos(long clienteId,
		long[] proyectoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.setLineaGastoClienteLineaGastoProyectos(clienteId,
			proyectoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoLineaGastoProyecto(long lineagastoId,
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.addLineaGastoLineaGastoProyecto(lineagastoId,
			proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoLineaGastoProyecto(long lineagastoId,
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.addLineaGastoLineaGastoProyecto(lineagastoId,
			lineaGastoProyecto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoLineaGastoProyectos(long lineagastoId,
		long[] proyectoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.addLineaGastoLineaGastoProyectos(lineagastoId,
			proyectoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoLineaGastoProyectos(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> LineaGastoProyectos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.addLineaGastoLineaGastoProyectos(lineagastoId,
			LineaGastoProyectos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearLineaGastoLineaGastoProyectos(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.clearLineaGastoLineaGastoProyectos(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoLineaGastoProyecto(long lineagastoId,
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.deleteLineaGastoLineaGastoProyecto(lineagastoId,
			proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoLineaGastoProyecto(long lineagastoId,
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.deleteLineaGastoLineaGastoProyecto(lineagastoId,
			lineaGastoProyecto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoLineaGastoProyectos(long lineagastoId,
		long[] proyectoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.deleteLineaGastoLineaGastoProyectos(lineagastoId,
			proyectoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoLineaGastoProyectos(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> LineaGastoProyectos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.deleteLineaGastoLineaGastoProyectos(lineagastoId,
			LineaGastoProyectos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoLineaGastoProyectos(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.getLineaGastoLineaGastoProyectos(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoLineaGastoProyectos(
		long lineagastoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.getLineaGastoLineaGastoProyectos(lineagastoId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoLineaGastoProyectos(
		long lineagastoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.getLineaGastoLineaGastoProyectos(lineagastoId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoLineaGastoProyectosCount(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.getLineaGastoLineaGastoProyectosCount(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoLineaGastoProyecto(long lineagastoId,
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.hasLineaGastoLineaGastoProyecto(lineagastoId,
			proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoLineaGastoProyectos(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoProyectoLocalService.hasLineaGastoLineaGastoProyectos(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setLineaGastoLineaGastoProyectos(long lineagastoId,
		long[] proyectoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyectoLocalService.setLineaGastoLineaGastoProyectos(lineagastoId,
			proyectoIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _lineaGastoProyectoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_lineaGastoProyectoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lineaGastoProyectoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LineaGastoProyectoLocalService getWrappedLineaGastoProyectoLocalService() {
		return _lineaGastoProyectoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLineaGastoProyectoLocalService(
		LineaGastoProyectoLocalService lineaGastoProyectoLocalService) {
		_lineaGastoProyectoLocalService = lineaGastoProyectoLocalService;
	}

	@Override
	public LineaGastoProyectoLocalService getWrappedService() {
		return _lineaGastoProyectoLocalService;
	}

	@Override
	public void setWrappedService(
		LineaGastoProyectoLocalService lineaGastoProyectoLocalService) {
		_lineaGastoProyectoLocalService = lineaGastoProyectoLocalService;
	}

	private LineaGastoProyectoLocalService _lineaGastoProyectoLocalService;
}