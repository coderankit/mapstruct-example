/**
 * 
 */
package com.apps.test.list.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author agara
 *
 */
@RestController
public class ListToObjectRestController {

	@RequestMapping("/listToObject")
	public TargetObjectTypeClass convertListToObject() {

		SourceListTypeClass sourceListTypeClass = new SourceListTypeClass(getMyStrings(), getMyIntegers());
		return ListToOjectMapper.INSTANCE.sourceListToTargetObject(sourceListTypeClass);
	}

	private List<String> getMyStrings() {

		List<String> myStrings = new ArrayList<>();
		myStrings.add("Ankit");
		myStrings.add("Sandhya");
		myStrings.add("Raja");
		myStrings.add("Venkat");
		return myStrings;
	}

	private List<Integer> getMyIntegers() {

		List<Integer> myIntegers = new ArrayList<>();
		myIntegers.add(1);
		myIntegers.add(2);
		myIntegers.add(3);
		myIntegers.add(4);
		return myIntegers;
	}
}