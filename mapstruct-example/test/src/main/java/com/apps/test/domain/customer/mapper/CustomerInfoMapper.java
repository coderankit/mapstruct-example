/**
 * 
 */
package com.apps.test.domain.customer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.apps.test.domain.customer.CustomerInfo;
import com.apps.test.jaxb.customer.CustomerInfoType;

/**
 * @author agara
 *
 */
@Mapper
public interface CustomerInfoMapper {

	CustomerInfoMapper INSTANCE = Mappers.getMapper(CustomerInfoMapper.class);

	@Mapping(source="customerId", target="customerId")
	@Mapping(source="customerName", target="customerName")
	@Mapping(source="phoneNumber", target="phoneNumber")
	@Mapping(source="mailingAddressInfo.addressLine", target="addressLine")
	@Mapping(source="mailingAddressInfo.cityName", target="cityName")
	@Mapping(source="mailingAddressInfo.stateCode", target="stateCode")
	@Mapping(source="mailingAddressInfo.zipCode", target="zipCode")
	CustomerInfo customerInfoTypeToCustomerInfo(CustomerInfoType customerInfoType);
}