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
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import es.davinciti.liferay.model.ConnectionData;
import es.davinciti.liferay.model.ConnectionDataModel;
import es.davinciti.liferay.model.ConnectionDataSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the ConnectionData service. Represents a row in the &quot;CMES_ConnectionData&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link es.davinciti.liferay.model.ConnectionDataModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ConnectionDataImpl}.
 * </p>
 *
 * @author Cmes
 * @see ConnectionDataImpl
 * @see es.davinciti.liferay.model.ConnectionData
 * @see es.davinciti.liferay.model.ConnectionDataModel
 * @generated
 */
@JSON(strict = true)
public class ConnectionDataModelImpl extends BaseModelImpl<ConnectionData>
	implements ConnectionDataModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a connection data model instance should use the {@link es.davinciti.liferay.model.ConnectionData} interface instead.
	 */
	public static final String TABLE_NAME = "CMES_ConnectionData";
	public static final Object[][] TABLE_COLUMNS = {
			{ "connectionDataId", Types.BIGINT },
			{ "companyDB", Types.VARCHAR },
			{ "username", Types.VARCHAR },
			{ "password_", Types.VARCHAR },
			{ "url", Types.VARCHAR },
			{ "server", Types.VARCHAR },
			{ "port", Types.VARCHAR },
			{ "accessToken", Types.VARCHAR },
			{ "refreshToken", Types.VARCHAR },
			{ "disableDate", Types.TIMESTAMP },
			{ "secretKey", Types.VARCHAR },
			{ "applicationToken", Types.VARCHAR },
			{ "clientId", Types.VARCHAR },
			{ "tokenType", Types.VARCHAR },
			{ "expiresIn", Types.INTEGER },
			{ "scope", Types.VARCHAR },
			{ "clavePrimaria", Types.VARCHAR },
			{ "claveSecundaria", Types.VARCHAR },
			{ "sessionId", Types.VARCHAR },
			{ "encodedClientCredentials", Types.VARCHAR },
			{ "state_", Types.VARCHAR },
			{ "webSecretKey", Types.VARCHAR },
			{ "applicationCode", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table CMES_ConnectionData (connectionDataId LONG not null primary key,companyDB VARCHAR(75) null,username VARCHAR(75) null,password_ VARCHAR(75) null,url VARCHAR(75) null,server VARCHAR(75) null,port VARCHAR(75) null,accessToken STRING null,refreshToken STRING null,disableDate DATE null,secretKey VARCHAR(75) null,applicationToken STRING null,clientId VARCHAR(75) null,tokenType VARCHAR(75) null,expiresIn INTEGER,scope VARCHAR(75) null,clavePrimaria VARCHAR(75) null,claveSecundaria VARCHAR(75) null,sessionId VARCHAR(75) null,encodedClientCredentials STRING null,state_ VARCHAR(75) null,webSecretKey VARCHAR(75) null,applicationCode VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table CMES_ConnectionData";
	public static final String ORDER_BY_JPQL = " ORDER BY connectionData.connectionDataId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMES_ConnectionData.connectionDataId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.es.davinciti.liferay.model.ConnectionData"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.es.davinciti.liferay.model.ConnectionData"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ConnectionData toModel(ConnectionDataSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		ConnectionData model = new ConnectionDataImpl();

		model.setConnectionDataId(soapModel.getConnectionDataId());
		model.setCompanyDB(soapModel.getCompanyDB());
		model.setUsername(soapModel.getUsername());
		model.setPassword(soapModel.getPassword());
		model.setUrl(soapModel.getUrl());
		model.setServer(soapModel.getServer());
		model.setPort(soapModel.getPort());
		model.setAccessToken(soapModel.getAccessToken());
		model.setRefreshToken(soapModel.getRefreshToken());
		model.setDisableDate(soapModel.getDisableDate());
		model.setSecretKey(soapModel.getSecretKey());
		model.setApplicationToken(soapModel.getApplicationToken());
		model.setClientId(soapModel.getClientId());
		model.setTokenType(soapModel.getTokenType());
		model.setExpiresIn(soapModel.getExpiresIn());
		model.setScope(soapModel.getScope());
		model.setClavePrimaria(soapModel.getClavePrimaria());
		model.setClaveSecundaria(soapModel.getClaveSecundaria());
		model.setSessionId(soapModel.getSessionId());
		model.setEncodedClientCredentials(soapModel.getEncodedClientCredentials());
		model.setState(soapModel.getState());
		model.setWebSecretKey(soapModel.getWebSecretKey());
		model.setApplicationCode(soapModel.getApplicationCode());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ConnectionData> toModels(ConnectionDataSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<ConnectionData> models = new ArrayList<ConnectionData>(soapModels.length);

		for (ConnectionDataSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final String MAPPING_TABLE_CMES_CONFIGS_DATAS_NAME = "CMES_Configs_Datas";
	public static final Object[][] MAPPING_TABLE_CMES_CONFIGS_DATAS_COLUMNS = {
			{ "configId", Types.BIGINT },
			{ "connectionDataId", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_CMES_CONFIGS_DATAS_SQL_CREATE = "create table CMES_Configs_Datas (configId LONG not null,connectionDataId LONG not null,primary key (configId, connectionDataId))";
	public static final boolean FINDER_CACHE_ENABLED_CMES_CONFIGS_DATAS = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.CMES_Configs_Datas"), true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.es.davinciti.liferay.model.ConnectionData"));

	public ConnectionDataModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _connectionDataId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setConnectionDataId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _connectionDataId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ConnectionData.class;
	}

	@Override
	public String getModelClassName() {
		return ConnectionData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("connectionDataId", getConnectionDataId());
		attributes.put("companyDB", getCompanyDB());
		attributes.put("username", getUsername());
		attributes.put("password", getPassword());
		attributes.put("url", getUrl());
		attributes.put("server", getServer());
		attributes.put("port", getPort());
		attributes.put("accessToken", getAccessToken());
		attributes.put("refreshToken", getRefreshToken());
		attributes.put("disableDate", getDisableDate());
		attributes.put("secretKey", getSecretKey());
		attributes.put("applicationToken", getApplicationToken());
		attributes.put("clientId", getClientId());
		attributes.put("tokenType", getTokenType());
		attributes.put("expiresIn", getExpiresIn());
		attributes.put("scope", getScope());
		attributes.put("clavePrimaria", getClavePrimaria());
		attributes.put("claveSecundaria", getClaveSecundaria());
		attributes.put("sessionId", getSessionId());
		attributes.put("encodedClientCredentials", getEncodedClientCredentials());
		attributes.put("state", getState());
		attributes.put("webSecretKey", getWebSecretKey());
		attributes.put("applicationCode", getApplicationCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long connectionDataId = (Long)attributes.get("connectionDataId");

		if (connectionDataId != null) {
			setConnectionDataId(connectionDataId);
		}

		String companyDB = (String)attributes.get("companyDB");

		if (companyDB != null) {
			setCompanyDB(companyDB);
		}

		String username = (String)attributes.get("username");

		if (username != null) {
			setUsername(username);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String server = (String)attributes.get("server");

		if (server != null) {
			setServer(server);
		}

		String port = (String)attributes.get("port");

		if (port != null) {
			setPort(port);
		}

		String accessToken = (String)attributes.get("accessToken");

		if (accessToken != null) {
			setAccessToken(accessToken);
		}

		String refreshToken = (String)attributes.get("refreshToken");

		if (refreshToken != null) {
			setRefreshToken(refreshToken);
		}

		Date disableDate = (Date)attributes.get("disableDate");

		if (disableDate != null) {
			setDisableDate(disableDate);
		}

		String secretKey = (String)attributes.get("secretKey");

		if (secretKey != null) {
			setSecretKey(secretKey);
		}

		String applicationToken = (String)attributes.get("applicationToken");

		if (applicationToken != null) {
			setApplicationToken(applicationToken);
		}

		String clientId = (String)attributes.get("clientId");

		if (clientId != null) {
			setClientId(clientId);
		}

		String tokenType = (String)attributes.get("tokenType");

		if (tokenType != null) {
			setTokenType(tokenType);
		}

		Integer expiresIn = (Integer)attributes.get("expiresIn");

		if (expiresIn != null) {
			setExpiresIn(expiresIn);
		}

		String scope = (String)attributes.get("scope");

		if (scope != null) {
			setScope(scope);
		}

		String clavePrimaria = (String)attributes.get("clavePrimaria");

		if (clavePrimaria != null) {
			setClavePrimaria(clavePrimaria);
		}

		String claveSecundaria = (String)attributes.get("claveSecundaria");

		if (claveSecundaria != null) {
			setClaveSecundaria(claveSecundaria);
		}

		String sessionId = (String)attributes.get("sessionId");

		if (sessionId != null) {
			setSessionId(sessionId);
		}

		String encodedClientCredentials = (String)attributes.get(
				"encodedClientCredentials");

		if (encodedClientCredentials != null) {
			setEncodedClientCredentials(encodedClientCredentials);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String webSecretKey = (String)attributes.get("webSecretKey");

		if (webSecretKey != null) {
			setWebSecretKey(webSecretKey);
		}

		String applicationCode = (String)attributes.get("applicationCode");

		if (applicationCode != null) {
			setApplicationCode(applicationCode);
		}
	}

	@JSON
	@Override
	public long getConnectionDataId() {
		return _connectionDataId;
	}

	@Override
	public void setConnectionDataId(long connectionDataId) {
		_connectionDataId = connectionDataId;
	}

	@JSON
	@Override
	public String getCompanyDB() {
		if (_companyDB == null) {
			return StringPool.BLANK;
		}
		else {
			return _companyDB;
		}
	}

	@Override
	public void setCompanyDB(String companyDB) {
		_companyDB = companyDB;
	}

	@JSON
	@Override
	public String getUsername() {
		if (_username == null) {
			return StringPool.BLANK;
		}
		else {
			return _username;
		}
	}

	@Override
	public void setUsername(String username) {
		_username = username;
	}

	@JSON
	@Override
	public String getPassword() {
		if (_password == null) {
			return StringPool.BLANK;
		}
		else {
			return _password;
		}
	}

	@Override
	public void setPassword(String password) {
		_password = password;
	}

	@JSON
	@Override
	public String getUrl() {
		if (_url == null) {
			return StringPool.BLANK;
		}
		else {
			return _url;
		}
	}

	@Override
	public void setUrl(String url) {
		_url = url;
	}

	@JSON
	@Override
	public String getServer() {
		if (_server == null) {
			return StringPool.BLANK;
		}
		else {
			return _server;
		}
	}

	@Override
	public void setServer(String server) {
		_server = server;
	}

	@JSON
	@Override
	public String getPort() {
		if (_port == null) {
			return StringPool.BLANK;
		}
		else {
			return _port;
		}
	}

	@Override
	public void setPort(String port) {
		_port = port;
	}

	@JSON
	@Override
	public String getAccessToken() {
		if (_accessToken == null) {
			return StringPool.BLANK;
		}
		else {
			return _accessToken;
		}
	}

	@Override
	public void setAccessToken(String accessToken) {
		_accessToken = accessToken;
	}

	@JSON
	@Override
	public String getRefreshToken() {
		if (_refreshToken == null) {
			return StringPool.BLANK;
		}
		else {
			return _refreshToken;
		}
	}

	@Override
	public void setRefreshToken(String refreshToken) {
		_refreshToken = refreshToken;
	}

	@JSON
	@Override
	public Date getDisableDate() {
		return _disableDate;
	}

	@Override
	public void setDisableDate(Date disableDate) {
		_disableDate = disableDate;
	}

	@JSON
	@Override
	public String getSecretKey() {
		if (_secretKey == null) {
			return StringPool.BLANK;
		}
		else {
			return _secretKey;
		}
	}

	@Override
	public void setSecretKey(String secretKey) {
		_secretKey = secretKey;
	}

	@JSON
	@Override
	public String getApplicationToken() {
		if (_applicationToken == null) {
			return StringPool.BLANK;
		}
		else {
			return _applicationToken;
		}
	}

	@Override
	public void setApplicationToken(String applicationToken) {
		_applicationToken = applicationToken;
	}

	@JSON
	@Override
	public String getClientId() {
		if (_clientId == null) {
			return StringPool.BLANK;
		}
		else {
			return _clientId;
		}
	}

	@Override
	public void setClientId(String clientId) {
		_clientId = clientId;
	}

	@JSON
	@Override
	public String getTokenType() {
		if (_tokenType == null) {
			return StringPool.BLANK;
		}
		else {
			return _tokenType;
		}
	}

	@Override
	public void setTokenType(String tokenType) {
		_tokenType = tokenType;
	}

	@JSON
	@Override
	public int getExpiresIn() {
		return _expiresIn;
	}

	@Override
	public void setExpiresIn(int expiresIn) {
		_expiresIn = expiresIn;
	}

	@JSON
	@Override
	public String getScope() {
		if (_scope == null) {
			return StringPool.BLANK;
		}
		else {
			return _scope;
		}
	}

	@Override
	public void setScope(String scope) {
		_scope = scope;
	}

	@JSON
	@Override
	public String getClavePrimaria() {
		if (_clavePrimaria == null) {
			return StringPool.BLANK;
		}
		else {
			return _clavePrimaria;
		}
	}

	@Override
	public void setClavePrimaria(String clavePrimaria) {
		_clavePrimaria = clavePrimaria;
	}

	@JSON
	@Override
	public String getClaveSecundaria() {
		if (_claveSecundaria == null) {
			return StringPool.BLANK;
		}
		else {
			return _claveSecundaria;
		}
	}

	@Override
	public void setClaveSecundaria(String claveSecundaria) {
		_claveSecundaria = claveSecundaria;
	}

	@JSON
	@Override
	public String getSessionId() {
		if (_sessionId == null) {
			return StringPool.BLANK;
		}
		else {
			return _sessionId;
		}
	}

	@Override
	public void setSessionId(String sessionId) {
		_sessionId = sessionId;
	}

	@JSON
	@Override
	public String getEncodedClientCredentials() {
		if (_encodedClientCredentials == null) {
			return StringPool.BLANK;
		}
		else {
			return _encodedClientCredentials;
		}
	}

	@Override
	public void setEncodedClientCredentials(String encodedClientCredentials) {
		_encodedClientCredentials = encodedClientCredentials;
	}

	@JSON
	@Override
	public String getState() {
		if (_state == null) {
			return StringPool.BLANK;
		}
		else {
			return _state;
		}
	}

	@Override
	public void setState(String state) {
		_state = state;
	}

	@JSON
	@Override
	public String getWebSecretKey() {
		if (_webSecretKey == null) {
			return StringPool.BLANK;
		}
		else {
			return _webSecretKey;
		}
	}

	@Override
	public void setWebSecretKey(String webSecretKey) {
		_webSecretKey = webSecretKey;
	}

	@JSON
	@Override
	public String getApplicationCode() {
		if (_applicationCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _applicationCode;
		}
	}

	@Override
	public void setApplicationCode(String applicationCode) {
		_applicationCode = applicationCode;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			ConnectionData.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ConnectionData toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ConnectionData)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ConnectionDataImpl connectionDataImpl = new ConnectionDataImpl();

		connectionDataImpl.setConnectionDataId(getConnectionDataId());
		connectionDataImpl.setCompanyDB(getCompanyDB());
		connectionDataImpl.setUsername(getUsername());
		connectionDataImpl.setPassword(getPassword());
		connectionDataImpl.setUrl(getUrl());
		connectionDataImpl.setServer(getServer());
		connectionDataImpl.setPort(getPort());
		connectionDataImpl.setAccessToken(getAccessToken());
		connectionDataImpl.setRefreshToken(getRefreshToken());
		connectionDataImpl.setDisableDate(getDisableDate());
		connectionDataImpl.setSecretKey(getSecretKey());
		connectionDataImpl.setApplicationToken(getApplicationToken());
		connectionDataImpl.setClientId(getClientId());
		connectionDataImpl.setTokenType(getTokenType());
		connectionDataImpl.setExpiresIn(getExpiresIn());
		connectionDataImpl.setScope(getScope());
		connectionDataImpl.setClavePrimaria(getClavePrimaria());
		connectionDataImpl.setClaveSecundaria(getClaveSecundaria());
		connectionDataImpl.setSessionId(getSessionId());
		connectionDataImpl.setEncodedClientCredentials(getEncodedClientCredentials());
		connectionDataImpl.setState(getState());
		connectionDataImpl.setWebSecretKey(getWebSecretKey());
		connectionDataImpl.setApplicationCode(getApplicationCode());

		connectionDataImpl.resetOriginalValues();

		return connectionDataImpl;
	}

	@Override
	public int compareTo(ConnectionData connectionData) {
		long primaryKey = connectionData.getPrimaryKey();

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

		if (!(obj instanceof ConnectionData)) {
			return false;
		}

		ConnectionData connectionData = (ConnectionData)obj;

		long primaryKey = connectionData.getPrimaryKey();

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
	}

	@Override
	public CacheModel<ConnectionData> toCacheModel() {
		ConnectionDataCacheModel connectionDataCacheModel = new ConnectionDataCacheModel();

		connectionDataCacheModel.connectionDataId = getConnectionDataId();

		connectionDataCacheModel.companyDB = getCompanyDB();

		String companyDB = connectionDataCacheModel.companyDB;

		if ((companyDB != null) && (companyDB.length() == 0)) {
			connectionDataCacheModel.companyDB = null;
		}

		connectionDataCacheModel.username = getUsername();

		String username = connectionDataCacheModel.username;

		if ((username != null) && (username.length() == 0)) {
			connectionDataCacheModel.username = null;
		}

		connectionDataCacheModel.password = getPassword();

		String password = connectionDataCacheModel.password;

		if ((password != null) && (password.length() == 0)) {
			connectionDataCacheModel.password = null;
		}

		connectionDataCacheModel.url = getUrl();

		String url = connectionDataCacheModel.url;

		if ((url != null) && (url.length() == 0)) {
			connectionDataCacheModel.url = null;
		}

		connectionDataCacheModel.server = getServer();

		String server = connectionDataCacheModel.server;

		if ((server != null) && (server.length() == 0)) {
			connectionDataCacheModel.server = null;
		}

		connectionDataCacheModel.port = getPort();

		String port = connectionDataCacheModel.port;

		if ((port != null) && (port.length() == 0)) {
			connectionDataCacheModel.port = null;
		}

		connectionDataCacheModel.accessToken = getAccessToken();

		String accessToken = connectionDataCacheModel.accessToken;

		if ((accessToken != null) && (accessToken.length() == 0)) {
			connectionDataCacheModel.accessToken = null;
		}

		connectionDataCacheModel.refreshToken = getRefreshToken();

		String refreshToken = connectionDataCacheModel.refreshToken;

		if ((refreshToken != null) && (refreshToken.length() == 0)) {
			connectionDataCacheModel.refreshToken = null;
		}

		Date disableDate = getDisableDate();

		if (disableDate != null) {
			connectionDataCacheModel.disableDate = disableDate.getTime();
		}
		else {
			connectionDataCacheModel.disableDate = Long.MIN_VALUE;
		}

		connectionDataCacheModel.secretKey = getSecretKey();

		String secretKey = connectionDataCacheModel.secretKey;

		if ((secretKey != null) && (secretKey.length() == 0)) {
			connectionDataCacheModel.secretKey = null;
		}

		connectionDataCacheModel.applicationToken = getApplicationToken();

		String applicationToken = connectionDataCacheModel.applicationToken;

		if ((applicationToken != null) && (applicationToken.length() == 0)) {
			connectionDataCacheModel.applicationToken = null;
		}

		connectionDataCacheModel.clientId = getClientId();

		String clientId = connectionDataCacheModel.clientId;

		if ((clientId != null) && (clientId.length() == 0)) {
			connectionDataCacheModel.clientId = null;
		}

		connectionDataCacheModel.tokenType = getTokenType();

		String tokenType = connectionDataCacheModel.tokenType;

		if ((tokenType != null) && (tokenType.length() == 0)) {
			connectionDataCacheModel.tokenType = null;
		}

		connectionDataCacheModel.expiresIn = getExpiresIn();

		connectionDataCacheModel.scope = getScope();

		String scope = connectionDataCacheModel.scope;

		if ((scope != null) && (scope.length() == 0)) {
			connectionDataCacheModel.scope = null;
		}

		connectionDataCacheModel.clavePrimaria = getClavePrimaria();

		String clavePrimaria = connectionDataCacheModel.clavePrimaria;

		if ((clavePrimaria != null) && (clavePrimaria.length() == 0)) {
			connectionDataCacheModel.clavePrimaria = null;
		}

		connectionDataCacheModel.claveSecundaria = getClaveSecundaria();

		String claveSecundaria = connectionDataCacheModel.claveSecundaria;

		if ((claveSecundaria != null) && (claveSecundaria.length() == 0)) {
			connectionDataCacheModel.claveSecundaria = null;
		}

		connectionDataCacheModel.sessionId = getSessionId();

		String sessionId = connectionDataCacheModel.sessionId;

		if ((sessionId != null) && (sessionId.length() == 0)) {
			connectionDataCacheModel.sessionId = null;
		}

		connectionDataCacheModel.encodedClientCredentials = getEncodedClientCredentials();

		String encodedClientCredentials = connectionDataCacheModel.encodedClientCredentials;

		if ((encodedClientCredentials != null) &&
				(encodedClientCredentials.length() == 0)) {
			connectionDataCacheModel.encodedClientCredentials = null;
		}

		connectionDataCacheModel.state = getState();

		String state = connectionDataCacheModel.state;

		if ((state != null) && (state.length() == 0)) {
			connectionDataCacheModel.state = null;
		}

		connectionDataCacheModel.webSecretKey = getWebSecretKey();

		String webSecretKey = connectionDataCacheModel.webSecretKey;

		if ((webSecretKey != null) && (webSecretKey.length() == 0)) {
			connectionDataCacheModel.webSecretKey = null;
		}

		connectionDataCacheModel.applicationCode = getApplicationCode();

		String applicationCode = connectionDataCacheModel.applicationCode;

		if ((applicationCode != null) && (applicationCode.length() == 0)) {
			connectionDataCacheModel.applicationCode = null;
		}

		return connectionDataCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{connectionDataId=");
		sb.append(getConnectionDataId());
		sb.append(", companyDB=");
		sb.append(getCompanyDB());
		sb.append(", username=");
		sb.append(getUsername());
		sb.append(", password=");
		sb.append(getPassword());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", server=");
		sb.append(getServer());
		sb.append(", port=");
		sb.append(getPort());
		sb.append(", accessToken=");
		sb.append(getAccessToken());
		sb.append(", refreshToken=");
		sb.append(getRefreshToken());
		sb.append(", disableDate=");
		sb.append(getDisableDate());
		sb.append(", secretKey=");
		sb.append(getSecretKey());
		sb.append(", applicationToken=");
		sb.append(getApplicationToken());
		sb.append(", clientId=");
		sb.append(getClientId());
		sb.append(", tokenType=");
		sb.append(getTokenType());
		sb.append(", expiresIn=");
		sb.append(getExpiresIn());
		sb.append(", scope=");
		sb.append(getScope());
		sb.append(", clavePrimaria=");
		sb.append(getClavePrimaria());
		sb.append(", claveSecundaria=");
		sb.append(getClaveSecundaria());
		sb.append(", sessionId=");
		sb.append(getSessionId());
		sb.append(", encodedClientCredentials=");
		sb.append(getEncodedClientCredentials());
		sb.append(", state=");
		sb.append(getState());
		sb.append(", webSecretKey=");
		sb.append(getWebSecretKey());
		sb.append(", applicationCode=");
		sb.append(getApplicationCode());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(73);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.ConnectionData");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>connectionDataId</column-name><column-value><![CDATA[");
		sb.append(getConnectionDataId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyDB</column-name><column-value><![CDATA[");
		sb.append(getCompanyDB());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>username</column-name><column-value><![CDATA[");
		sb.append(getUsername());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>password</column-name><column-value><![CDATA[");
		sb.append(getPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>server</column-name><column-value><![CDATA[");
		sb.append(getServer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>port</column-name><column-value><![CDATA[");
		sb.append(getPort());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accessToken</column-name><column-value><![CDATA[");
		sb.append(getAccessToken());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>refreshToken</column-name><column-value><![CDATA[");
		sb.append(getRefreshToken());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>disableDate</column-name><column-value><![CDATA[");
		sb.append(getDisableDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>secretKey</column-name><column-value><![CDATA[");
		sb.append(getSecretKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicationToken</column-name><column-value><![CDATA[");
		sb.append(getApplicationToken());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clientId</column-name><column-value><![CDATA[");
		sb.append(getClientId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tokenType</column-name><column-value><![CDATA[");
		sb.append(getTokenType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expiresIn</column-name><column-value><![CDATA[");
		sb.append(getExpiresIn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scope</column-name><column-value><![CDATA[");
		sb.append(getScope());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clavePrimaria</column-name><column-value><![CDATA[");
		sb.append(getClavePrimaria());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>claveSecundaria</column-name><column-value><![CDATA[");
		sb.append(getClaveSecundaria());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sessionId</column-name><column-value><![CDATA[");
		sb.append(getSessionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>encodedClientCredentials</column-name><column-value><![CDATA[");
		sb.append(getEncodedClientCredentials());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state</column-name><column-value><![CDATA[");
		sb.append(getState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>webSecretKey</column-name><column-value><![CDATA[");
		sb.append(getWebSecretKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicationCode</column-name><column-value><![CDATA[");
		sb.append(getApplicationCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ConnectionData.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ConnectionData.class
		};
	private long _connectionDataId;
	private String _companyDB;
	private String _username;
	private String _password;
	private String _url;
	private String _server;
	private String _port;
	private String _accessToken;
	private String _refreshToken;
	private Date _disableDate;
	private String _secretKey;
	private String _applicationToken;
	private String _clientId;
	private String _tokenType;
	private int _expiresIn;
	private String _scope;
	private String _clavePrimaria;
	private String _claveSecundaria;
	private String _sessionId;
	private String _encodedClientCredentials;
	private String _state;
	private String _webSecretKey;
	private String _applicationCode;
	private ConnectionData _escapedModel;
}