package com.apps.test.domain.customer.mapper;

import com.apps.test.domain.customer.CustomerInfo;
import com.apps.test.jaxb.customer.CustomerInfoType;
import com.apps.test.jaxb.customer.MailingAddressInfo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2016-12-18T12:33:46+0530",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_112 (Oracle Corporation)"
)
public class CustomerInfoMapperImpl implements CustomerInfoMapper {

    @Override
    public CustomerInfo customerInfoTypeToCustomerInfo(CustomerInfoType customerInfoType) {
        if ( customerInfoType == null ) {
            return null;
        }

        CustomerInfo customerInfo = new CustomerInfo();

        customerInfo.setZipCode( customerInfoTypeMailingAddressInfoZipCode( customerInfoType ) );
        customerInfo.setPhoneNumber( customerInfoType.getPhoneNumber() );
        customerInfo.setCityName( customerInfoTypeMailingAddressInfoCityName( customerInfoType ) );
        customerInfo.setCustomerId( customerInfoType.getCustomerId() );
        customerInfo.setStateCode( customerInfoTypeMailingAddressInfoStateCode( customerInfoType ) );
        customerInfo.setAddressLine( customerInfoTypeMailingAddressInfoAddressLine( customerInfoType ) );
        customerInfo.setCustomerName( customerInfoType.getCustomerName() );

        return customerInfo;
    }

    private String customerInfoTypeMailingAddressInfoZipCode(CustomerInfoType customerInfoType) {

        if ( customerInfoType == null ) {
            return null;
        }
        MailingAddressInfo mailingAddressInfo = customerInfoType.getMailingAddressInfo();
        if ( mailingAddressInfo == null ) {
            return null;
        }
        String zipCode = mailingAddressInfo.getZipCode();
        if ( zipCode == null ) {
            return null;
        }
        return zipCode;
    }

    private String customerInfoTypeMailingAddressInfoCityName(CustomerInfoType customerInfoType) {

        if ( customerInfoType == null ) {
            return null;
        }
        MailingAddressInfo mailingAddressInfo = customerInfoType.getMailingAddressInfo();
        if ( mailingAddressInfo == null ) {
            return null;
        }
        String cityName = mailingAddressInfo.getCityName();
        if ( cityName == null ) {
            return null;
        }
        return cityName;
    }

    private String customerInfoTypeMailingAddressInfoStateCode(CustomerInfoType customerInfoType) {

        if ( customerInfoType == null ) {
            return null;
        }
        MailingAddressInfo mailingAddressInfo = customerInfoType.getMailingAddressInfo();
        if ( mailingAddressInfo == null ) {
            return null;
        }
        String stateCode = mailingAddressInfo.getStateCode();
        if ( stateCode == null ) {
            return null;
        }
        return stateCode;
    }

    private String customerInfoTypeMailingAddressInfoAddressLine(CustomerInfoType customerInfoType) {

        if ( customerInfoType == null ) {
            return null;
        }
        MailingAddressInfo mailingAddressInfo = customerInfoType.getMailingAddressInfo();
        if ( mailingAddressInfo == null ) {
            return null;
        }
        String addressLine = mailingAddressInfo.getAddressLine();
        if ( addressLine == null ) {
            return null;
        }
        return addressLine;
    }
}
