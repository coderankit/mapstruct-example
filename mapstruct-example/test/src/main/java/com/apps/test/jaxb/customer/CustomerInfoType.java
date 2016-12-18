/**
 * 
 */
package com.apps.test.jaxb.customer;

/**
 * @author agara
 *
 */
public class CustomerInfoType {

	private String customerId;

	private String customerName;

	private String phoneNumber;

	private MailingAddressInfo mailingAddressInfo;

	public CustomerInfoType(String customerId, String customerName, String phoneNumber,
			MailingAddressInfo mailingAddressInfo) {

		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.mailingAddressInfo = mailingAddressInfo;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public MailingAddressInfo getMailingAddressInfo() {
		return mailingAddressInfo;
	}
}