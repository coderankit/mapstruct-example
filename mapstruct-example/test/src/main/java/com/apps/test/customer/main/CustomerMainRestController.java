/**
 * 
 */
package com.apps.test.customer.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.test.domain.customer.CustomerInfo;
import com.apps.test.domain.customer.mapper.CustomerInfoMapper;
import com.apps.test.jaxb.customer.CustomerInfoType;
import com.apps.test.jaxb.customer.MailingAddressInfo;

/**
 * @author agara
 *
 */
@RestController
public class CustomerMainRestController {

	@RequestMapping("/getCustomerInfo")
	public CustomerInfo getCustomerInfo() {

		MailingAddressInfo mailingAddressInfo = new MailingAddressInfo("123 Main Street", "SFO", "CA", "94111");
		CustomerInfoType customerInfoType = new CustomerInfoType("123456", "Ankit Agarwal", "8106057152",
				mailingAddressInfo);
		return CustomerInfoMapper.INSTANCE.customerInfoTypeToCustomerInfo(customerInfoType);
	}
}