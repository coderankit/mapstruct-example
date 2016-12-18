/**
 * 
 */
package com.apps.test.jaxb.customer;

/**
 * @author agara
 *
 */
public class MailingAddressInfo {

	private String addressLine;

	private String cityName;

	private String stateCode;

	private String zipCode;

	public MailingAddressInfo(String addressLine, String cityName, String stateCode, String zipCode) {

		this.addressLine = addressLine;
		this.cityName = cityName;
		this.stateCode = stateCode;
		this.zipCode = zipCode;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public String getCityName() {
		return cityName;
	}

	public String getStateCode() {
		return stateCode;
	}

	public String getZipCode() {
		return zipCode;
	}
}