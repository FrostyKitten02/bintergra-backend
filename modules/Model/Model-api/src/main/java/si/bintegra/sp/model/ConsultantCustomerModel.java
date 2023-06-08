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

package si.bintegra.sp.model;

import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the ConsultantCustomer service. Represents a row in the &quot;SP_ConsultantCustomer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>si.bintegra.sp.model.impl.ConsultantCustomerModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>si.bintegra.sp.model.impl.ConsultantCustomerImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConsultantCustomer
 * @generated
 */
@ProviderType
public interface ConsultantCustomerModel extends BaseModel<ConsultantCustomer> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a consultant customer model instance should use the {@link ConsultantCustomer} interface instead.
	 */

	/**
	 * Returns the primary key of this consultant customer.
	 *
	 * @return the primary key of this consultant customer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this consultant customer.
	 *
	 * @param primaryKey the primary key of this consultant customer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this consultant customer.
	 *
	 * @return the ID of this consultant customer
	 */
	public long getId();

	/**
	 * Sets the ID of this consultant customer.
	 *
	 * @param id the ID of this consultant customer
	 */
	public void setId(long id);

	/**
	 * Returns the consultant ID of this consultant customer.
	 *
	 * @return the consultant ID of this consultant customer
	 */
	public Long getConsultantId();

	/**
	 * Sets the consultant ID of this consultant customer.
	 *
	 * @param consultantId the consultant ID of this consultant customer
	 */
	public void setConsultantId(Long consultantId);

	/**
	 * Returns the customer ID of this consultant customer.
	 *
	 * @return the customer ID of this consultant customer
	 */
	public Long getCustomerId();

	/**
	 * Sets the customer ID of this consultant customer.
	 *
	 * @param customerId the customer ID of this consultant customer
	 */
	public void setCustomerId(Long customerId);

	@Override
	public ConsultantCustomer cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}